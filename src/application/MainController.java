package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

public class MainController implements Initializable{
	@FXML
	Button otherBtn;
	
	public void CloseApp(ActionEvent event){
		System.exit(0);
	}
	public void start(ActionEvent event) throws IOException{
		Parent redRoomParent = FXMLLoader.load(getClass().getResource("/application/RedRoom.fxml"));
		Scene redRoom = new Scene(redRoomParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(redRoom);
		window.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	public void printGreeting(ActionEvent event) {
		System.out.println("hello");
	}
	
	public void makeVisible(ActionEvent event) {
		otherBtn.setVisible(true);
	}
	
	public void makeNotVisible(ActionEvent event) {
		otherBtn.setVisible(false);
	}

}
