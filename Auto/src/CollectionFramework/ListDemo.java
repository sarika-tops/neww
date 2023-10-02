package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
           public static void main(String[] args) {
        	List list = new ArrayList();
       		ArrayList list1 = new ArrayList();
       		list.add(1);
       		list.add("sara");
       		list.add(12545);
       		list.add('s');
       		list.add(22.4);
       		list.add(true);
       		System.out.println(list);
       		Iterator itr = list.iterator();
       		while(itr.hasNext()) {
       			System.out.println(itr.next());
       		}
       		
		}
}
