package collections;
import java.util.*;
public class GenericCollection {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		//ll.add(10);
		ll.add("xxx");
		ll.add("yyy");
		ll.add("zzz");
		System.out.println(ll);
		for(String s:ll)
			System.out.println(s);
	}

}
