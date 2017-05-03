package SpringCoupling;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Logic {

	public static void main(String args[]){
		
		
		Resource resource=new ClassPathResource("SpringCoupling/ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		OutputHelper1 out1=(OutputHelper1) factory.getBean("OutputHelper1");
		out1.generateoutput();
	}
}
