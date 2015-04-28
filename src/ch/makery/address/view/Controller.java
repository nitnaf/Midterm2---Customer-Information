package ch.makery.address.view;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;

import ch.makery.address.Main;
import ch.makery.address.model.Customer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

public class Controller{
	
	@FXML
	private TextField firstName;
	@FXML
	private TextField middleInt;	
	@FXML
	private TextField lastName;
	@FXML
	private RadioButton male;
	@FXML
	private RadioButton female;
	@FXML
	private TextField address;	
	@FXML
	private TextField city; 
	@FXML
	private ComboBox state;
	@FXML
	private TextField zip;	
	@FXML
	private Button save;
	@FXML
	private Button clear;
	@FXML
	private ToggleGroup gender;
	@FXML
	ArrayList<Customer> listOfCustomers = new ArrayList <Customer>();
	@FXML
	private Main main;
	
	ObservableList<String> options = 
		    FXCollections.observableArrayList(
		        "Option 1",
		        "Option 2",
		        "Option 3"
		    );
	
	public void loadBox(){
		state.setItems(options);
	}
	
	@FXML
	private void pressSave(){
		Customer x = new Customer();
		
		x.setFirstName(firstName.getText());
		x.setMiddileInt(middleInt.getText());
		x.setLastName(lastName.getText());
		// setGender
		x.setAddress(address.getText());
		x.setCity(city.getText());
		//x.setState(state.getValue().toString());
		x.setZip(Byte.parseByte(zip.getText()));
		
		listOfCustomers.add(x);
	}
	
	@FXML
	private void pressClear(){
		
		firstName.clear();
		middleInt.clear();
		lastName.clear();
		// Reset Male button
		// Reset Female button
		address.clear();
		city.clear();
		// Reset ComboBox
		zip.clear();
		
		
		
	}
	
}

