package control;

import java.awt.event.MouseAdapter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import main.Main;
import model.ChairData;

public class MiniSala {
	
    @FXML
    private RadioButton A1;

    @FXML
    private RadioButton A2;

    @FXML
    private RadioButton A3;

    @FXML
    private RadioButton A4;

    @FXML
    private RadioButton A5;

    @FXML
    private RadioButton A6;

    @FXML
    private RadioButton A7;
    
    @FXML
    private RadioButton B1;

    @FXML
    private RadioButton B2;

    @FXML
    private RadioButton B3;

    @FXML
    private RadioButton B4;

    @FXML
    private RadioButton B5;

    @FXML
    private RadioButton B6;

    @FXML
    private RadioButton B7;
    
    @FXML
    private RadioButton C1;

    @FXML
    private RadioButton C2;

    @FXML
    private RadioButton C3;

    @FXML
    private RadioButton C4;

    @FXML
    private RadioButton C5;

    @FXML
    private RadioButton C6;

    @FXML
    private RadioButton C7;
    
    @FXML
    private RadioButton D1;

    @FXML
    private RadioButton D2;

    @FXML
    private RadioButton D3;

    @FXML
    private RadioButton D4;

    @FXML
    private RadioButton D5;

    @FXML
    private RadioButton D6;

    @FXML
    private RadioButton D7;
    
    public void estado() throws Exception {	
    	
    	if(A1.isSelected()) {
    		//myLabel.setText(A1.getText());
    		A1.setDisable(true);
    	}
    	else if(A2.isSelected()) {
    		A2.setDisable(true);
    	}else if (A3.isSelected()) {
    		A3.setDisable(true);
    	}else if(A4.isSelected()) {
    		A4.setDisable(true);
    	}else if (A5.isSelected()) {
    		A5.setDisable(true);
    	}else if(A6.isSelected()) {
    		A6.setDisable(true);
    	}else if (A7.isSelected()) {
    		A7.setDisable(true);
    	}
    	else if(B1.isSelected()) {
    		B1.setDisable(true);
    	}else if(B2.isSelected()) {
    		B2.setDisable(true);
    	}else if (B3.isSelected()) {
    		B3.setDisable(true);
    	}else if(B4.isSelected()) {
    		B4.setDisable(true);
    	}else if (B5.isSelected()) {
    		B5.setDisable(true);
    	}else if(B6.isSelected()) {
    		B6.setDisable(true);
    	}else if (B7.isSelected()) {
    		B7.setDisable(true);
    	}
    	else if(C1.isSelected()) {
    		C1.setDisable(true);
    	}else if(C2.isSelected()) {
    		C2.setDisable(true);
    	}else if (C3.isSelected()) {
    		C3.setDisable(true);
    	}else if(C4.isSelected()) {
    		C4.setDisable(true);
    	}else if (C5.isSelected()) {
    		C5.setDisable(true);
    	}else if(C6.isSelected()) {
    		C6.setDisable(true);
    	}else if (C7.isSelected()) {
    		C7.setDisable(true);
    	}
    	else if(D1.isSelected()) {
    		D1.setDisable(true);
    	}else if(D2.isSelected()) {
    		D2.setDisable(true);
    	}else if (D3.isSelected()) {
    		D3.setDisable(true);
    	}else if(D4.isSelected()) {
    		D4.setDisable(true);
    	}else if (D5.isSelected()) {
    		D5.setDisable(true);
    	}else if(D6.isSelected()) {
    		D6.setDisable(true);
    	}else if (D7.isSelected()) {
    		D7.setDisable(true);
    	}
	
    }
    


    @FXML
    void reserve(ActionEvent event) throws Exception {
    	estado();
    	AlertOk();
    	//init();
    	
    }
    
    public void init()throws Exception{  
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/Entry.fxml"));
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene (parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }  
    void AlertOk() {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("RESERVE");
    	alert.setHeaderText("SUCCESSFUL");
    	alert.setContentText("reserve SUCCESSFULLY!!");

    	alert.showAndWait();
    }

}

