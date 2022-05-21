package linkedlist;


import java.util.*;



public class LinkedListEx
{

	public static void main(String[] args)
	{
		LinkedList l= new LinkedList();
		l.add(20);
		l.add(null);
		l.add(15.4);
		l.add("sowjanya");
		l.add(true);
		System.out.println(l);
		System.out.println(l.size());
		//removing element
		l.remove(3);
		System.out.println("after removing element:"+l);
		l.remove(true);
		System.out.println("after removing element:"+l);
		l.add(2, "java");
		System.out.println("after adding element:"+l);
		//retriving an element
		System.out.println(l.get(3));
		//change the value
		l.set(1, 's');
		System.out.println("after changing the element:"+l);
		System.out.println(l.contains("java"));
		System.out.println(l.contains(2));
		System.out.println(l.isEmpty());
		/*for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}*/
		//by using for each loop
		/*for(Object e:l) {
			System.out.println(e);
		}*/
		//by using iterator
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
		
		
	}

	

}
