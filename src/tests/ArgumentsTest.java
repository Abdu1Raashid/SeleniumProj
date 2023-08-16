package tests;

public class ArgumentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			sum(1,2);
			sum(1,2,3);
			
			
	}
	
	public static void sum(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public static void sum(int a, int b, int d) {
		int c = a+b+d;
		System.out.println(c);
	}
	
	public static void sum(int a, int b, int e, int f) {
		int c = a+b+e+f;
		System.out.println(c);
	}

}
