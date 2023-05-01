/**
 * 
 */
package edu.westga.cs6312.Model;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import edu.westga.cs6312.Service.DataService;

/**
 * Perform search and sorting operations 
 * @author jm00724
 *
 */
public class Sorting {
	
	public static String searchCityStateZip(String city, String state, String zip) throws FileNotFoundException, IOException, ParseException {		
		System.out.println("Search executed...");
		
		int count = 0;
		for (int i = 0; i <= DataService.readHomeJSON().length - 1; i++) {
			if (DataService.readHomeJSON()[i].getCity().equals(city) || DataService.readHomeJSON()[i].getState().equals(state) || DataService.readHomeJSON()[i].getZip().equals(zip)) {
				count++;
			}
		}
		
		Home[] homes = new Home[count];
		int filler = 0;
		for (int i = 0; i <= DataService.readHomeJSON().length - 1; i++) {
			if (DataService.readHomeJSON()[i].getCity().equals(city) || DataService.readHomeJSON()[i].getState().equals(state) || DataService.readHomeJSON()[i].getZip().equals(zip)) {
				homes[filler] = DataService.readHomeJSON()[i];
				filler++;
			}
		}
		
		Home temp;
        for (int i = 1; i < homes.length; i++) {
    		for (int j = 0; j < homes.length - i; j++) {
    			if (homes[j].getStreetAddress().compareTo(homes[j + 1].getStreetAddress()) > 0) {
    				temp = homes[j];
    				homes[j] = homes[j + 1];
    				homes[j + 1] = temp;
    			}
    		}
    	}
		
        System.out.println(homes.length);
        
        String output = "";
        
        if (homes.length == 0)  {
        	output = "No results found.";
        } else if (homes.length > 20) {
        	for (int i = 0; i < 20; i++) {
    			output = output + "\n" + homes[i].toString();
    		}
        } else {
        	for (int i = 0; i <= homes.length - 1; i++) {
    			output = output + "\n" + homes[i].toString();
    		}
        }
        
        System.out.println("Search compelte");
		
		return output;
	}

}
