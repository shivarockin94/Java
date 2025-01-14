package collections;
import java.util.*;
public class LinkedListOperations {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Element at Last");
		String lastElement = s.nextLine();
		ll.addLast(lastElement);
		System.out.println(ll);
		System.out.println("Enter Element at First");
		String firstElement = s.nextLine();
		ll.addFirst(firstElement);
		System.out.println(ll);
		System.out.println("Enter Element at Given Index");
		String givenElement = s.nextLine();
		ll.add(1,givenElement);
		System.out.println(ll);
		System.out.println("update value of Element at Given Index");
		String updateValue = s.nextLine();
		ll.set(1,updateValue);
		System.out.println(ll);
		System.out.println("Delete First Element");
		ll.remove(0);
		System.out.println(ll);
		System.out.println("Delete Last Element");
		ll.remove(ll.size()-1);
		System.out.println(ll);
		System.out.println("delete value of Element");
		ll.remove(givenElement);
		System.out.println(ll);
		System.out.println("delete value of Element at given index");
		ll.remove(0);
		System.out.println(ll);
		
	}

}
