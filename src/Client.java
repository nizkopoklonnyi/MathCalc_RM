import java.util.Scanner;

import calculator.com.ConsoleCalculator;
import input.com.DataInput;
import output.com.Presentation;
import system_items.com.Items;

;public class Client {

	public static void main(String[] args) {
		DataInput expressionRM= new DataInput();
		Items items= new Items();
		Presentation presentation= new Presentation();
		
		//Scanner consoleScanner= new Scanner(System.in);
		
		//create calculator
		ConsoleCalculator consoleCalculator= new ConsoleCalculator();
		
		while(true){
			
			presentation.print(items.CONSOLE_INPUT);
			
			//input expression
			//String expression=consoleScanner.nextLine();
			expressionRM.input();
			
			//set data in caclulator
			consoleCalculator.calculate(expressionRM.getExpression());
		}
	}

}
