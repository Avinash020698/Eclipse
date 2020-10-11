import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<>(); //Creating lisnked list
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("List elements: "+list);
		
		LinkedList<Integer> list2= new LinkedList<>();
		list2 = (LinkedList<Integer>) list.clone(); //Cloning linked list 1 in 2
		System.out.println("List elements of 2 : "+list2);
		
		 list2.clear(); //Clearing linked list 2
		 System.out.println("List elements of 2 : "+list2);
		 
		 System.out.println("List elements of 1: "+list.indexOf(1));
		 list.offerLast(4); //Offering element at last	
		 
		 System.out.println("List elements of 1 : "+list);
		 list.offerFirst(0); //offering element at first
		 
		 System.out.println("List elements of 1 : "+list);
		 list.set(0, 2); //setting element at particular index
		 System.out.println("List elements of 1 : "+list);
		 
		 
	     int a= list.pop(); //Popping element from the list
	     System.out.println("element popped : "+a);
	     
	     list.push(0); //Pushing element into the list
	     System.out.println("Element pushed : "+list);
	     
	     list.remove(); //Removing element from list (Generally 1st elemnt is removed from the list)
	     System.out.println("Elemrnts in list 1: "+list);
	     
	     System.out.println("Size of list: "+list.size()); //To find size of linked list
	     
	}

}
