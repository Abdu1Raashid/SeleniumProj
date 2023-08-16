package tests;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tools[] = {"ab","nb","mc","ld","le"};
		
		
		for(int i =0; i< tools.length;i++) {
			System.out.println(tools[i]);
		}
		
		Object mix[] = {"aaa", 1, 'a', 3.90};
		for(int i=0; i<mix.length;i++) {
			System.out.println(mix[i]);
		}
	}

}
