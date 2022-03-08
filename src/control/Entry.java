package control;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import main.Main;
import model.Chair;
import model.Cinema;
import model.Movie;
import model.MovieData;
import model.Student;
import model.StudentData;

public class Entry implements Initializable{

    @FXML
    private TableView<Movie> filmTable;

    @FXML
    private TableColumn<Movie, String> nameMovieTC;

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
    
    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> nameTC;

    @FXML
    private TableColumn<Student, String> idTC;
    
    @FXML
    private Label movieLbl;
    private Chair chair;
    @FXML
    private Label studentLbl;
    
    private Movie stClicked;
    private Student stClickedS;
    
    void RegistarCinema() {
    	
    	//Cinema st = new Cinema(stClicked, stClickedS,chair,room));
    	//CinemaData.data.add(st);
    	
    	
    }

    void RegistarInMovie() {
    	Cinema data = new Cinema();
    	Student student = stClickedS;
    	data.EnrollStudent(student);
    }
    
    @FXML
    void RegisterEvent(ActionEvent event) throws IOException {
    	//RegistarInMovie();	
    	
    }
    
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
    @FXML
    void RegisterStudent(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/RegisterStudent.fxml"));
		//loader.setController(new RegisterStudent());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene (parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }
   
   

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		nameMovieTC.setCellValueFactory(new PropertyValueFactory<>("nameMovie"));
		dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
		hourTC.setCellValueFactory(new PropertyValueFactory<>("hour"));
		durationTC.setCellValueFactory(new PropertyValueFactory<>("duration"));
		hallTC.setCellValueFactory(new PropertyValueFactory<>("hall"));
    
    	
    	MovieData.data.add(new Movie("Toy Story","2021-01-24","14:00","2:30","MiniSala"));
    	
    	
    	filmTable.setItems(MovieData.data);
    	
    	filmTable.setOnMouseClicked(event ->{
    		Movie stClicked = filmTable.getSelectionModel().getSelectedItem();
    		System.out.println(stClicked.getNameMovie());
    		
    		movieLbl.setText(stClicked.getNameMovie());
    		
    		
    	});
    	
		nameTC.setCellValueFactory(new PropertyValueFactory<>("name"));
		idTC.setCellValueFactory(new PropertyValueFactory<>("id"));
    	
    	StudentData.data.add(new Student("Jessica","123456"));
    	
    	
    	studentTable.setItems(StudentData.data);
    	
    	studentTable.setOnMouseClicked(event ->{
    		Student stClickedS = studentTable.getSelectionModel().getSelectedItem();
    		System.out.println(stClickedS.getName());
    		
    		studentLbl.setText(stClickedS.getName());

    	});
    	
    	
	}
	
	 @FXML
	    void exit(ActionEvent event) {
	    	Platform.exit();
	    	System.exit(0);
	    }
}
