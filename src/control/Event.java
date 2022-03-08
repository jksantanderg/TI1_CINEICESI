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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import main.Main;
import model.Chair;
import model.Cinema;
import model.CinemaData;
import model.Movie;
import model.MovieData;
import model.RoomType;
import model.Student;
import model.StudentData;

public class Event implements Initializable{

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
    
    private  Movie stClicked;
    private Student stClickedS;
    
    void RegistarCinema() {
    	RegistarInMovie();
    	Movie stClicked = filmTable.getSelectionModel().getSelectedItem();
    	RoomType  room = null;
    	Cinema cinema = null;
    	if(stClicked.getHall().equals("MiniSala")) {
    		System.out.println(stClicked.getHall());
    		 room = RoomType.MiniSala;
    	}else if(stClicked.getHall().equals("SalaMedia")) {
    		System.out.println(stClicked.getHall());
    		 room = RoomType.SalaMedia;
    		
    	}
    	Cinema st = new Cinema(stClicked, cinema.students,cinema.chairs,room);
    	CinemaData.cinemas.add(st);
    	
    	
    }

    void RegistarInMovie() {
    	Cinema data = new Cinema();
    	Student student = stClickedS;
    	data.EnrollStudent(student);
    }
    
    @FXML
    void RegisterEvent(ActionEvent event) throws IOException {
    	//RegistarInMovie();
    	SelecRoom();
    	
    	
    	
    	
    }
    
    void SelecRoom() throws IOException {
    	Movie stClicked = filmTable.getSelectionModel().getSelectedItem();
		
    	if(stClicked.getHall().equals("MiniSala")) {
    		System.out.println(stClicked.getHall());
    		MiniSala();
    	}else if(stClicked.getHall().equals("SalaMedia")) {
    		System.out.println(stClicked.getHall());
    		SalaMedia();
    	}
    		
    }
    
    void MiniSala()  throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/MiniSala.fxml"));
		//loader.setController(new MiniSala());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene (parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }
    

    void SalaMedia()  throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/SalaMedia.fxml"));
		//loader.setController(new RegisterFunctions());
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
    	
    	
	}

}
