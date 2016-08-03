import java.util.Scanner;

import calculator.com.ConsoleCalculator;
import input.com.DataInput;

public class Client {

	public static void main(String[] args) {
		DataInput expressionRM= new DataInput();
		//Scanner consoleScanner= new Scanner(System.in);
		
		//create calculator
		ConsoleCalculator consoleCalculator= new ConsoleCalculator();
		
		while(true){
			System.out.println("¬ведите выражение:");
			//input expression
			//String expression=consoleScanner.nextLine();
			expressionRM.input();
			//set data in caclulator
			consoleCalculator.calculate(expressionRM.getExpression());
		}
	}

}
