package SetterDependencyInjSet;

import java.util.Iterator;
import java.util.Set;

public class SampleBean {

	private Set stuData;
	private TestBean tb;
	
	public Set getStuData() {
		return stuData;
	}
	public void setStuData(Set stuData) {
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
