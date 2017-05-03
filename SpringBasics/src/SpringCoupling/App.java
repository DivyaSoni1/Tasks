package SpringCoupling;

public class App {

	public static void main(String args[]){
		
		IoutputGenerator output=new CsvOutputGenerator();
		output.generateoutput();
	}
}
