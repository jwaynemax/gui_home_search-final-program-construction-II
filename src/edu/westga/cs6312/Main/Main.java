package edu.westga.cs6312.Main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import edu.westga.cs6312.Model.Home;
import edu.westga.cs6312.Service.DataService;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main {
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		Home home = new Home("123 Home", "Way", "Canton", "GA", "30000", 2, 3, 1200, 200000);
		
		System.out.println(home.toString());
		
		DataService.readHomeJSON();
		
		System.out.println(DataService.readHomeJSON()[999].getCity());
	}

	

	

}
