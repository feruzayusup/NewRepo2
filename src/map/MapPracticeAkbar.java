package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPracticeAkbar {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Adam", "Adam", "Bob", "Dave", "Bob");

		///
		Map<String, Integer> freqMap = new HashMap<>();

		for (String each : names) {

			if (!freqMap.containsKey(each)) {
				freqMap.put(each, 1);
			} else {
				int exitsingCount = freqMap.get(each);
				freqMap.put(each, exitsingCount + 1);   
			}
		}
		/// if your key does not exists in the map yet
		// --> your count will be 1
		/// if it already exists your count will be
		// existing value incremented by 1

		// freMap.put(each, 0) ;

		System.out.println(freqMap);

	}

}
