package exercises.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppWriter {

	public static void main(String[] args) {
		
		String[] lines = {"Good morning", "Good afternoon", "Good night"};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ //FileWriter(path, true) o true serve para não recriar o arquivo
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
