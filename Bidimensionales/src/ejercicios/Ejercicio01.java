package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// bloque de variables
		
		int tabla [][]=new int [5][5];
		
		//creamos el scanner
		Scanner sc= new Scanner(System.in);
		
		//creamos el bucle
		for (int n=0 ; n<5;n++) {
			for (int m=0 ; m<5 ; m++) {
				tabla[n][m]=10*n+m;
			}
		}
		for (int i=0 ; i<tabla.length;i++) {
			for (int j=0 ; j<tabla[i].length ;j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
		// cerramos scanner
		sc.close();
	}

}
