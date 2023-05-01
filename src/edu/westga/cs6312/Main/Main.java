package edu.westga.cs6312.Main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import edu.westga.cs6312.Model.Home;
import edu.westga.cs6312.Model.Sorting;
import edu.westga.cs6312.Service.DataService;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {
	private TextField city = new TextField();
	private TextField state = new TextField();
	private TextField zip = new TextField();
	private TextField bedroom = new TextField();
	private TextField bathroom = new TextField();
	private TextField sqft = new TextField();
	private TextField minPrice = new TextField();
	private TextField maxPrice = new TextField();
	private ComboBox<String> cbo = new ComboBox<>();
	private Button executeSearch = new Button("Execute Search");
	private Button outputSearch = new Button("Output Results");
	private Text outputResults = new Text();
	private Text cityError = new Text();
	private Text stateError = new Text();
	private Text zipError = new Text();
	private Text bedroomError = new Text();
	private Text bathroomError = new Text();
	private Text sqftError = new Text();
	private Text minPriceError = new Text();
	private Text maxPriceError = new Text();

	

	public static void main(String[] args)
			throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		Home home = new Home("123 Home", "Way", "Canton", "GA", "30000", 2, 3, 1200, 200000);

		System.out.println(home.toString());

		DataService.readHomeJSON();

		System.out.println(DataService.readHomeJSON()[999].getCity());

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Set stage size to take up 50% of the viewport
		Screen screen = Screen.getPrimary();
		Rectangle2D bounds = screen.getVisualBounds();
		BorderPane root = new BorderPane();
		root.setPrefSize(bounds.getWidth() / 2, bounds.getHeight());

		// Set header
		Text header = new Text("Home Search by Justin Maxwell");
		header.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
		root.setTop(header);
		BorderPane.setAlignment(header, Pos.CENTER);
		
		//Create controls
		GridPane form = new GridPane();
		form.setHgap(5);
	    form.setVgap(5);
	    
	    form.add(new Label("Select filter:"), 0, 0);
	   
	    
	    this.cbo.getItems().addAll("City, State, Zip", "Bedroom, Bathroom", "Square Feet", "Minimum Price, Maximum Price");
	    this.cbo.setValue("City, State, Zip");
	    form.add(cbo, 1, 0);
	    
	    form.add(new Label("Enter filter criteria:"), 0, 1);
	    form.add(new Label("City:"), 0, 2);
	    form.add(this.city, 1,2);
	    form.add(this.cityError, 2, 2);
	    form.add(new Label("State:"), 0, 3);
	    form.add(this.state, 1, 3);
	    form.add(this.stateError, 2, 3);
	    form.add(new Label("Zip:"), 0, 4);
	    form.add(this.zip, 1, 4);
	    form.add(this.zipError, 2, 4);
	    form.add(new Label("Bedroom:"), 0, 5);
	    form.add(this.bedroom, 1, 5);
	    form.add(this.bedroomError, 2, 5);
	    form.add(new Label("Bathroom:"), 0, 6);
	    form.add(this.bathroom, 1, 6);
	    form.add(this.bathroomError, 2, 6);
	    form.add(new Label("Square Foot:"), 0, 7);
	    form.add(this.sqft, 1, 7);
	    form.add(this.sqftError, 2, 7);
	    form.add(new Label("Minimum Price:"), 0, 8);
	    form.add(this.minPrice, 1, 8);
	    form.add(this.minPriceError, 2, 8);
	    form.add(new Label("Maximum Price:"), 0, 9);
	    form.add(this.maxPrice, 1, 9);
	    form.add(this.maxPriceError, 2, 9);
	    form.add(this.executeSearch, 0, 10);
	    form.add(this.outputSearch, 1, 10);
	    
	    //Output results to GUI
	    //this.outputResults.setText(DataService.readHomeJSON()[999].toString() + "\n" + String.valueOf(DataService.readHomeJSON()[999]));  
	    ScrollPane scrollPane = new ScrollPane(this.outputResults);
	    scrollPane.setPrefSize(300, 300);
	    form.add(scrollPane, 0, 11, 2, 2);
	    
	    //align form in BorderPane
	    form.setAlignment(Pos.CENTER);
		root.setCenter(form);
		
		//this.executeSearch.setOnAction(e -> this.outputResults.setText(Sorting.test()));
		this.executeSearch.setOnAction(e -> this.validate());
		
		//Set and initiate scene
		Scene mainScene = new Scene(root);
		primaryStage.setTitle("Home Search by Justin Maxwell");
		primaryStage.setScene(mainScene);
		primaryStage.show();

	}
	
	private void validate() {
		
		this.cityError.setText("");
		this.stateError.setText("");
		this.zipError.setText("");
		this.bedroomError.setText("");
		this.bathroomError.setText("");
		this.sqftError.setText("");
		this.minPriceError.setText("");
		this.maxPriceError.setText("");
				
		if (this.cbo.getValue() == "City, State, Zip") {
			if (this.city.getText().isEmpty()) {
				this.cityError.setText("City cannot be empty");
				System.out.println("City cannot be empty");
			} else {
				this.cityError.setText("");
			}
			
			if (this.state.getText().isEmpty()) {
				this.stateError.setText("State cannot be empty");
				System.out.println("State cannot be empty");
			} else {
				this.stateError.setText("");
			}
			
			if (this.zip.getText().isEmpty()) {
				this.zipError.setText("Zip cannot be empty");
				System.out.println("Zip cannot be empty");
			} else {
				this.zipError.setText("");
			}
		}
		
		if (this.cbo.getValue() == "Bedroom, Bathroom") {
			try {
		    	Integer.parseInt(this.bedroom.getText());
		    	this.bedroomError.setText("");
		    } catch (NumberFormatException e) {
		    	System.out.println("Bedroom is not a number.");
		    	this.bedroomError.setText("Must be a number");
		    }
			
			try {
		    	Integer.parseInt(this.bathroom.getText());
		    	this.bathroomError.setText("");
		    } catch (NumberFormatException e) {
		    	System.out.println("Bathroom is not a number.");
		    	this.bathroomError.setText("Must be a number");
		    }
		}
		
		
		if (this.cbo.getValue() == "Square Feet") {
			try {
		    	Integer.parseInt(this.sqft.getText());
		    	this.sqftError.setText("");
		    } catch (NumberFormatException e) {
		    	System.out.println("Square Foot is not a number.");
		    	this.sqftError.setText("Must be a number");
		    }
		}
		
		if (this.cbo.getValue() == "Minimum Price, Maximum Price") {
			
			try {
		    	Double.parseDouble(this.minPrice.getText());
		    	this.minPriceError.setText("");
		    } catch (NumberFormatException e) {
		    	System.out.println("Minumum Price is not a number.");
		    	this.minPriceError.setText("Must be a number");
		    }
			
			try {
		    	Double.parseDouble(this.maxPrice.getText());
		    	this.maxPriceError.setText("");
		    } catch (NumberFormatException e) {
		    	System.out.println("Maximum Price is not a number.");
		    	this.maxPriceError.setText("Must be a number");
		    }
		}
	}

}
