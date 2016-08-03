import java.util.Scanner;
import calculator.com.ConsoleCalculator;

public class Client {

	public static void main(String[] args) {
		Scanner expression= new Scanner(System.in);
		String str=expression.nextLine();
		
		ConsoleCalculator consoleCalculator= new ConsoleCalculator();
		
		consoleCalculator.calculate(str);
	}

}
