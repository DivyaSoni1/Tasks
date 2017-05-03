package SetterInjectionWithMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String name;
	private Map answers;
	
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
	public Map getAnswers() {
		return answers;
	}
	public void setAnswers(Map answers) {
		this.answers = answers;
	}
	
	public void display(){
		
		System.out.println(id+"  "+name);
		System.out.println("Answers are:");
		//System.out.println(answers);
		Set set=answers.entrySet();
		Iterator it=set.iterator();
		
		while(it.hasNext()){
			
			Entry entry=(Entry) it.next();
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}
	
	
}
