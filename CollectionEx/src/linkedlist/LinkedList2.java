package linkedlist;

import java.util.LinkedList;

public class LinkedList2
{

	public static void main(String[] args) 
	{
		LinkedList l= new LinkedList();
		l.add("dog");
		l.add("cat");
		l.add("monkey");
		l.add("pig");
		l.add("cow");
		System.out.println(l);
		l.addFirst("tiger");
		l.addLast("elephant");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
	}
}
