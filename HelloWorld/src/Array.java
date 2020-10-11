import java.util.*;
public class Array {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>(); //Creating an ArrayList
		list.add(1); // Adding elements into Array List
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		list.remove(0); //Removing element from particular location from ArrayList
		System.out.println(list);

		list.clear();//Clear the Array List
		System.out.println(list);
		
	}

}
