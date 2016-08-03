package output.com;

import java.io.FileWriter;
import java.io.IOException;

/** Class-adapter for output the calculator result */
public class Presentation {

	/**print the calculator result	*/
	public void print(Double result){
		printToConsole(result);
	}
	/** implemented*/
	private void printToConsole(Double result){
		System.out.println("= "+result);
	}
	/** don't implemented*/
	private void printToFile(Double  result){
		//...
	}
	/** don't implemented*/
	private void printToWebPage(Double result){
		//...
	}
}
