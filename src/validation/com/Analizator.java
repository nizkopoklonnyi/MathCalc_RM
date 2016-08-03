package validation.com;
/** Class separate operator,operand1,operand2 from expression and compares they*/
public class Analizator {
	private String operator;
	private Double operand1,operand2;
	private String separator[];
	
	/** method-adapter calls current method-separator*/
	public void analize(String expression){
		
		this.analize_RM(expression);
	}
	/** method-separator separate expresson on 3 component and save they*/
	private void analize_RM(String expression){
		this.separator=expression.split(" ");
		this.operator=separator[0];
		this.operand1= Double.parseDouble(separator[1]);
		this.operand2= Double.parseDouble(separator[2]);
		
	}
	
	// methods for gets o1,o2, o-r
	public String getOperator(){
		return this.operator;
	}
	public Double getOperand1(){
		return this.operand1;
	}
	public Double getOperand2(){
		return this.operand2;
	}
}
