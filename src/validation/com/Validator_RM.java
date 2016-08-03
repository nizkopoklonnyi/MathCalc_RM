package validation.com;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator_RM extends Validator{
	String exprRegex="({1}[+|\\-|*|^|%|/])(\\s)([+|\\-]?)(\\d)+(\\.\\d+)?(\\s)(\\d)+(\\.\\d+)?"; //{1}\\s[0-9]
	
	public Validator_RM(Analizator analizator) {
		super(analizator);
	}

	@Override
	public Boolean check(String expression) {
		
		 Pattern p = Pattern.compile(exprRegex);
		 Matcher m = p.matcher(expression);
		 
		 if(m.matches())
			 System.out.println("корректно");
		 else 
			 System.out.println("не корректно");
		 
		
		 return true;
	}
	
}
