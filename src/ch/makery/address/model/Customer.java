package ch.makery.address.model;

public class Customer {
	
	private String firstName;
	private String middileInt;
	private String lastName;
	private String gender;
	private String address;
	private String city;
	private String state;
	private String zip;
	
	public Customer(){
		
	}
	
/*	public Customer(String firstName, String middleInt, String lastName, String gender, 
			String address, String city, String state, byte zip){
		this.firstName = firstName;
		this.middileInt = middleInt;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	*/

	public String getFirstName() {
		return firstName;
	}
	public String getMiddileInt() {
		return middileInt;
	}
	public String getLastName() {
		return lastName;
	}
	public String getGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setMiddileInt(String middileInt) {
		this.middileInt = middileInt;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	

}
