package mapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapToArrayList 
{

	public static void main(String[] args)
	{
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		hm.put("google", 10000);
		hm.put("walmart", 1000);
		hm.put("dmart", 5000);
	    hm.put("Amazon", 20000);
		hm.put("apple", 30000);
         
		Iterator it= hm.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry pairs= (Entry) it.next();
			System.out.println(pairs.getKey()+"  "+pairs.getValue());
		}
		//converting HashMap values into ArrayList
		List<String> a= new ArrayList<String>(hm.keySet());
		System.out.println(a);
		for(String e:a) {
			System.out.println(e);
		}
		//converting values into ArrayList
		List<Integer> al= new ArrayList<Integer>(hm.values());
		for(Integer e:al) {
			System.out.println(e);
		}
		
		
	}

}
