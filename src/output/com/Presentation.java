package output.com;

import java.io.FileWriter;
import java.io.IOException;

/** Class-adapter for output the calculator result */
public class Presentation {

	/**print the calculator result	*/
	public void printResult(Double result){
		printResultToConsole(result);
	}
	/** implemented*/
	private void printResultToConsole(Double result){
		System.out.println("= "+result);
	}
	/** don't implemented*/
	private void printResultToFile(Double  result){
		//...
	}
	/** don't implemented*/
	private void printResultToWebPage(Double result){
		//...
	}
	
	/**print the application expression*/
	public void print(String expression){
		printToConsole(expression);
	}
	
	private void printToConsole(String expression){
		System.out.println(expression);
	}
	
	private void printToWebPage(String expression){
		//...
	}
	
}
