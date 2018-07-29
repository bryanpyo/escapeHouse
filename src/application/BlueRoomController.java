package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BlueRoomController {
	@FXML
	private VBox settingsBox;
	
	@FXML
	private Button redRoomBtn;
	
	@FXML
	private Button blueRoomBtn;
	
	private boolean settingsState = false;
	
	public void makeSettingsVisible(ActionEvent event) {
		if (settingsState == false) {
			settingsBox.setVisible(true);
			settingsState = true;
		}else {
			settingsBox.setVisible(false);
			settingsState = false;
		}
	}
	
	public void toGreenRoom(ActionEvent event) throws IOException {
		Parent greenRoomParent = FXMLLoader.load(getClass().getResource("/application/GreenRoom.fxml"));
		Scene greenRoom = new Scene(greenRoomParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(greenRoom);
		window.show();
	}
	
	public void toRedRoom(ActionEvent event) throws IOException {
		Parent redRoomParent = FXMLLoader.load(getClass().getResource("/application/RedRoom.fxml"));
		Scene redRoom = new Scene(redRoomParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(redRoom);
		window.show();
	}
	
	public void closeApp(ActionEvent event) {
		System.exit(0);
	}
}
