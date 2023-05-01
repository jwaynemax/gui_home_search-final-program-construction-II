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
		//Search
		System.out.println("Search executed...");
				
		int count = 0;
		for (int i = 0; i <= DataService.readHomeJSON().length - 1; i++) {
			if (DataService.readHomeJSON()[i].getCity().toLowerCase().equals(city.toLowerCase()) || DataService.readHomeJSON()[i].getState().toLowerCase().equals(state.toLowerCase()) || DataService.readHomeJSON()[i].getZip().toLowerCase().equals(zip.toLowerCase())) {
				count++;
			}
		}
		
		Home[] homes = new Home[count];
		int filler = 0;
		for (int i = 0; i <= DataService.readHomeJSON().length - 1; i++) {
			if (DataService.readHomeJSON()[i].getCity().toLowerCase().equals(city.toLowerCase()) || DataService.readHomeJSON()[i].getState().toLowerCase().equals(state.toLowerCase()) || DataService.readHomeJSON()[i].getZip().toLowerCase().equals(zip.toLowerCase())) {
				homes[filler] = DataService.readHomeJSON()[i];
				filler++;
			}
		}
		
		//Bubble sort
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
	
	public static String searchBedroomBathroom(int bedroom, int bathroom) throws FileNotFoundException, IOException, ParseException {		
		//Search
		System.out.println("Search executed...");
				
		int count = 0;
		for (int i = 0; i <= DataService.readHomeJSON().length - 1; i++) {
			if (DataService.readHomeJSON()[i].getBedroom() == bedroom && DataService.readHomeJSON()[i].getBathroom() == bathroom) {
				count++;
			}
		}
		
		Home[] homes = new Home[count];
		int filler = 0;
		for (int i = 0; i <= DataService.readHomeJSON().length - 1; i++) {
			if (DataService.readHomeJSON()[i].getBedroom() == bedroom && DataService.readHomeJSON()[i].getBathroom() == bathroom) {
				homes[filler] = DataService.readHomeJSON()[i];
				filler++;
			}
		}
		
		//Insertion Sort
		for (int i = 1; i < homes.length; i++) {
			Home currentElement = homes[i];
			int j;
			for (j = i - 1; j >= 0 && (homes[j].getStreetAddress().compareTo(currentElement.getStreetAddress()) > 0); j--) {
				homes[j + 1] = homes[j];
			}

			homes[j + 1] = currentElement;
		}
		        
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
