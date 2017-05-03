package ConstructorDepInjList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {  
		System.out.println("==+++===");
	    Resource r=new ClassPathResource("ConstructorDepInjList/ApplicationContext.xml");  
	    System.out.println("==)))===");
	    BeanFactory factory=new XmlBeanFactory(r);  
	    System.out.println("===(((==");
	    Question q=(Question) factory.getBean("ques");
	    System.out.println("===000==");
	    q.display();
}
}