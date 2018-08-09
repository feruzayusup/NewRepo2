package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SortedMapPracticeGulnoza {

	public static void main(String[] args) {

		  // Map is not Iterable 
	    // In order to iterate mapObject we need to get collection view
	    // map.keySet()   map.values()  map.entrySet()
		
		HashMap<Integer,String>cityMap=new HashMap<>();
		
		cityMap.put(78717, "Austin");
		cityMap.put(77498, "Houston");
		cityMap.put(23456,"San Antonio");
		cityMap.put(54321, "Dallas");
		

		Set<Integer>keyView  = cityMap.keySet();//these are just saving the key as a variable
		Collection<String>valueView  = cityMap.values();
		Set<Entry<Integer,String>>entryView = cityMap.entrySet();
		
		//how to get all the keys
		for (Integer key : cityMap.keySet()) {
			System.out.println("Map key: " +key);   
		}
		//how to print out values
		for (String each : cityMap.values()) {
			System.out.println("Map value: " + each);
		}
		
		//to get both keys and values
		for (Entry<Integer,String> eachEntry : cityMap.entrySet()) {
			System.out.println(eachEntry.getKey() + "--" + eachEntry.getValue());
		}
		
		  
		// or to get the keys and values we can create Entry object then use for each loop.
		 Set<Entry<Integer,String>>entries=	cityMap.entrySet();// entrySet() methods works with key and value, so it prints both!
		  
		  for (Entry<Integer,String> each : entries) {
			 
			System.out.println(each.getKey()+ " ");
			System.out.println(each.getValue() );
		  }	
		  System.out.println(cityMap);
			
	}

}
