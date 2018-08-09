package IO_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FileNIO {
	public static void main(String[] args) throws IOException {
		
		List<String> lines = Arrays.asList(new String[] {"a","b","c"});
		
		
		Path file = Paths.get("output//testNIO.txt");
		Files.write(file, lines, new OpenOption[] { StandardOpenOption.TRUNCATE_EXISTING,
				StandardOpenOption.CREATE});
	
		Iterator<String> it = Files.lines(file).iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
			System.out.println("=======");
		lines = Files.readAllLines(file);
		System.out.println(lines);
		
		BufferedReader br = Files.newBufferedReader(file);
		BufferedWriter bw = Files.newBufferedWriter(file);
	}

}

