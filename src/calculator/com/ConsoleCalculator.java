package calculator.com;

import validation.com.Analizator;
import validation.com.Validator;
import validation.com.Validator_RM;

/**Class calculate result for console*/
public class ConsoleCalculator extends Calculator{
	
	Validator validator;
	Analizator analizator= new Analizator();
	
	public ConsoleCalculator() {
		validator= new Validator_RM(analizator);
	}
	
	@Override
	/**method for calculates*/
	public void calculate(String expression) {

		validator.check(expression);
		
		System.out.println(analizator.getOperator());
		System.out.println(analizator.getOperand1());
		System.out.println(analizator.getOperand2());
				
	}

}
