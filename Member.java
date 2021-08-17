/**
 * @(#)Member.java
 *
 *
 * @author
 * @version 1.00 2019/7/28
 */


public class Member {

	private String id, name;
	private int ic;
	private Address address;
	
	// constructor
    public Member(String id, String name, int ic, Address address)
    {
    	this.id = id;
    	this.name = name;
    	this.ic = ic;
    	this.address = address;
    }
    // end constructor
    
    // getter
    public String getId()
    {
    	return id;
    }
    
    public String getName()
    {
    	return name;
    }
    
    public int getIc()
    {
    	return ic;
    }
    
    public Address getAddress()
    {
    	return address;
    }
    // end getter
    
    
    // setter
    public void setId(String id)
    {
    	this.id = id;
    }
    
    public void setName(String name)
    {
    	this.name = name;
    }
    
    public void setIc(int ic)
    {
    	this.ic = ic;
    }
    
    public void setAddress(Address address)
    {
    	this.address = address;
    }
    // end setter

	
	// toString
    public String toString()
    {
    	return String.format("%s \t %s \t %d \t %s", id, name, ic, address.toString());
    }
    // end toString

}