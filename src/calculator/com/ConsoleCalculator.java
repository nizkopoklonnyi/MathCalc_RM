package calculator.com;

import validation.com.Analizator;
import validation.com.Validator;
import validation.com.Validator_RM;

public class ConsoleCalculator extends Calculator{
	
	Validator validator;
	Analizator analizator= new Analizator();
	
	public ConsoleCalculator() {
		validator= new Validator_RM(analizator);
	}
	
	@Override
	public void calculate(String expression) {
		
		validator.check(expression);
		
	}

}
