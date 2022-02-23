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
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;
import model.Film;
import model.FilmData;


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
    private MenuButton salaMB;

    @FXML
    private CheckMenuItem MiniSala;

    @FXML
    private CheckMenuItem SalaMedia;

    
    @FXML
    void register(ActionEvent event) {
    	String name = nameFilmTF.getText();
   	 	String date = dateP.getPromptText();
   	 	String hour  = hourTF.getText();
   	 	String duration  = durationTF.getText();
   	 	String hall = "Sala";
   	 	
   	
   	 	Film st = new Film(name,date,hour,duration,hall);
   	 	FilmData.data.add(st);
   	
   	 	Stage stage = (Stage) nameFilmTF.getScene().getWindow();
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
		// TODO Auto-generated method stub
		
	}

   
}
