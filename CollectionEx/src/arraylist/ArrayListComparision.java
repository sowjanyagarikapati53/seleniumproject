package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparision 
{

	public static void main(String[] args)
	{
		ArrayList<String> l1=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l2=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l3=new ArrayList<String>(Arrays.asList("A","C","B","D","F"));
		
		System.out.println(l1.equals(l2));
		Collections.sort(l3);
		System.out.println(l2.equals(l3));
		

	}

}
