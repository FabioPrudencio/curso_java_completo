package excercise;

import java.util.Scanner;

public class AppMatrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite dois numeros inteiros: ");			
		int M = sc.nextInt();
		int N = sc.nextInt();
	
		int[][] mat = new int[M][N];
		
		System.out.println("Digite " + N + " numeros:");		
		for (int i = 0; i<mat.length;i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Digite um número de referencia: ");
		int X = sc.nextInt();
		
		System.out.println();
		for (int i = 0; i<mat.length;i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == X) {
					System.out.println("Position: "+i+","+j);
					if (j > 0)
						System.out.println("Left: " + mat[i][j-1]);
					if (j+1<mat[i].length)
						System.out.println("Right: " + mat[i][j+1]);
					if (i > 0)
						System.out.println("Up: " + mat[i-1][j]);
					if (i+1<mat.length)
						System.out.println("Down: " + mat[i+1][j]);
				}
			}
		}
		sc.close();
	}

}
