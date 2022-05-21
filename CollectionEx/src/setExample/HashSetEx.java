package setExample;

import java.util.HashSet;

public class HashSetEx
{

	public static void main(String[] args)
	{
		HashSet<Integer> evennumber= new HashSet<Integer>();
		evennumber.add(10);
		evennumber.add(20);
		evennumber.add(30);
		evennumber.add(40);
		System.out.println(evennumber);
		HashSet<Integer> number= new HashSet<Integer>();
		number.addAll(evennumber);
		number.add(50);
		System.out.println("new hashset is :"+number);
		number.removeAll(evennumber);
		System.out.println(number);
	}

}
