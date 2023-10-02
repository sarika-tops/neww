package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
           public static void main(String[] args) {
        	          Set set = new HashSet();
 		              set.add(1);
 		              set.add("sara");
		 		      set.add('s');
		 		      set.add(24513);
		 		      set.add(22.4);
		 		      set.add(true);
		 		      System.out.println(set);
		 		      set.add(1);
		 		      System.out.println(set.size());
		 		      set.remove(5);
		 		      Iterator itr = set.iterator();
		 		      while(itr.hasNext()) {
		 		    	   System.out.println(itr.next());
		 		      }

		}
}
