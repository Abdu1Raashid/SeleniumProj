package tests;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declarations
ArrayList<String> list = new ArrayList<String>();
ArrayList<Integer[]> integer = new ArrayList<Integer[]>();


	
	list.add("bee");
	list.add("birds");
	list.add("animals");
	


		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println(integer);


		
		for(String s: list) {
			System.out.println(s);
		}
//
//			for(int i=0;i<list.size();i++) {
//				System.out.println(list.get(i));
//				}




//for(int i=0;i<10;i++) {
//	list.add(i);
//}
	}

}
