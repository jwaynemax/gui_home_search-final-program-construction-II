package edu.westga.cs6312.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

import edu.westga.cs6312.Service.DataService;

class TestDataService {

	@Test
	void testReadEntireFile() throws FileNotFoundException, IOException, ParseException {
		
		assertEquals(1000, DataService.readHomeJSON().length);
	}
	
	@Test
	void testReadFileStreetAddress() throws FileNotFoundException, IOException, ParseException {
		
		assertEquals("7916 Browning Drive", DataService.readHomeJSON()[999].getStreetAddress());
	}
	
	@Test
	void testReadFileStreetSuffix() throws FileNotFoundException, IOException, ParseException {
		
		assertEquals("Terrace", DataService.readHomeJSON()[999].getStreetSuffix());
	}
	
	@Test
	void testReadFileCity() throws FileNotFoundException, IOException, ParseException {
		
		assertEquals("Lawrenceville", DataService.readHomeJSON()[999].getCity());
	}
	
	@Test
	void testReadFileState() throws FileNotFoundException, IOException, ParseException {
		
		assertEquals("Georgia", DataService.readHomeJSON()[999].getState());
	}
	
	@Test
	void testReadFileZip() throws FileNotFoundException, IOException, ParseException {
		
		assertEquals("30245", DataService.readHomeJSON()[999].getZip());
	}
	
	@Test
	void testReadFileBedroom() throws FileNotFoundException, IOException, ParseException {
		
		assertEquals(4, DataService.readHomeJSON()[999].getBedroom());
	}
	
	@Test
	void testReadFileBathroom() throws FileNotFoundException, IOException, ParseException {
		
		assertEquals(4, DataService.readHomeJSON()[999].getBathroom());
	}
	
	@Test
	void testReadFileSqft() throws FileNotFoundException, IOException, ParseException {
		
		assertEquals(2513, DataService.readHomeJSON()[999].getSqft());
	}
	
	@Test
	void testReadFilePrice() throws FileNotFoundException, IOException, ParseException {
		
		assertEquals(974346.12, DataService.readHomeJSON()[999].getPrice());
	}

}
