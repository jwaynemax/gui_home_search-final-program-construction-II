/**
 * 
 */
package edu.westga.cs6312.Model;

/**
 * De
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
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}
	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	/**
	 * @return the streetSuffix
	 */
	public String getStreetSuffix() {
		return streetSuffix;
	}
	/**
	 * @param streetSuffix the streetSuffix to set
	 */
	public void setStreetSuffix(String streetSuffix) {
		this.streetSuffix = streetSuffix;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * @return the bedroom
	 */
	public int getBedroom() {
		return bedroom;
	}
	/**
	 * @param bedroom the bedroom to set
	 */
	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}
	/**
	 * @return the bathroom
	 */
	public int getBathroom() {
		return bathroom;
	}
	/**
	 * @param bathroom the bathroom to set
	 */
	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}
	/**
	 * @return the sqft
	 */
	public int getSqft() {
		return sqft;
	}
	/**
	 * @param sqft the sqft to set
	 */
	public void setSqft(int sqft) {
		this.sqft = sqft;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Home [streetAddress=" + streetAddress + ", streetSuffix=" + streetSuffix + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", bedroom=" + bedroom + ", bathroom=" + bathroom + ", sqft=" + sqft
				+ ", price=" + price + "]";
	}
	
}
