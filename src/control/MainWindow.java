package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;
import model.Personal;
import model.PersonalData;

public class MainWindow{

    @FXML
    private TextField id;

    @FXML
    void ingresar(ActionEvent event) throws Throwable {
    	//if(checkUser(id.getText())) {
    	if(id.getText().equals("1100")) {
    		init();
    	}else {
    		AlertERROR();
    		
    	}	
    		
    } 
    
    /**
     * This method checks if an user exists
     * @param id
     * @return userExists, boolean, true if the user exists, false otherwise
     */
    public boolean checkUser (String id) {
    	boolean userExists = false;
    	for(Personal personal : PersonalData.personals) {
    		if(personal.getIdPersonal().equals(id)) {
    			userExists = true;
    			break;
    		}
    	}
    			
    	return userExists;
    	
    }
    
    private Personal personal;
    public void validar() {
    	if(personal.getIdPersonal().equals(id.getText())) {
    		System.out.println("");
    	}
    }

    
    public void init()throws Exception{  
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/Entry.fxml"));
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene (parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }    	
    	
    void AlertERROR() {
    	Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("ERROR");
    	alert.setHeaderText("Error, Incorrecto");
    	alert.setContentText("Ooops, The document I entered does not correspond to a welfare student!");

    	alert.showAndWait();
    }
		
}

