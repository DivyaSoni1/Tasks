package ConstructorInjectn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Logic {
	public static void main(String args[]){
		Resource resource=new ClassPathResource("ConstructorInjectn/ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Employee sb=(Employee) factory.getBean("emp");
		sb.Show();
	}	
}
