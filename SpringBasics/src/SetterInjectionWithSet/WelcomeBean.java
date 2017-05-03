package SetterInjectionWithSet;

import java.util.Iterator;
import java.util.Set;

public class WelcomeBean {
	
	private int id;
	private String name;
	private Set answers;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set getAnswers() {
		return answers;
	}
	public void setAnswers(Set answers) {
		this.answers = answers;
	}
	
	public void display(){
	
		System.out.println(id+"  "+name);
		
		//System.out.println(answers);
		
		Iterator it=answers.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	

}
