package SpringCoupling;

import SpringCoupling.IoutputGenerator;
import SpringCoupling.CsvOutputGenerator;

public class OutputHelper {

	IoutputGenerator outputGenerator;
	
	public OutputHelper(){
		
		outputGenerator=new CsvOutputGenerator();
	}

	public void generateoutput(){
		outputGenerator.generateoutput();
		
	}

}	