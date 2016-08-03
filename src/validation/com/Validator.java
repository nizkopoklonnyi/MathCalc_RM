package validation.com;

/** Class that defines general behavior of validators*/
public abstract class Validator {
	
	protected Analizator mAnlizator;
	
	public Validator(Analizator analizator){
		this.mAnlizator=analizator;
	} 
	/**method checks on the correctness of the expression */
	public abstract Boolean check(String expression);
	
	
}
