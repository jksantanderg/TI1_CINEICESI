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
import model.Movie;
import model.MovieData;
import model.Student;
import model.StudentData;

public class Entry implements Initializable{

    @FXML
    private TableView<Movie> filmTable;

    @FXML
    private TableColumn<Movie, String> nameTC;

    @FXML
    private TableColumn<Movie, String> dateTC;

    @FXML
    private TableColumn<Movie, String> hourTC;

    @FXML
    private TableColumn<Movie, String> durationTC;

    @FXML
    private TableColumn<Movie, String> hallTC;
    
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
    
    	
    	MovieData.data.add(new Movie("Toy Story","2021-01-24","14:00","2:30","MiniSala"));
    	
    	
    	filmTable.setItems(MovieData.data);
    	
    	filmTable.setOnMouseClicked(event ->{
    		Movie stClicked = filmTable.getSelectionModel().getSelectedItem();
    		System.out.println(stClicked.getName());
    		
    		
    	});
    	
    	
	}
	
	 @FXML
	    void exit(ActionEvent event) {
	    	Platform.exit();
	    	System.exit(0);
	    }
}
