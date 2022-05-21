package arraylist;

import java.util.*;
import java.util.Arrays;

public class DuplicatesElements
{

	public static void main(String[] args)
	{
		ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,2,3,1,4,5,3,6,8,4,5,6,7,8,9));
		//linkedHashSet
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>( numbers);
		ArrayList<Integer> al = new ArrayList<Integer>( hs);
		System.out.println("list without duplicates :"+hs);
	}

}
