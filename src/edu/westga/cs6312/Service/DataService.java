/**
 * 
 */
package edu.westga.cs6312.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import edu.westga.cs6312.Model.Home;

/**
 * Read JSON data from home_data.java
 * @author jm00724
 *
 */
public class DataService {

	public static Home[] readHomeJSON()
			throws FileNotFoundException, IOException, org.json.simple.parser.ParseException {

		JSONParser parser = new JSONParser();

		Object obj = parser.parse(new FileReader("home_data.json"));
		JSONArray homesJson = (JSONArray) obj;
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
			homes[i] = new Home(street_address, street_suffix, city, state, zip, (int) bedrooms, (int) bathrooms, (int) sqft, price);
		}
		return homes;
	}

}
