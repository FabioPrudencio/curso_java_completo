package exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppHashMapCandidates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> candidates = new HashMap<>();

		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		// String path = "c:\\temp\\votes.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] campos = line.split(",");
				candidates.put(campos[0], Integer.parseInt(campos[1]) + (candidates.get(campos[0]) != null ? candidates.get(campos[0]) : 0));
				line = br.readLine();
			}

			for (String candidate : candidates.keySet()) {
				System.out.println(candidate + ": " + candidates.get(candidate));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();

	}

}
