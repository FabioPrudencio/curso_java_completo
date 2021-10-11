package exercises;

import java.util.Map;
import java.util.TreeMap;

public class AppMap1 {

	public static void main(String[] args) {
		
		Map<String, String> cookies =  new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email", "maria@gmail.com"); //Remove pela chave e valor
		cookies.remove("email"); //Remove pela chave
		
		cookies.put("phone", "99771133");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("All COOKIES:");		
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
			
		
	}
	
	
}