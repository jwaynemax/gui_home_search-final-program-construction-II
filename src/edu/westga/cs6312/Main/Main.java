package edu.westga.cs6312.Main;

import edu.westga.cs6312.Model.Home;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	
	public static void main(String[] args) {
		Home home = new Home("123 Home", "Way", "Canton", "GA", "30000", 2, 3, 1200, 200000);
		
		System.out.println(home.toString());
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
