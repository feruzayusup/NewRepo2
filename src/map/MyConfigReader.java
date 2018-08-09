package map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

public class MyConfigReader {

	public static void main(String[] args) {

		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("config2.properties");
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}

		Set<Entry<Object, Object>> entries = prop.entrySet();
		
		for(Entry<Object, Object> each : entries) {
			System.out.println(each.getValue());
			System.out.println(each.getKey());
			System.out.println(entries);  //[houston=77036, missouri-77459]
			System.out.println(prop.getProperty("fairfax"));          //these are not in my file, therefore is null printed
			System.out.println(prop.getProperty("Washington DC"));
			System.out.println(prop.getProperty("Houston"));
			
			
			
//			String url = ConfigLoader.getPropertyValue("key");
//			driver.get(url);
	}
}
	
}