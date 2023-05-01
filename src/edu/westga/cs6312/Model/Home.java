/**
 * 
 */
package edu.westga.cs6312.Model;

/**
 * Define home
 * 
 * @author jm00724
 * @version 5/1/23
 */
public class Home {

	private String streetAddress;
	private String streetSuffix;
	private String city;
	private String state;
	private String zip;
	private int bedroom;
	private int bathroom;
	private int sqft;
	private double price;

	/**
	 * Constructor for Home
	 * 
	 * @param streetAddress
	 * @param streetSuffix
	 * @param city
	 * @param state
	 * @param zip
	 * @param bedroom
	 * @param bathroom
	 * @param sqft
	 * @param price
	 */
	public Home(String streetAddress, String streetSuffix, String city, String state, String zip, int bedroom,
			int bathroom, int sqft, double price) {
		this.setStreetAddress(streetAddress);
		this.setStreetSuffix(streetSuffix);
		this.setCity(city);
		this.setState(state);
		this.setZip(zip);
		this.setBedroom(bedroom);
		this.setBathroom(bathroom);
		this.setSqft(sqft);
		this.setPrice(price);
	}

	/**
	 * Get street address
	 * @precondition none
	 * @postcondition none
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return this.streetAddress;
	}

	/**
	 * Set Street Address
	 * @precondition parameter cannot be empty or null
	 * @postcondition none
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		
		
		if (streetAddress.equals(null) || streetAddress.isEmpty()) {
			throw new IllegalArgumentException("Cannot be null or empty.");
		}
		
		this.streetAddress = streetAddress;
	}

	/**
	 * Get street suffix
	 * @precondition none
	 * @postcondition none
	 * @return the streetSuffix
	 */
	public String getStreetSuffix() {
		return this.streetSuffix;
	}

	/**
	 * Set street suffix
	 * @precondition parameter cannot be empty or null
	 * @postcondition none
	 * @param streetSuffix the streetSuffix to set
	 */
	public void setStreetSuffix(String streetSuffix) {
		
		if (streetSuffix.equals(null) || streetSuffix.isEmpty()) {
			throw new IllegalArgumentException("Cannot be null or empty.");
		}
		
		this.streetSuffix = streetSuffix;
	}

	/**
	 * Get city
	 * @precondition none
	 * @postcondition none
	 * @return the city
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 * Set city
	 * @precondition parameter cannot be empty or null
	 * @postcondition none
	 * @param city the city to set
	 */
	public void setCity(String city) {
		
		if (city.equals(null) || city.isEmpty()) {
			throw new IllegalArgumentException("Cannot be null or empty.");
		}
		
		this.city = city;
	}

	/**
	 * Get state
	 * @precondition none
	 * @postcondition none
	 * @return the state
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * Set state
	 * @precondition parameter cannot be empty or null
	 * @postcondition none
	 * @param state the state to set
	 */
	public void setState(String state) {
		
		if (state.equals(null) || state.isEmpty()) {
			throw new IllegalArgumentException("Cannot be null or empty.");
		}
		
		this.state = state;
	}

	/**
	 * Get zip
	 * @precondition none
	 * @postcondition none
	 * @return the zip
	 */
	public String getZip() {
		return this.zip;
	}

	/**
	 * Set zip
	 * @precondition parameter cannot be empty or null
	 * @postcondition none
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		
		if (zip.equals(null) || zip.isEmpty()) {
			throw new IllegalArgumentException("Cannot be null or empty.");
		}
		
		this.zip = zip;
	}

	/**
	 * Get bedroom
	 * @precondition none
	 * @postcondition none
	 * @return the bedroom
	 */
	public int getBedroom() {
		return this.bedroom;
	}

	/**
	 * Set bedroom
	 * @precondition parameter cannot be negative
	 * @postcondition none
	 * @param bedroom the bedroom to set
	 */
	public void setBedroom(int bedroom) {
		
		if (bedroom < 0) {
			throw new IllegalArgumentException("Cannot be negative.");
		}
		
		this.bedroom = bedroom;
	}

	/**
	 * Get bathroom
	 * @precondition none
	 * @postcondition none
	 * @return the bathroom
	 */
	public int getBathroom() {
		return this.bathroom;
	}

	/**
	 * Set bathroom
	 * @precondition parameter cannot be negative
	 * @postcondition none
	 * @param bathroom the bathroom to set
	 */
	public void setBathroom(int bathroom) {
		
		if (bathroom < 0) {
			throw new IllegalArgumentException("Cannot be negative.");
		}
		
		this.bathroom = bathroom;
	}

	/**
	 * Get sqft
	 * @precondition none
	 * @postcondition none
	 * @return the sqft
	 */
	public int getSqft() {
		return this.sqft;
	}

	/**
	 * Set sqft
	 * @precondition parameter cannot be negative
	 * @postcondition none
	 * @param sqft the sqft to set
	 */
	public void setSqft(int sqft) {
		
		if (sqft < 0) {
			throw new IllegalArgumentException("Cannot be negative.");
		}
		
		this.sqft = sqft;
	}

	/**
	 * Get price
	 * @precondition none
	 * @postcondition none
	 * @return the price
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Set price
	 * @precondition parameter cannot be negative
	 * @postcondition none
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		
		if (price < 0) {
			throw new IllegalArgumentException("Cannot be negative.");
		}
		
		this.price = price;
	}

	@Override
	public String toString() {
		return "Home [streetAddress=" + this.streetAddress + ", streetSuffix=" + this.streetSuffix + ", city="
				+ this.city + ", state=" + this.state + ", zip=" + this.zip + ", bedroom=" + this.bedroom
				+ ", bathroom=" + this.bathroom + ", sqft=" + this.sqft + ", price=" + this.price + "]";
	}

}
