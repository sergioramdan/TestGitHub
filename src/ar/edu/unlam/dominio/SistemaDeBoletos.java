package ar.edu.unlam.dominio;

public class SistemaDeBoletos {
	private static int boleto2D = 400;
	private static int boleto3D = 600;
	private static int boleto4D = 900;
	private static int boletoXD = 800;
	private static int contador = 0;

	public  int Sala2D(int cantidadDeBoletos) {
		int boleto = 0;
		for (int i = 0; i < cantidadDeBoletos; i++) {
			boleto += boleto2D;
			contador++;
		}
		mostrarMensajePorConsola("El valor total de entradas es: " + boleto);
		System.out.println("el contador es: " + contador);
		return boleto;
	}

	public static int Sala3D(int cantidadDeBoletos) {

		int boleto = 0;
		for (int i = 0; i < cantidadDeBoletos; i++) {
			boleto += boleto3D;
			contador++;
		}
		mostrarMensajePorConsola("El valor total de entradas es: " + boleto);
		return boleto;
	}

	public static int Sala4D(int cantidadDeBoletos) {

		int boleto = 0;
		for (int i = 0; i < cantidadDeBoletos; i++) {
			boleto += boleto4D;
			contador++;
		}
		mostrarMensajePorConsola("El valor total de entradas es: " + boleto);
		return boleto;

	}

	public static int SalaXD(int cantidadDeBoletos) {

		int boleto = 0;
		for (int i = 0; i < cantidadDeBoletos; i++) {
			boleto += boletoXD;
			contador++;
		}
		mostrarMensajePorConsola("El valor total de entradas es: " + boleto);
		return boleto;
	}
	
	public int boletosTotales() {
		System.out.println("La cantidad de boletos vendidos para esta sala es: " + contador);
		return contador;
	}
	
	private static void mostrarMensajePorConsola(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static void imprimir(String mensaje) {
		System.out.println("" + mensaje);
	}
}
