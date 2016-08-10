package calculator.com;

import output.com.Presentation;
import validation.com.Analizator;
import validation.com.Validator;
import validation.com.Validator_RM;

/**Class calculate result for console*/
public class ConsoleCalculator extends Calculator{
	
	Validator validator;
	Analizator analizator= new Analizator();
	Presentation result= new Presentation();
	
	public ConsoleCalculator() {
		validator= new Validator_RM(analizator);
	}
	
	@Override
	/**method for calculates*/
	public void calculate(String expression) {

		//if expression correct- calculate
		if(validator.check(expression)){
		
			if(analizator.getOperator().compareTo("-")==0)
				result.printResult(analizator.getOperand1()-analizator.getOperand2());
			if(analizator.getOperator().compareTo("+")==0)
			    result.printResult( analizator.getOperand1()+analizator.getOperand2());
			if(analizator.getOperator().compareTo("*")==0)
				result.printResult(analizator.getOperand1()*analizator.getOperand2());
			if(analizator.getOperator().compareTo("^")==0)
				result.printResult(Math.pow(analizator.getOperand1(),analizator.getOperand2()));
			if(analizator.getOperator().compareTo("%")==0)
				result.printResult(analizator.getOperand1()%analizator.getOperand2());
			if(analizator.getOperator().compareTo("/")==0)
				result.printResult(analizator.getOperand1()/analizator.getOperand2());
		}
			
	}

}
