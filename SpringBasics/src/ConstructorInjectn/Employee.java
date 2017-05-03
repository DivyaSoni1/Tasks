package ConstructorInjectn;

public class Employee {


	private int id;
	private String name;
	private String address;
	
	public Employee(){
		
		System.out.println("I am in default const..");
	}
	
	public Employee(int id,String name){
		
		this.id=id;
		this.name=name;
		
		System.out.println("one constr string");
	}
	
	public Employee(int id, String name,String address){
		
		this.id=id;
		this.name=name;
		this.address=address;
		System.out.println("3 constr");
	}
	
	public Employee(String address){
		System.out.println("1 constr string");
		this.address=address;
	}
	
	public void Show(){
		
		System.out.println(id+"  "+name+"  "+address);
	}
}
