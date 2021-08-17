/**
 * @(#)Address.java
 *
 *
 * @author
 * @version 1.00 2019/7/28
 */


public class Address {

	private String street, city, state;
	private int postCode;
	
	// constructor
    public Address(String street, String city, String state, int postcode) {
    	this.street = street;
    	this.city = city;
    	this.state = state;
    	this.postCode = postcode;
    }
    // end constructor
    
    // getter
    public String getStreet()
    {
    	return street;
    }
    
    public String getCity()
    {
    	return city;
    }
    
    public String getState()
    {
    	return state;
    }
    
    public int getPostCode()
    {
    	return postCode;
    }
    // end getter
    
    // setter
    public void setStreet(String street)
    {
    	this.street = street;
    }
    
    public void setCity(String city)
    {
    	this.city = city;
    }
    
    public void setState(String state)
    {
    	this.state = state;
    }
    
    public void setPostCode(int postCode)
    {
    	this.postCode = postCode;
    }
	// end setter
	
	// toString
    public String toString()
    {
    	return String.format("%s,%d %s, %s", street, postCode, city, state);
    }
    // end toString
}