package ar.edu.unlam.dominio;


import java.util.Scanner;

public class Cine {
	//enum con las peliculas
	private Peliculas peliculaElegida;
	
	//se crea el array con cada sala de cine y su precio
	private Sala[] sala = new Sala[4]; {	
		sala[0] = new Sala(200, "2D");
		sala[1] = new Sala(300, "3D");
		sala[2] = new Sala(400, "4D");
		sala[3] = new Sala(1500, "XD");
	}
	
	//constructor
	public Cine(Peliculas peliculaElegida) {
		this.peliculaElegida = peliculaElegida;
	}
	
	
	//metodos para mostrar las peliculas
	public void mostrarPeliculas() {
		System.out.println("¿Que pelicula desea ver?");
		imprimir("Seleccione una película \n1- " + Peliculas.AQUAMAN + "\n2- " + Peliculas.BATMAN + "\n3- " + Peliculas.SPIDERMAN + "\n4- " + Peliculas.SUPERMAN);
		
	}
	
	
	//metodo para elegir la pelicula a traves de un switch
	public void elegirPelicula() {
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		
		int num = numero + 1;
		Peliculas pelicula = null;

		switch (numero) {
		case 1:
			pelicula = Peliculas.AQUAMAN;
			imprimir("Usted ha seleccionado: " + pelicula);
			break;
		case 2:
			pelicula = Peliculas.BATMAN;
			imprimir("Usted ha seleccionado: " + pelicula);
			break;
		case 3:
			pelicula = Peliculas.SPIDERMAN;
			imprimir("Usted ha seleccionado: " + pelicula);
			break;
		case 4:
			pelicula = Peliculas.SUPERMAN;
			imprimir("Usted ha seleccionado: " + pelicula);
			break;
		default:
			System.out.println("Seleccione una opción existente");
			break;
		}
		this.peliculaElegida = pelicula;
		
	}
	
	
	//metodo para mostrar sala
	public void mostrarSalas() {
		imprimir("Seleccione una sala: ");
		for(int i = 1; i < 5; i++) {
			imprimir(i + "- Sala " + sala[i-1].getNombreSala() + ": $" + sala[i-1].getPrecio());
		}
	}
	
	//metodo para imprimir un mensaje por consola
	public static void imprimir(String mensaje) {
		System.out.println(mensaje);
	}

	//metodo para imprimir el menu por consola
	public void menu() {
		System.out.println("\nSeleccione una opción:" + "\n1- Mostrar peliculas en cartelera"
					+ "\n2- Mostrar sala \n3- Elegir sala" + "\n4- Elegir comida \n5- Finalizar \n6- Salir");
	}
}