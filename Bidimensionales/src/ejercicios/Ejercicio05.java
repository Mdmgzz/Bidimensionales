package ejercicios;

import java.util.Arrays;

public class Ejercicio05 {

	public static void main(String[] args) {
		// bloque de variables
		
		int tabla [][]=new int [4][5];
		int sumaFila=0;
		int sumacol=0;
		
		// rellenamos la tabla con numeros aleatorios entre 100 y 999
		for (int n=0 ; n<4;n++) {
			for (int m=0 ; m<5 ; m++) {
				tabla[n][m]=(int) (Math.random()*(999-100)+100);
			}
			
		}
		
		for (int i=0;i<tabla.length;i++) {
			int aux=0;
			for (int j=0 ; j<tabla[i].length ; j++) {
				aux +=tabla[i][j];	
				
			}
			sumaFila += aux;
			System.out.println(Arrays.toString(tabla[i])+" = "+ aux);
		}
		
		for (int col=0;col<tabla[0].length;col++) {
			int aux=0;
			for (int fila=0 ; fila<tabla.length ; fila++) {
				aux +=tabla[fila][col];	
			}
			
			sumacol += aux;
			System.out.print(aux+" ");
			
		}
		System.out.println(" = "+sumacol+" " + sumaFila);

	}
}

