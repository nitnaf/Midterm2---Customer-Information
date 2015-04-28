package ch.makery.address;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

// HOW DO I ADD ITEMS TO MY COMBOBOX??

public class Main extends Application {
	
	private Stage primaryStage;
	private AnchorPane customerUI;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Customer Information");
      
        // somehow load combobox with information
        showCustomerUI();
    }
    
    
    public void showCustomerUI() {
    try {
       
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/CustomerUI.fxml"));
        customerUI = (AnchorPane) loader.load();

       
        Scene scene = new Scene(customerUI);
        primaryStage.setScene(scene);
        primaryStage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public Stage getPrimaryStage() {
        return primaryStage;
    }
     
	public static void main(String[] args) {
		launch(args);
	}
}
