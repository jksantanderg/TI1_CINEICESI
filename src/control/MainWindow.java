package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;

public class MainWindow{

    @FXML
    private TextField id;

    @FXML
    void ingresar(ActionEvent event) throws Throwable {
    	if(id.getText().equals("")) {
    		System.out.println("error");
    	}else {
    		init();
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
    	
		
		
    }

