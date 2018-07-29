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
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreenRoomController implements Initializable{	
	@FXML
	private AnchorPane otherPane;
	
	@FXML
	private AnchorPane mainPane;
	
	@FXML
	private VBox settingsMenu;
	
	@FXML
	private ImageView helpImage;
	
	private boolean settingsState = false;
	
	
	
	public void goToBlue(ActionEvent event) throws IOException{
		Parent blueRoomParent = FXMLLoader.load(getClass().getResource("/application/BlueRoom.fxml"));
		Scene blueRoom = new Scene(blueRoomParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(blueRoom);
		window.show();
	}
	public void goToRed(ActionEvent event) throws IOException{
		Parent redRoomParent = FXMLLoader.load(getClass().getResource("/application/RedRoom.fxml"));
		Scene redRoom = new Scene(redRoomParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(redRoom);
		window.show();
	}
	
	//settings methods
	public void showSettingsMenu(ActionEvent event) {
		if (settingsState == false) {
			otherPane.setVisible(true);
			settingsMenu.setVisible(true);
			mainPane.setOpacity(0.2);
			settingsState = true;
		}else {
			otherPane.setVisible(false);
			settingsMenu.setVisible(false);
			mainPane.setOpacity(1);
			settingsState = false;
			helpImage.setVisible(false);
		}
		
	}
	
	public void goToMain(ActionEvent event) throws IOException{
		Parent homeParent = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
		Scene home = new Scene(homeParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(home);
		window.show();
	}
	
	public void showHelp(ActionEvent event){
		helpImage.setVisible(true);
	}
	
	public void hideHelp(MouseEvent mouseEvent){
		helpImage.setVisible(false);
	}
	
	public void exitGame(ActionEvent event) {
		System.exit(0);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
}
