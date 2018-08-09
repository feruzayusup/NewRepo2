package IO_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CSVread {
		  public static List<Map<String, String>> loadCSVdata(String filename){
		    List<Map<String, String>> data = new ArrayList<>();
		        
		    try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
		      String[] attributes = br.readLine().split(",");
		      String line = null;
		      
		      while ( (line = br.readLine()) != null ) {
		        String[] values = line.split(",");
		        if (values.length == 0 && values[0].length() == 0) break;
		        
		        Map<String, String> row = new TreeMap<>();
		        for (int i = 0; i < attributes.length; i++)
		          row.put(attributes[i], values[i]);
		        data.add(row);
		      }
		    } catch (IOException e) {
		      e.printStackTrace();
		    }

		    return data;
		  }
		  
		  public static void main(String[] args) {
		    List<Map<String, String>> data = loadCSVdata("output/data.csv");
		    for (Map<String, String> row : data) {
		      System.out.println(row);
		    }
		    
		    System.out.println(data.get(2).get("First Name"));
		    
		  }
		}



