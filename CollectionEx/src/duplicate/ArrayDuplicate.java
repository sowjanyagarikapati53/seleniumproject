package duplicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayDuplicate
{

	public static void main(String[] args)
	{
		String a[]= {"apple","orange","mango","apple","grapes","mango"};
		System.out.println("brute force.....");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		System.out.println("hash set......");
		HashSet<String> s = new HashSet<String> ();
		for(String e:a) {
			if(s.add(e)==false) {
				System.out.println(e);
			}
		}
		
		System.out.println("hash Map.......");
		HashMap<String,Integer> h= new HashMap<String,Integer>();
		for(String e:a) {
			Integer count=h.get(e);
			if(count==null) {
				h.put(e, 1);
			}
			else {
				h.put(e, count++);
			}
				
		}
		//print all duplicates
		Set<Entry<String,Integer>> entryset=h.entrySet();
		for(Entry<String,Integer> entry:entryset) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
