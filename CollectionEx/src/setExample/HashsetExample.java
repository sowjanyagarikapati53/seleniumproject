package setExample;

import java.util.*;



public class HashsetExample 
{

	public static void main(String[] args) 
	{
		//HashSet hs= new HashSet(100);//the default capacity is 100
		//HashSet hs= new HashSet(75,0.95f);//the default capacity is 75 and load factor is 95
		//HashSet<Integer> hs = new HashSet<Integer>();
		HashSet hs= new HashSet();//default capacity is 16 and load factor is 75
		hs.add('A');
		hs.add("sowjanya");
		hs.add(24);
		hs.add(0.03);
		hs.add(null);
		hs.add(true);
		System.out.println(hs);
		
		hs.remove(0.03);
		System.out.println("after removing an element:"+hs);
		System.out.println(hs.contains('A'));
		System.out.println(hs.contains('s'));
		System.out.println(hs.isEmpty());
		//reading an element
		/*for(Object e:hs) {
			System.out.println(e);
		}*/
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
