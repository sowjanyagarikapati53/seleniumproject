package mapEx;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class HashTableEx
{

	public static void main(String[] args)
	{
		//Hashtable t = new Hashtable();//capacity is 11 ,load factor is0.75
		//Hashtable t= new(initial capacity);//create hastable with some initialcapacity
		Hashtable<Integer,String> t= new Hashtable<Integer,String>();
		t.put(101, "john");
		t.put(102, "smith");
		t.put(103, "peter");
		//t.put(null, "X");//null pointer exception
		t.put(104, "john");
		System.out.println(t);
		System.out.println(t.get(102));
		t.remove(101);
		System.out.println(t);
		System.out.println(t.containsKey(104));
		System.out.println(t.containsKey(107));
		
		System.out.println(t.containsValue("john"));
		System.out.println(t.containsValue("A"));
		
		System.out.println(t.keySet());
		System.out.println(t.values());
		
		/*for( int i:t.keySet()) {
			System.out.println(i+"  "+t.get(i));
		}*/
		
		//Entry method
		/*for(Map.Entry entry :t.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
			
		}*/
		//iterator
		Set s = t.entrySet();
		Iterator itr =  s.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
	}

}
