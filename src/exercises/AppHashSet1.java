package exercises;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppHashSet1 {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
				
		//System.out.println(set.contains("Notebook"));
		//set.remove("Tablet");
		//set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set) {
			System.out.println(p);
		}
	}

}
