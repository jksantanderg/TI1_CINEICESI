package control;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.Main;

public class Entry implements Initializable{

	/**
	 * this method directs you to the Event window where you can select your seat in the function
	 * the method initialize 
	 * @param event
	 * @throws IOException
	 */
	 @FXML
	    void Event(ActionEvent event)  throws IOException {
	    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/Event.fxml"));
			//loader.setController(new RegisterFunctions());
			Parent parent = (Parent) loader.load();
			Scene scene = new Scene (parent);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
	    }
	 

	 /**
		 * this method directs you to the RegisterFunctios window where you can select your seat in the function
		 * the method initialize 
		 * @param event
		 * @throws IOException
		 */	
	 
	@FXML
	
    void RegisterFuntions(ActionEvent event)  throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/RegisterFunctions.fxml"));
		//loader.setController(new RegisterFunctions());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene (parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }

	/**
	 *the method initialize
	 * @param location
	 * @param resources
	 *
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
}