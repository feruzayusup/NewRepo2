package IO_file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {
		  public static void main(String[] args) throws IOException {
		    File d = new File("./output");
		    d.mkdirs();
		    File f = new File(d, "test.txt");
		    System.out.println(f.exists());
		    System.out.println(d.isDirectory());
		    System.out.println(f.isDirectory());
		    System.out.println(f.canRead());
		    
		    FileWriter fw = null;
		    try {
		      fw = new FileWriter(f);
		      fw.write("test string 1\n");
		      fw.write("test string 2" + System.lineSeparator()); //  \r\n
		    } catch (IOException e) {
		      e.printStackTrace();
		    } finally {
		      try {
		        fw.close();
		      } catch (IOException e) {
		        e.printStackTrace();
		      }
		    }
		    
		    FileReader fr = new FileReader(f);
		    int c = 0;
		    while ( (c = fr.read()) != -1) {
		      System.out.print((char) c);
		    }
		    fr.close();
		    
		    System.out.println("=====");
		    
		    Scanner sc = new Scanner(f);
		    while (sc.hasNext()) {
		      String line = sc.nextLine();
		      System.out.println(line);
		      Scanner sc2 = new Scanner(line);
		      while (sc2.hasNext())
		        System.out.println(sc2.next());
		    }
		    sc.close();
		    
		    sc = new Scanner(f);
		    PrintWriter pw = new PrintWriter(new File(d, "test_pw.txt"));
		    while(sc.hasNext())
		      pw.println(sc.nextLine());
		    sc.close();
		    pw.close();
		    
		    
		  }
		}


