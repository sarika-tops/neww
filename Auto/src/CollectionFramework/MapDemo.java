package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo {
	      public static void main(String[] args) {
	      Map map = new HashMap();
	      map.put(1,"A");
	      map.put(2,"B");
	      map.put(3,"C");
	      map.put(4,"D");
	      map.put(5,"E");
	      System.out.println(map);
	      Set set = map.entrySet();
	      Iterator itr = set.iterator();
	      while(itr.hasNext()) {
	    	  Map.Entry entry = (Entry)itr.next();
	    	  System.out.println("key : "+entry.getKey());
	    	  System.out.println("value : "+entry.getValue());
	      }
}
}
