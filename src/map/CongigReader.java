package map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CongigReader {
	private static Properties prop;
	/* 
	 * creating static block to not load file each and every time
	 */
	
	// String url = ConfigLoader.getMyValue("a key in here") ; 
	  // driver.get(url) ; 
	  
	    static {
	         prop = new Properties();
	      
	      try {
	        FileInputStream fis = new FileInputStream("config.properties");
	        prop.load(fis);
	      
	      
	      } catch (IOException e) {
	        
	        e.printStackTrace();
	      }
	      
	      
	    }
	  
	  
	    public static String getMyValue(String key) {
	      

	      
	      //System.out.println( prop.getProperty("fairfax") );
	      String value = prop.getProperty(key) ; 

	      return value ; 
	    
	    }
	    
	    

}
