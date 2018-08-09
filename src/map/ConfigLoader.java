package map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

	// this is how we load file

	public static void main(String[] args) {

		// String url = ConfigLoader.getMyValue("a key in here") ;
		// driver.get(url) ;

		Properties prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream("config.properties");
			prop.load(fis);

		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println(prop.getProperty("fairfax"));
		System.out.println("<" + prop.getProperty("Washington") + ">");

		/// Create different property file called Config2.properties
	}
}