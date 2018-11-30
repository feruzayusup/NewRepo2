package narinahon;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapPrac {

	public static void main(String[] args) {

		Map<String, Integer> name = new HashMap<>();

		name.put("a", 23);
		name.put("b", 23);
		name.put("k", 23);
		name.put("x", 23);

		for (Entry<String, Integer> maps : name.entrySet()) {
			System.out.print(maps.getKey());
			System.out.print(maps.getValue());  //prints key and value one by one
		}
	}

}
