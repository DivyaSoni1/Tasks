package ConstructorDepInjList;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String name;
	private List answers;
	
	
	 Question(int id,String name,List answers){
		
		this.id=id;
		this.name=name;
		this.answers=answers;
}
	
	public void display(){
		
		Iterator it=answers.iterator();
		
		while(it.hasNext()){
			
			System.out.println(it.next());
		}
	}
}