package NO_file;
//package IO_file;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class CSVwrite {
//		  public static void main(String[] args) {
//		    Faker fake = new Faker();
//		    File d = new File("./output");
//		    d.mkdirs();
//		    File f = new File(d, "data.csv");
//		  
////		    FileWriter fw = new FileWriter(f);
////		    BufferedWriter bw = new BufferedWriter(fw);
//		//    
////		    // write data to file
//		//    
////		    bw.close();
//		    
//		    try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
//		      bw.write("First Name,Last Name,Country\n");
//		      
//		      for(int i = 0; i < 10; i++) {
//		        String fName = fake.name().firstName();
//		        String lName = fake.name().lastName();
//		        String country = fake.address().country();
//		        
//		        bw.write(fName + "," + lName + "," + country + "\n");
//		      }
//		    } catch (IOException e) {
//		      e.printStackTrace();
//		    }
//		    
//		    
//		    
//
//}
