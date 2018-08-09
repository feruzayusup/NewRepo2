package map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;

public class SortedMapPractice {

	  public static void main(String[] args) {
	    
		 
	 //   HashMap<Integer,String> cityMap = new HashMap<>();
	    // add few items and iterate over it 

	    Comparator<Integer> ci = new KeyReverseComparator();
	 
		
		SortedMap<Integer,String> cityMap = new TreeMap<>();  
		cityMap.put(22, "Alexandria");
	    cityMap.put(34, "Arlington");
	    cityMap.put(30, "FallsChurch");
	    cityMap.put(5, "Fairfax");
	    
	    System.out.println(cityMap);
	    
//	    for (Integer key: cityMap.keySet()) {
//	      
//	      System.out.println("Map key : "+ key);
//	    }
//	    
//	    for (String each : cityMap.values()) {
//	      System.out.println("Map value "+ each);
//	    }
//	    
//	    for(  Entry<Integer, String> eachEntry : cityMap.entrySet()) {
//	      System.out.println( eachEntry.getKey() + "--" + eachEntry.getValue()  );
//	    }
	    
	    
	    // Map is not Iterable 
	    // In order to iterate mapObject we need to get collection view
	    // map.keySet()   map.values()  map.entrySet()
	    
//	    for (Entry<Integer,String> each: cityMap.entrySet()){
//	      System.out.println(each.getValue());
//	      System.out.println(each.getKey());
//	    }
	    
	//    SortedMap<Integer,String> cityMap = new TreeMap<>();
	    
	    
	    
	    
	    

	  }

	}