package tests;

public class ConditionStatements {
	public static void main(String[] args) {
		int a=10;
		int b=90;
		
		if(b==a) {
			System.out.println(true);
			
		}
		else {
			System.out.println(false);
		}
		
		String expected = "abc";
		String actual = "ABC";
		
		if(expected.equals(actual)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
