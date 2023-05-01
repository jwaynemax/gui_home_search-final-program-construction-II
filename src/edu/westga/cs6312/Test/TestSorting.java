package edu.westga.cs6312.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

import edu.westga.cs6312.Model.Sorting;

class TestSorting {

	@Test
	void testBubbleSort() throws FileNotFoundException, IOException, ParseException {
		assertEquals(
				"\nHome [streetAddress=6 Mcbride Plaza, streetSuffix=Trail, city=Montgomery, state=Alabama, zip=36109, bedroom=6, bathroom=4, sqft=2339, price=829844.54]\n"
						+ "Home [streetAddress=959 Sunnyside Plaza, streetSuffix=Circle, city=Pompano Beach, state=Florida, zip=33075, bedroom=5, bathroom=5, sqft=2339, price=1119982.0]",
				Sorting.searchSqFt(2339));
	}
	
	@Test
	void testInsertionSort() throws FileNotFoundException, IOException, ParseException {
		assertEquals(
				"\n"
				+ "Home [streetAddress=054 Elgar Park, streetSuffix=Lane, city=Clearwater, state=Florida, zip=33763, bedroom=10, bathroom=4, sqft=1495, price=734545.15]\n"
				+ "Home [streetAddress=1 Mcbride Crossing, streetSuffix=Avenue, city=Punta Gorda, state=Florida, zip=33982, bedroom=10, bathroom=4, sqft=3024, price=439681.98]\n"
				+ "Home [streetAddress=16 Declaration Way, streetSuffix=Park, city=Macon, state=Georgia, zip=31210, bedroom=10, bathroom=4, sqft=1200, price=1135546.45]\n"
				+ "Home [streetAddress=32570 Lunder Plaza, streetSuffix=Trail, city=Naples, state=Florida, zip=33961, bedroom=10, bathroom=4, sqft=2889, price=1337622.7]\n"
				+ "Home [streetAddress=4 Westerfield Terrace, streetSuffix=Alley, city=Atlanta, state=Georgia, zip=30356, bedroom=10, bathroom=4, sqft=4323, price=420623.47]\n"
				+ "Home [streetAddress=52 Longview Crossing, streetSuffix=Street, city=Pensacola, state=Florida, zip=32520, bedroom=10, bathroom=4, sqft=2614, price=924752.7]\n"
				+ "Home [streetAddress=5507 Thackeray Terrace, streetSuffix=Lane, city=Clearwater, state=Florida, zip=33758, bedroom=10, bathroom=4, sqft=2854, price=1350895.76]\n"
				+ "Home [streetAddress=6 Sachtjen Avenue, streetSuffix=Terrace, city=Pompano Beach, state=Florida, zip=33075, bedroom=10, bathroom=4, sqft=4226, price=413848.58]\n"
				+ "Home [streetAddress=71 Little Fleur Trail, streetSuffix=Place, city=Marietta, state=Georgia, zip=30061, bedroom=10, bathroom=4, sqft=4277, price=1246830.92]\n"
				+ "Home [streetAddress=9 Dakota Park, streetSuffix=Lane, city=Atlanta, state=Georgia, zip=30306, bedroom=10, bathroom=4, sqft=4472, price=1441518.3]",
				Sorting.searchBedroomBathroom(10, 4));
	}

}