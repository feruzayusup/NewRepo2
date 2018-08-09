package map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyTest {

	public static void main(String[] args) {

		String str = "vbsdkvbkdbvdbvcbvbvlksbcvclsbvjlbvlxblvbxlb";

		Map<Character, Integer> CharMap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (!CharMap.containsKey(str.charAt(i))) {
				CharMap.put(str.charAt(i), 1);
			} else {
				CharMap.put(str.charAt(i), CharMap.get(str.charAt(i))+1);
			}
		}
		System.out.println(CharMap);

	}
}