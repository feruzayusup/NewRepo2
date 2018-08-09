package map;

import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

public class PropertyClass {

	public static void main(String[] args) {

		Properties prop = new Properties();
		//what is synchronized
		
		prop.setProperty("Tyson", "20282");
		prop.setProperty("Fairfax", "20987");
		prop.setProperty("Houston", "657463");
		prop.setProperty("SugarLand", "3456677");
		prop.setProperty("Missouri", "54673");
		
		System.out.println(prop);
		
		System.out.println(prop.getProperty("Tyson"));
		System.out.println(prop.put("1", "2"));
		System.out.println();
		/*
		 * it should be an OBJECT cant be a String
		 */
		
		
		Set<Entry<Object, Object>> entries = prop.entrySet();
		
		for(Entry<Object, Object> each : entries) {
			System.out.println(each.getValue());
			System.out.println(each.getKey());

			
		}		
	}

}
