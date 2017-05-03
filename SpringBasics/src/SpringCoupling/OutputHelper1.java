package SpringCoupling;

//import SpringCoupling.IoutputGenerator;
public class OutputHelper1 implements IoutputGenerator {

	IoutputGenerator outputGenerator;

	
	public void generateoutput() {
		// TODO Auto-generated method stub
		outputGenerator.generateoutput();
	}
	
	public void setOutputGenerator(IoutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}	
}
