package input.com;

import java.util.Scanner;

/** Class gets expression(operator,operand1,operand2)*/
public class DataInput {
	
	private Scanner consoleScanner= new Scanner(System.in);
	private String expression; 
	
	/** method adapter*/
	public void input(){
		this.inputFromConsoleRM();
	}
	public void inputFromConsoleRM(){
		this.expression=consoleScanner.nextLine();
	}
	/**don't implemented*/
	public void inputFromWebPage(){
		//...
	}
	/**don't implemented*/
	public void inputFromJavaFXForm(){
		//...
	}
	
	public String getExpression(){
		return this.expression;
	}
	
}
