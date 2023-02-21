package ejercicios;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		//bloque de variables
				int tabla [][]= new int [11][10];
				
				// creamos un for para rellenar el array
				
				for ( int i=0; i<tabla.length;i++) {
					
					for (int j=0;j<10;j++) {
						tabla[i][j]=i*j;
						
					}
					System.out.println(Arrays.toString(tabla[i]));
				}
				for (int i=0 ; i<tabla.length;i++) {
					for (int j=0 ; j<tabla[i].length ;j++) {
						System.out.print(tabla[i][j] + " ");
					}
					System.out.println();
					}
			

	}

}
