package edu.westga.cs6312.Main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import edu.westga.cs6312.Model.Home;
import edu.westga.cs6312.Service.DataService;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
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
	    
	    ComboBox<String> cbo = new ComboBox<>();
	    cbo.getItems().addAll("City", "State", "Zip", "Bedroom", "Bathroom", "Square Feet", "Minimum Price", "Maximum Price");
	    cbo.setValue("City");
	    form.add(cbo, 1, 0);
	    
	    form.add(new Label("Enter filter criteria:"), 0, 1);
	    form.add(new Label("City:"), 0, 2);
	    form.add(this.city, 1,2);
	    //form.add(this.currentAgeError, 2, 2);
	    form.add(new Label("State:"), 0, 3);
	    form.add(this.state, 1, 3);
	    //form.add(this.ageAtRetirementError, 2, 3);
	    form.add(new Label("Zip:"), 0, 4);
	    form.add(this.zip, 1, 4);
	    //form.add(this.salaryError, 2, 4);
	    form.add(new Label("Bedroom:"), 0, 5);
	    form.add(this.bedroom, 1, 5);
	    //form.add(this.percentContributionError, 2, 5);
	    form.add(new Label("Bathroom:"), 0, 6);
	    form.add(this.bathroom, 1, 6);
	    //form.add(this.startingBalanceError, 2, 6);
	    form.add(new Label("Square Foot:"), 0, 7);
	    form.add(this.sqft, 1, 7);
	    //form.add(this.expectedReturnError, 2, 7);
	    form.add(new Label("Minimum Price:"), 0, 8);
	    form.add(this.minPrice, 1, 8);
	    //form.add(this.expectedReturnError, 2, 8);
	    form.add(new Label("Maximum Price:"), 0, 9);
	    form.add(this.maxPrice, 1, 9);
	    //form.add(this.expectedReturnError, 2, 9);
	    
	    form.setAlignment(Pos.CENTER);
		root.setCenter(form);
		
		Scene mainScene = new Scene(root);
		primaryStage.setTitle("Home Search by Justin Maxwell");
		primaryStage.setScene(mainScene);
		primaryStage.show();

	}

}
