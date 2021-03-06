package control;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import main.Main;
import model.Movie;
import model.MovieData;
import model.RoomType;


public class RegisterFunctions implements Initializable {
	
    @FXML
    private TextField nameFilmTF;

    @FXML
    private DatePicker dateP;

    @FXML
    private TextField hourTF;

    @FXML
    private TextField durationTF;


    @FXML
    private ComboBox<String> hallCB;


    /**
     *the method verify if the parameters is all good  
	 * if is all ok shows the alert ok, but if isn?t shows the alert error
	 * @param event
     *
     */ 
    @FXML
    void register(ActionEvent event) {
    	if(nameFilmTF.getText().equals("")) {
    		AlertERROR();
    		
    	}else if (dateP.getValue() == (null)){
    		AlertERROR();	
    	}else if (hourTF.getText().equalsIgnoreCase("")) {
    		AlertERROR();
    	}else if (durationTF.getText().equalsIgnoreCase("")) {
    		AlertERROR();
    	}else if (hallCB.getSelectionModel().getSelectedItem() == (null)) {
    		AlertERROR();
    	}else {
    		AlertOk();
    		reg();
    		
    	}
    }

    /**
     *the method register a movie with the parameters that the user gave 
     *
     */
    void reg() {
    	//ComboBox,getSelectionModel().getSelectedItem();
    	String name = nameFilmTF.getText();
    	LocalDate myDate = dateP.getValue();
    	String date = myDate.toString();
   	 	String hour  = hourTF.getText();
   	 	String duration  = durationTF.getText();
   	 	String hall = hallCB.getSelectionModel().getSelectedItem();
   	 	
   	 	Movie st = new Movie(name,date,hour,duration,hall);
	 	MovieData.data.add(st);
	
   	 	
   	 	Stage stage = (Stage) nameFilmTF.getScene().getWindow();
   	 	stage.close();
   	 	
    }

    /**
     *the method returns a previous function
     * @param event
     * @throws IOException
     */    
    @FXML
    void Return(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/Entry.fxml"));
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene (parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }
   /**
    * the method  close the program
    * @param event
    */
    @FXML
    void Exit(ActionEvent event) {
    	Platform.exit();
    	System.exit(0);
    }
	/**
	 *the method initialize
	 *in this method the combobox options are created
	 * @param location
	 * @param resources
	 *
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {

    	ArrayList<String>list = new ArrayList<>();
    	Collections.addAll(list, new String[]{"MiniSala","SalaMedia"});
    	
    	hallCB.getItems().addAll(list);
		
	}
	/**
	 * is a alert that say if the parameters that the user give  is incomplete
	 */
	
    void AlertERROR() {
    	Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("ERROR");
    	alert.setHeaderText("Error, Incomplet");
    	alert.setContentText("Ooops, a field is missing!");

    	alert.showAndWait();
    }
    /**
     * is a alert that say if the parameters that the user give is all good  
     */
    void AlertOk() {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("add of film");
    	alert.setHeaderText("SUCCESSFUL");
    	alert.setContentText("movie added SUCCESSFULLY!!");

    	alert.showAndWait();
    }
   
}
