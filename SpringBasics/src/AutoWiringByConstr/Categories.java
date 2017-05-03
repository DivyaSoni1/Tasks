package AutoWiringByConstr;


public class Categories {

	private String name;
	private Book bk;
	
	public Categories(Book bk){
		System.out.println("Constructor");
		this.bk=bk;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void show(){
		
		System.out.println("Categoried name:"+name);
		System.out.println("Booksname:   "+bk.getBookName()+"book price:  "+bk.getBookPrice());
	}

}
