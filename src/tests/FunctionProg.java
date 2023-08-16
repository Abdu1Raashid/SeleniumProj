package tests;
import Selenium.Test4;

public class FunctionProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Constructor will run first 
		FunctionTest test = new FunctionTest();
		
		//Creation of object for non-static method
		FunctionProg fun = new FunctionProg();
		
		
		FunctionCall num = new FunctionCall();
		
		//Object creation from Test4Class
		Test4 in = new Test4();
		
		
		//Implementations
		in.integers();
		Test4.numbers();
		fun.blue();
		FunctionCall.printMe();
		num.nonStat();
		red();
		in.numbers();
		
			
											}

	public static void red() {
		System.out.println("red");
	}
	public void blue() {
		System.out.println("blue");
	}
}
