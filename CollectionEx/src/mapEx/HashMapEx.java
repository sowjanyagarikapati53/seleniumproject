package mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx
{

	public static void main(String[] args)
	{
	   HashMap<Integer,String> m = new HashMap<Integer,String>();
		//HashMap m = new HashMap();
		m.put(101, "sowjanya");
		m.put(102, "chanti");
		m.put(103, "sri");
		m.put(104, "suresh");
		m.put(105, "satya");
		m.put(106, "sowjanya");
		System.out.println(m);
		System.out.println(m.get(102));
		m.remove(105);
		System.out.println(m);
		
		System.out.println(m.containsKey(103));
		System.out.println(m.containsKey(105));
		
		System.out.println(m.containsValue("sowjanya"));
		System.out.println(m.containsValue("A"));
		
		//System.out.println(m.keySet());
		for( Object i:m.keySet()) {
			System.out.println(i);
		}
		
	//System.out.println(m.values());
	for( Object j:m.values()) {
		System.out.println(j);
	}
	
	/*for(Object i:m.keySet()) {
		System.out.println(i+"  "+ m.get(i));
	}*/
		
		//System.out.println(m.entrySet());
		
		//Entry Method
	/*for(Entry entry:m.entrySet()) {
		System.out.println(entry.getKey()+"  "+entry.getValue());
		
		
	}*/
	
	//Iterator Method
	Set s= m.entrySet();
	   Iterator itr = s.iterator();
	   while(itr.hasNext()) {
	 Map.Entry entry  = (Entry) itr.next();
	 System.out.println(entry.getKey()+"  "+entry.getValue());
	   }

	}

}
