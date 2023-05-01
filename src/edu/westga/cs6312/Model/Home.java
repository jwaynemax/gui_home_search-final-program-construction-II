/**
 * 
 */
package edu.westga.cs6312.Model;

/**
 * Define home
 * @author jm00724
 *
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
	 * Contructor for Home
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
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return this.streetAddress;
	}
	/**
	 * Set Street Address
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	/**
	 * Get street suffix
	 * @return the streetSuffix
	 */
	public String getStreetSuffix() {
		return this.streetSuffix;
	}
	/**
	 * Set street suffix
	 * @param streetSuffix the streetSuffix to set
	 */
	public void setStreetSuffix(String streetSuffix) {
		this.streetSuffix = streetSuffix;
	}
	/**
	 * Get city
	 * @return the city
	 */
	public String getCity() {
		return this.city;
	}
	/**
	 * Set city
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * Get state
	 * @return the state
	 */
	public String getState() {
		return this.state;
	}
	/**
	 * Set state
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * Get zip
	 * @return the zip
	 */
	public String getZip() {
		return this.zip;
	}
	/**
	 * Set zip
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * Get bedroom
	 * @return the bedroom
	 */
	public int getBedroom() {
		return this.bedroom;
	}
	/**
	 * Set bedroom
	 * @param bedroom the bedroom to set
	 */
	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}
	/**
	 * Get bathroom
	 * @return the bathroom
	 */
	public int getBathroom() {
		return this.bathroom;
	}
	/**
	 * Set bathroom
	 * @param bathroom the bathroom to set
	 */
	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}
	/**
	 * Get sqft
	 * @return the sqft
	 */
	public int getSqft() {
		return this.sqft;
	}
	/**
	 * Set sqft
	 * @param sqft the sqft to set
	 */
	public void setSqft(int sqft) {
		this.sqft = sqft;
	}
	/**
	 * Get price
	 * @return the price
	 */
	public double getPrice() {
		return this.price;
	}
	/**
	 * Set price
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Home [streetAddress=" + this.streetAddress + ", streetSuffix=" + this.streetSuffix + ", city=" + this.city + ", state="
				+ this.state + ", zip=" + this.zip + ", bedroom=" + this.bedroom + ", bathroom=" + this.bathroom + ", sqft=" + this.sqft
				+ ", price=" + this.price + "]";
	}
	
}
