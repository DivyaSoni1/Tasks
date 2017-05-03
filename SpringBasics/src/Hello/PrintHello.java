package Hello;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PrintHello {

	public static void main(String args[]){
		
		Resource resource=new ClassPathResource("Hello/ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Student student=(Student) factory.getBean("Studentbean");
		student.displayname();
	}
	}
