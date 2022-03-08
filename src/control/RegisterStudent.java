package control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import main.Main;
import model.Student;
import model.StudentData;

public class RegisterStudent implements Initializable{

    @FXML
    private TextField nameTF;

    @FXML
    private TextField idTF;
    
    @FXML
    void register(ActionEvent event) {
    	if(nameTF.getText().equals("")) {
    		AlertERROR();
    		
    	}else if (idTF.getText().equals("")){
    		AlertERROR();	
    	}else {
    		AlertOk();
    		reg();
    	}
    }
    	
    public void reg() {
    	String name = nameTF.getText();
    	String id = idTF.getText();
    	
    	Student st = new Student(name,id);
    	StudentData.data.add(st);
    	
   	
    	Stage stage = (Stage) nameTF.getScene().getWindow();
    	stage.close(); 
    }

    @FXML
    void Return(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/Entry.fxml"));
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene (parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }
    
    @FXML
    void Exit(ActionEvent event) {
    	Platform.exit();
    	System.exit(0);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
    void AlertERROR() {
    	Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("ERROR");
    	alert.setHeaderText("Error, Incomplet");
    	alert.setContentText("Ooops, a field is missing!");

    	alert.showAndWait();
    }
    
    void AlertOk() {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("add of film");
    	alert.setHeaderText("SUCCESSFUL");
    	alert.setContentText("movie added SUCCESSFULLY!!");

    	alert.showAndWait();
    }

}

