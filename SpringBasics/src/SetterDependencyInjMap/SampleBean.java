package SetterDependencyInjMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SampleBean {

	private Map stuData;
	private TestBean tb;
	
	
	public Map getStuData() {
		return stuData;
	}
	public void setStuData(Map stuData) {
		this.stuData = stuData;
	}
	public TestBean getTb() {
		return tb;
	}
	public void setTb(TestBean tb) {
		this.tb = tb;
	}
	
	public void display(){
		
		Set set=stuData.entrySet();
		Iterator it=set.iterator();
		
		while(it.hasNext()){
			
			Entry entry=(Entry) it.next();
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		System.out.println(tb);
	}
	
}
