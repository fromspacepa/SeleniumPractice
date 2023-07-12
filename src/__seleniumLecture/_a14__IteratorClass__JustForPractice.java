package __seleniumLecture;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class _a14__IteratorClass__JustForPractice {

	public static void main(String[] args) {
		
		/*
		 * Iterator Interface Example:
		 * 
		 * NOTE:
		 * Iterator interface is usually used with Windows and Tab handling concept, and it usually give you the 
		 * boolean result. You can also remove data with Iterator, and there are some more methods
		 * that comes with Iterator.
		 * 
		 * __Here this class is just to practice the "Iterator".
		 */
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		  Iterator<String> it = list.iterator(); 
		  while (it.hasNext()){
		        System.out.println(it.next()); 
		  } 
		  it.remove(); 
		        System.out.println(list);
		  
		  Set<String> list2 = new HashSet<String>(); 
		  list2.add("tt"); 
		  list2.add("yy");
		  list2.add("pp");
		  
		  Iterator<String> it2 = list2.iterator(); 
		  while(it2.hasNext()){
		        System.out.println(it2.hasNext()); 
		  }
		 
}

}
