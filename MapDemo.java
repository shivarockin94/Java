package collections;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
	//	HashMap	
		HashMap hm = new HashMap();
		hm.put("monitor", 5000);
		hm.put("keybord", 500);
		hm.put("mouse", 300);
		hm.put("ups", 2000);
		hm.put("speakers", 1000);
		System.out.println(hm);
		
//		LinkedHashMap	
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("monitor", 5000);
		lhm.put("keybord", 500);
		lhm.put("mouse", 300);
		lhm.put("ups", 2000);
		lhm.put("speakers", 1000);
		System.out.println(lhm);	
		
//		TreeMap	
			TreeMap tm = new TreeMap();
			tm.put("monitor", 5000);
			tm.put("keybord", 500);
			tm.put("mouse", 300);
			tm.put("ups", 2000);
			tm.put("speakers", 1000);
			System.out.println(tm);		
			System.out.println(tm.descendingMap());	
	}

}
