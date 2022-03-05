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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import main.Main;
import model.Film;
import model.FilmData;
import model.Student;
import model.StudentData;

public class Entry implements Initializable{

    @FXML
    private TableView<Film> filmTable;

    @FXML
    private TableColumn<Film, String> nameTC;

    @FXML
    private TableColumn<Film, String> dateTC;

    @FXML
    private TableColumn<Film, String> hourTC;

    @FXML
    private TableColumn<Film, String> durationTC;

    @FXML
    private TableColumn<Film, String> hallTC;
    
    @FXML
    private TextField nameTF;

    @FXML
    private TextField idTF;
    
    //private Film stClicked;
    
    @FXML
    void RegisterFuntions(ActionEvent event)  throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/RegisterFunctions.fxml"));
		loader.setController(new RegisterFunctions());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene (parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }

    @FXML
    void RegisterEvent(ActionEvent event) throws IOException {
    	RegistarStudent();	
    	 
    }
    void RegistarStudent() {
    	String name = nameTF.getText();
    	String id = idTF.getText();
    	
    	Student st = new Student(name,id);
    	StudentData.data.add(st);
    	
   	
    	Stage stage = (Stage) nameTF.getScene().getWindow();
    	stage.close();   
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
		dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
		hourTC.setCellValueFactory(new PropertyValueFactory<>("hour"));
		durationTC.setCellValueFactory(new PropertyValueFactory<>("duration"));
		hallTC.setCellValueFactory(new PropertyValueFactory<>("hall"));
    
    	
    	FilmData.data.add(new Film("Toy Story","2021-01-24","14:00","2:30","MiniSala"));
    	
    	
    	filmTable.setItems(FilmData.data);
    	
    	filmTable.setOnMouseClicked(event ->{
    		Film stClicked = filmTable.getSelectionModel().getSelectedItem();
    		System.out.println(stClicked.getName());
    		
    		
    	});
    	
    	
	}
	
	 @FXML
	    void exit(ActionEvent event) {
	    	Platform.exit();
	    	System.exit(0);
	    }
}
