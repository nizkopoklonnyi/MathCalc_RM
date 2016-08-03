package validation.com;

public abstract class Validator {
	
	private Analizator mAnlizator;
	public abstract Boolean check(String expression);
	
	public Validator(Analizator analizator){
		this.mAnlizator=analizator;
	} 
}
