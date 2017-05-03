package AutoWiringBytype;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Logic {
public static void main(String args[]){
		
		Resource resource=new ClassPathResource("AutoWiringBytype/ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Categories cat=(Categories) factory.getBean("Category");
		
		cat.show();
	}
}
