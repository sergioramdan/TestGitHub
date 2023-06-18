package ar.edu.unlam.interfaz;

import ar.edu.unlam.dominio.*;

import java.util.Scanner;

public class VentaDeBoletos {

	public static void main(String[] args) {
		//creamos el objeto scanner con el nombre teclado
		Scanner teclado = new Scanner(System.in); 
		
		//enum con las peliculas
		Peliculas pelicula = null;
		
		//creamos el objeto cine con el nombre hoyts
		Cine hoyts = new Cine(pelicula); 

		int opcion = 0;
		
		System.out.println("Bienvenido al Cine Hoyts! ");
		imprimir("\nSeleccione una opción:" + "\n1- Mostrar peliculas en cartelera"
				+ "\n2- Mostrar sala \n3- Elegir sala" + "\n4- Elegir comida \n5- Finalizar \n6- Salir");
		
		do {
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1: //Mostrar peliculas en cartelera
				hoyts.mostrarPeliculas();
				hoyts.elegirPelicula();
				hoyts.menu();
				break;
			case 2: // Mostrar Sala
				//Codigo de Mili
				hoyts.mostrarSalas();
				break;
			case 3: //Elegir Sala
				//Codigo de Mili
				System.out.println("caso 3");
				hoyts.menu();
				break;
			case 4: // Elegir Comida
				//Codigo de Alexis
				System.out.println("caso 4");	
				hoyts.menu();
				break;
			case 5: //Finaliza -> Podriamos poner el metodo de pago 
				System.out.println("caso 5");
				hoyts.menu();
				break;
			case 6: //Salir
				hoyts.menu();
				System.out.println("Elegio la opcion Salir");
				break;
			}
		} while (opcion >= 1 && opcion < 6);
		
		
		teclado.close(); //cierra el metodo Scanner
	} // termina el main
	

	//metodo para imprimir por pantalla
	public static void imprimir(String mensaje) {
		System.out.println(mensaje);
	}

}