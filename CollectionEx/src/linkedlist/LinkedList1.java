package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1 
{
   public static void main(String[] args)
   {
	LinkedList l= new LinkedList();
	l.add(20);
	l.add(56);
	l.add(15);
	l.add(4);
	l.add(21);
	l.add(16);
	System.out.println(l);
	LinkedList l1= new LinkedList();
	l1.addAll(l);
	System.out.println(l1);
	l1.remove();
	System.out.println(l1);
	l1.removeAll(l);
	System.out.println(l1);
	System.out.println("before sorting:"+l);
	Collections.sort(l);
	System.out.println("after sorting:"+l);
	Collections.shuffle(l);
	System.out.println("after shuffling:"+l);
	//reverse order
	Collections.sort(l,Collections.reverseOrder());
	System.out.println("reverse order:"+l);
}
}
