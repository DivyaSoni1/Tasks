package SetterDependencyInjLIST;

import java.util.Iterator;
import java.util.List;

public class SampleBean {

	private List stuData;
	private TestBean tb;
	
	public List getStuData() {
		return stuData;
	}
	public void setStuData(List stuData) {
		this.stuData = stuData;
	}
	public TestBean getTb() {
		return tb;
	}
	public void setTb(TestBean tb) {
		this.tb = tb;
	}
	
	public void display(){
		
		//System.out.println(stuData);
		Iterator it=stuData.iterator();
		while(it.hasNext()){
			
			System.out.println(it.next());
			
		}
		System.out.println(tb);
	}
	
}
