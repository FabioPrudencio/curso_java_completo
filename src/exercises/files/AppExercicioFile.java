package exercises.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.ItensSales;

public class AppExercicioFile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String path = "c:\\temp\\sales.csv";
		
		File file = new File(path);
		String strPathTarget = file.getParent() + "\\out";
		File folder = new File(strPathTarget);
		folder.mkdir();
		String strFileTarget = strPathTarget + "\\summary.csv";
		
		
		List<ItensSales> itens = new ArrayList<>();
		String line = null;
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			line = br.readLine();
			while (line != null) {
				itens.add(new ItensSales(line.split(",")[0], Double.parseDouble(line.split(",")[1]), 
						Double.parseDouble(line.split(",")[2])));
				line = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(strFileTarget))){
			for (ItensSales item : itens) {
				bw.write(item.getName() + "," + String.format("%.2f",item.totalValue()));
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Arquivo lido: " + path);
		System.out.println("Arquivo criado: " + strFileTarget);
	}

}
