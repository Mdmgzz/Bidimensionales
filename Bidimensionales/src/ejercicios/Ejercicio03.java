 	package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// bloque de variables
		double tabla [][]= new double [4][5];
		double media=0;
		double aux=0;
		// creamos scanner para poder introducir las notas
		Scanner sc= new Scanner (System.in);
		
		
		for ( int i=0; i<tabla.length;i++) {
			System.out.println("Introduce las notas para el alumno: ");
			for (int j=0;j<5;j++) {
				System.out.println((j+1)+" asignatura");
				tabla[i][j]=sc.nextInt();
				
				}
			}
		for (int i=0 ; i<tabla.length;i++) {
			aux=0;
			System.out.println("Alumno"+(i+1));
			for (int j=0 ; j<tabla[i].length ;j++) {
				System.out.print(tabla[i][j] + " ");
				aux+=tabla[i][j];
			}
			media = aux/5;
			System.out.println("la nota media es de : "+media);
			System.out.println();
		}
		
		
		
		
		//cerramos scanner 
		sc.close();
	}
}
