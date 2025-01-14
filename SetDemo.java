package collections;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		// HashSet  - unordered
		HashSet hs = new HashSet();
		hs.add("monitor");
		hs.add("keyboard");
		hs.add("mouse");
		hs.add("speakers");
		System.out.println(hs.add("monitor"));
		System.out.println(hs);
		
		// LinkedHashSet  - ordered
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("monitor");
		lhs.add("keyboard");
		lhs.add("mouse");
		lhs.add("speakers");
		System.out.println(lhs.add("monitor"));
		System.out.println(lhs);
				
		// TreeSet  - Sorted
		TreeSet ts = new TreeSet();
		ts.add("monitor");
		ts.add("keyboard");
		ts.add("mouse");
		ts.add("speakers");
		System.out.println(ts.add("ups"));
		System.out.println(ts);		
		System.out.println(ts.descendingSet());	
	}

}
