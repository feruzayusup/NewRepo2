package parse;

import java.util.ArrayList;
import java.util.List;

public class WithoutSplitParsingString {

	public String[] parseString(String str, String p) {
		
		// split the string STR by String p
		
		List<String> parsed = new ArrayList<String>();
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + p.length()).equals(p)) {
				parsed.add(temp);
				i = i + p.length() - 1;
				temp = "";
			} else if (i == str.length() - 1) {
				temp += str.charAt(i);
				parsed.add(temp);
			} else
				temp += str.charAt(i);
		}
		String[] result = new String[parsed.size()];
		result = parsed.toArray(result);

		return result;

	}

}
