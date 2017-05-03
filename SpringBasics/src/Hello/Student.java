package Hello;

public class Student {

	private String name;

	
	Student(){
		
		System.out.println("1");
	}
	
	public String getName() {
		System.out.println("2");
		return name;
	}
	

	public void setName(String name) {
		System.out.println("3");
		this.name = name;
	}
	
	public void displayname(){
		
		System.out.println("Hello  "+ name);
	}
}
