import java.util.Scanner;
import calculator.com.ConsoleCalculator;

public class Client {

	public static void main(String[] args) {
		
		Scanner consoleScanner= new Scanner(System.in);
	
		//input expression
		String expression=consoleScanner.nextLine();
		
		//create calculator
		ConsoleCalculator consoleCalculator= new ConsoleCalculator();
	
		//set data in caclulator
		consoleCalculator.calculate(expression);
	}

}
