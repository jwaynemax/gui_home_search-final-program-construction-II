/**
 * 
 */
package edu.westga.cs6312.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.Model.Home;

/**
 * @author jm00724
 *
 */
class TestHome {
	@Test
	void testValidStreetAddress() {
		Home home = new Home("123 Main St", "Way", "Atlanta", "Georgia", "30000", 4, 2, 1200, 300750.00);
		
		assertEquals("123 Main St", home.getStreetAddress());
	}
	
	@Test
	void testEmptyStreetAddress() {		
		assertThrows(IllegalArgumentException.class, () -> {
			Home home = new Home("", "Way", "Atlanta", "Georgia", "30000", 4, 2, 1200, 300750.00);
	    });
	}
	
	@Test
	void testNullStreetAddress() {		
		assertThrows(NullPointerException.class, () -> {
			Home home = new Home(null, "Way", "Atlanta", "Georgia", "30000", 4, 2, 1200, 300750.00);
	    });
	}
	
	@Test
	void testValidStreetSuffic() {
		Home home = new Home("123 Main St", "Way", "Atlanta", "Georgia", "30000", 4, 2, 1200, 300750.00);
		
		assertEquals("Way", home.getStreetSuffix());
	}
	
	@Test
	void testEmptyStreetSuffix() {		
		assertThrows(IllegalArgumentException.class, () -> {
			Home home = new Home("123 Main St", "", "Atlanta", "Georgia", "30000", 4, 2, 1200, 300750.00);
	    });
	}
	
	@Test
	void testNullStreetSuffix() {		
		assertThrows(NullPointerException.class, () -> {
			Home home = new Home("123 Main St", null, "Atlanta", "Georgia", "30000", 4, 2, 1200, 300750.00);
	    });
	}
	
	@Test
	void testValidCity() {
		Home home = new Home("123 Main St", "Way", "Atlanta", "Georgia", "30000", 4, 2, 1200, 300750.00);
		
		assertEquals("Atlanta", home.getCity());
	}
	
	@Test
	void testEmptyCity() {		
		assertThrows(IllegalArgumentException.class, () -> {
			Home home = new Home("123 Main St", "Way", "", "Georgia", "30000", 4, 2, 1200, 300750.00);
	    });
	}
	
	@Test
	void testNullCity() {		
		assertThrows(NullPointerException.class, () -> {
			Home home = new Home("123 Main St", "Way", null, "Georgia", "30000", 4, 2, 1200, 300750.00);
	    });
	}
	
	@Test
	void testValidState() {
		Home home = new Home("123 Main St", "Way", "Atlanta", "Georgia", "30000", 4, 2, 1200, 300750.00);
		
		assertEquals("Georgia", home.getState());
	}
	
	@Test
	void testEmptyState() {		
		assertThrows(IllegalArgumentException.class, () -> {
			Home home = new Home("123 Main St", "Way", "Atlanta", "", "30000", 4, 2, 1200, 300750.00);
	    });
	}
	
	@Test
	void testNullState() {		
		assertThrows(NullPointerException.class, () -> {
			Home home = new Home("123 Main St", "Way", "Atlanta", null, "30000", 4, 2, 1200, 300750.00);
	    });
	}
	
	@Test
	void testValidZip() {
		Home home = new Home("123 Main St", "Way", "Atlanta", "Georgia", "30000", 4, 2, 1200, 300750.00);
		
		assertEquals("30000", home.getZip());
	}
	
	@Test
	void testEmptyZip() {		
		assertThrows(IllegalArgumentException.class, () -> {
			Home home = new Home("123 Main St", "Way", "Atlanta", "Georgia", "", 4, 2, 1200, 300750.00);
	    });
	}
	
	@Test
	void testNullZip() {		
		assertThrows(NullPointerException.class, () -> {
			Home home = new Home("123 Main St", "Way", "Atlanta", "Georgia", null, 4, 2, 1200, 300750.00);
	    });
	}
	
	@Test
	void testValidBedroom() {
		Home home = new Home("123 Main St", "Way", "Atlanta", "Georgia", "30000", 4, 2, 1200, 300750.00);
		
		assertEquals(4, home.getBedroom());
	}
	
	@Test
	void testNegativeBedroom() {
		assertThrows(IllegalArgumentException.class, () -> {
			Home home = new Home("123 Main St", "Way", "Atlanta", "Georgia", "", -4, 2, 1200, 300750.00);
	    });
	}
	
	@Test
	void testValidBathroom() {
		Home home = new Home("123 Main St", "Way", "Atlanta", "Georgia", "30000", 4, 2, 1200, 300750.00);
		
		assertEquals(2, home.getBathroom());
	}
	
	@Test
	void testNegativeBathroom() {
		assertThrows(IllegalArgumentException.class, () -> {
			Home home = new Home("123 Main St", "Way", "Atlanta", "Georgia", "", 4, -2, 1200, 300750.00);
	    });
	}
	
	@Test
	void testValidSqft() {
		Home home = new Home("123 Main St", "Way", "Atlanta", "Georgia", "30000", 4, 2, 1200, 300750.00);
		
		assertEquals(1200, home.getSqft());
	}
	
	@Test
	void testNegativeSqft() {
		assertThrows(IllegalArgumentException.class, () -> {
			Home home = new Home("123 Main St", "Way", "Atlanta", "Georgia", "", 4, 2, -1200, 300750.00);
	    });
	}

	@Test
	void testValidPrice() {
		Home home = new Home("123 Main St", "Way", "Atlanta", "Georgia", "30000", 4, 2, 1200, 300750.00);
		
		assertEquals(300750.00, home.getPrice());
	}
	
	@Test
	void testNegativePrice() {
		assertThrows(IllegalArgumentException.class, () -> {
			Home home = new Home("123 Main St", "Way", "Atlanta", "Georgia", "", 4, 2, 1200, -300750.00);
	    });
	}

}
