package tests;

public class FunctionCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object Creation
		FunctionTest trial = new FunctionTest();
		FunctionProg Prog = new FunctionProg();
		
		//
		FunctionCall.printMe();
		FunctionTest.Adidas();
		
		FunctionProg.red();
		Prog.blue(); 
		
		trial.Reebok(); 
	}
	
	public static void printMe() {
		System.out.println("print");
	} 
	public static void Scan() {
		System.out.println("scan");
	}
	
	public void nonStat() {
		System.out.println("nonstat");
	}
	

}
