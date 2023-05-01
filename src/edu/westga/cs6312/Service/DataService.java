/**
 * 
 */
package edu.westga.cs6312.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import edu.westga.cs6312.Model.Home;

/**
 * Read JSON data from home_data.java
 * 
 * @author jm00724
 * @version 5/1/23
 */
public class DataService {
	

	/**
	 * Read home_data.json and save to array -- requires Json.simple jar
	 * @return array of Homes read from home_data.json
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws org.json.simple.parser.ParseException
	 */
	public static Home[] readHomeJSON()
			throws FileNotFoundException, IOException, org.json.simple.parser.ParseException {

		//declare parser
		JSONParser parser = new JSONParser();

		//parse home_data.json
		Object obj = parser.parse(new FileReader("home_data.json"));
		//convert to array
		JSONArray homesJson = (JSONArray) obj;
		//save values to array
		Home[] homes = new Home[homesJson.size()];
		for (int i = 0; i < homesJson.size(); i++) {
			JSONObject readHomesJson = (JSONObject) homesJson.get(i);
			String street_address = (String) readHomesJson.get("street_address");
			String street_suffix = (String) readHomesJson.get("street_suffix");
			String city = (String) readHomesJson.get("city");
			String state = (String) readHomesJson.get("state");
			String zip = (String) readHomesJson.get("zip");
			long bedrooms = (long) readHomesJson.get("bedrooms");
			long bathrooms = (long) readHomesJson.get("bathrooms");
			long sqft = (long) readHomesJson.get("sqft");
			double price = (double) readHomesJson.get("price");
			//declare as Home object
			homes[i] = new Home(street_address, street_suffix, city, state, zip, (int) bedrooms, (int) bathrooms,
					(int) sqft, price);
		}
		return homes;
	}
	
	/**
	 * Write home search output to search_matches
	 * @param homes
	 */
	public static void writeHomeJSONResults(ArrayList<String> homes) {
		File file = new File("search_matches");
		

		try (PrintWriter output = new PrintWriter(file);) {
			for (int index = 0; index < homes.size(); index++) {
				output.println(homes.get(index));
			}

			output.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}
	}

}
