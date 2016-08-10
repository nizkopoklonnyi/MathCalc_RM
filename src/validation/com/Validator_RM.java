package validation.com;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator_RM extends Validator{
	
	/**expression of the form: operator (+/-)operator1 (+/-)operator2*/ 
	private String exprRegex="({1}[+|\\-|*|^|%|/])"
								+ "(\\s)"
								+ "([+|\\-]?)"
								+ "(\\d)+(\\.\\d+)?"
								+ "(\\s)"
								+ "([+|\\-]?)"
								+ "(\\d)+(\\.\\d+)?"; 
	
	public Validator_RM(Analizator analizator) {
		super(analizator);
		mAnlizator= analizator;
	}

	@Override
	public Boolean check(String expression) {
		
		 Pattern p = Pattern.compile(exprRegex);
		 Matcher m = p.matcher(expression);
		 
		 try{
			 m.matches();
			 mAnlizator.analize(expression);
		 }
		 catch(Exception e){
			 e.getMessage();
			 System.out.println("Expression is not correct");
			 return false;
		 }
		 
		 return true;
	}
	
}
