package tests;

public class ReturnTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int add = sum();
		String call = statement();
		
		
		System.out.println(add);
		System.out.println(call);
		
		
	}
	
			public static int sum() {
				int a = 4+5;
				return a;
				
			}
	
			public static String statement() {
				String s = "Hello World";
				return s;
			}

}
