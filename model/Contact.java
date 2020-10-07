package com.capgemini.assignments.model;

public class Contact {

	private String firstName, lastName, address, city, state, email;
	private Long zipCode, phoneNo;
	
	public Contact (String firstName, String lastName, String address, String city, String state, Long zipCode, Long phoneNo, String email) {
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zipCode = zipCode;
			this.phoneNo = phoneNo;
			this.email = email;		
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getAddress()
	{
		return this.address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getCity()
	{
		return this.city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getState()
	{
		return this.state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public String getEmail()
	{
		return this.email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public Long getZipCode()
	{
		return this.zipCode;
	}
	public void setZipCode(Long zipCode)
	{
		this.zipCode = zipCode;
	}
	public Long getPhoneNo()
	{
		return this.phoneNo;
	}
	public void setPhoneNo(Long phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	public String toString() {
		return firstName+" "+lastName+" "+address+" "+city+" "+state+" "+zipCode+" "+phoneNo+" "+email;
	}

}
