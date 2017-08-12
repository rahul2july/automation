package Day5;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets {

	
public static void main(String[] args) {
		
		Set<String> hs = new TreeSet<String>();
		
		hs.add("orange");
		hs.add("mango");
		hs.add("orange");
		hs.add("apple");
		hs.add("banana");
		hs.add("pineapple");
		hs.add("mango");
		
//		iterator
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()){
			
			String val = it.next();
			System.out.println(val);	
			
		}
		
	}

}
