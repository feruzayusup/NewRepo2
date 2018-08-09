package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		
		/*
		 * HashMap  Vs HashTable
		 * 
		 * HashMap can have 1 null key and null value
		 * HashTable can not have null key and null value
		 * HashMap is not synchronized
		 * HashTable is synchronized
		 * 
		 */

		Map<String, String> map = new HashMap<String, String>() ;
		map.put("key1", null);
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put(null, "value5");

		System.out.println(map.size());
		
		Set<Entry<String, String>> entries = map.entrySet();
		
		for(Entry<String, String> each : entries) {
			System.out.println(each.getKey() + " ");
			System.out.println(each.getValue() + " ");
			System.out.println(each);

			
		
			
			
		}
	}

}
