package ConstructorDependentObj;

public class Address {

	private String city;
	private String state;
	private String country;
	
	
	public Address(String city,String state,String country){
		this.city=city;
		this.state=state;
		this.country=country;
		System.out.println("Add cons");
	}
	
	
	public String toString(){
		return city+"  "+state+"  "+country;
		}


	public String getCity() {
		System.out.println("Get city");
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
