package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
    
    /**
     * the method id main
     *
     */
	public static void main(String[] args) {
		launch(args);
		
		//PersonalData data = new PersonalData();
		//data.saveData();
		//data.LoadData();
		
	}
    
    /**
     * the method start
     *	@param primaryStage
     *	@throws Exception
     */
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/MainWindow.fxml"));
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene (parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();

	}
}
