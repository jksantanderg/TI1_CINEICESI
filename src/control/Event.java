package control;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import main.Main;
import model.Chair;
import model.ChairData;
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
 
    @FXML
    private Label studentLbl;
    
    private  Movie stClicked;

    

	/**
	 * this method creates an event
	 * @param event
	 */
    @FXML
    void RegisterEvent(ActionEvent event) throws IOException {
    	Movie stClicked = filmTable.getSelectionModel().getSelectedItem();
    	  	
    	if(stClicked!=null) {
    		if(nameTF.getText().equals("")) {
        		AlertERROR();
        		
        	}else if (idTF.getText().equals("")){
        		AlertERROR();	
        	}else {
        		SelecRoom();
        	}
    		
    	}else {
    		AlertMovie();
    		System.out.println("Seleccione un Movie");
        	}
    }

    
	/**
	 * this method addresses it for the type of room
	 * 
	 */
    void SelecRoom() throws IOException {
    	Movie stClicked = filmTable.getSelectionModel().getSelectedItem();
    	Stage stage = (Stage) nameTF.getScene().getWindow();
    	stage.close();	
    	if(stClicked.getHall().equals("MiniSala")) {
    		System.out.println(stClicked.getHall());
    		MiniSala();
    		minisala();
    	}else if(stClicked.getHall().equals("SalaMedia")) {
    		System.out.println(stClicked.getHall());
    		SalaMedia();
    		salamedia();
    	}
    	
    }
    
	/**
	 * this method creates an event with room type MiniSala
	 *
	 */
    void minisala() {
    	CinemaData cm = new CinemaData();
    	
    	
    	Movie stClicked = filmTable.getSelectionModel().getSelectedItem();
    	;
    	
    	ArrayList<Student> st = StudentData.data;
    	ArrayList<Chair> ch = ChairData.data;
    	
    	Cinema cinema = new Cinema (stClicked,RoomType.MiniSala,st,ch);
    	cm.addCinema(cinema);
    	CinemaData.cinemas.add(cinema);
    	
    	
    }
    
	/**
	 * this method creates an event with room type SalaMedia
	 * 
	 */
    void salamedia() {
    	CinemaData cm = new CinemaData();
    	
    	
    	Movie stClicked = filmTable.getSelectionModel().getSelectedItem();
    	;
    	
    	ArrayList<Student> st = StudentData.data;
    	ArrayList<Chair> ch = ChairData.data;
    	
    	Cinema cinema = new Cinema (stClicked,RoomType.SalaMedia,st,ch);
    	cm.addCinema(cinema);
    	CinemaData.cinemas.add(cinema);
    	
    }
	/**
	 * this method directs you to the mini-room window where you can select your seat in the function
	 *
	 */
    void MiniSala()  throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/MiniSala.fxml"));
		//loader.setController(new MiniSala());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene (parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }
    
	/**
	 * this method directs you to the mini-room window where you can select your seat in the function
	 *
	 */
    void SalaMedia()  throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/SalaMedia.fxml"));
		//loader.setController(new RegisterFunctions());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene (parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }
    

   
   
	/**
	 * this method allows to display the elements of an arrayList in a table view
	 * @param location
	 * @param resources
	 */
    
    @FXML
    void register(ActionEvent event) throws IOException {
    	
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
    	StudentData.dat.add(st);
    	StudentData.data.add(st);
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
	
    void AlertMovie() {
    	Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("ERROR");
    	alert.setHeaderText("Error, Incomplet");
    	alert.setContentText("Ooops, select a movie!");

    	alert.showAndWait();
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
