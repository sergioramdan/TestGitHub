package ar.edu.unlam.dominio;

public class Sala {

	private int precio;
	private String nombreSala;
	private int fila;
	private int columna;

	public Sala(int precio, String nombreSala) {
		this.precio = precio;
		this.nombreSala = nombreSala;
		this.fila = 0;
		this.columna = 0;

	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}
	
	public int capacidadSalas() {
		int cantAsientos = 0;
		
		switch(this.precio) {
		case 200:
			this.fila = 27;
			this.columna = 10;
			cantAsientos = this.fila * this.columna;
		case 300:
			this.fila = 27;
			this.columna = 8;
			cantAsientos = this.fila * this.columna;
		case 400:
			this.fila = 27;
			this.columna = 12;
			cantAsientos = this.fila * this.columna;
		case 1500:
			this.fila = 27;
			this.columna = 11;
			cantAsientos = this.fila * this.columna;
		}
		return cantAsientos;
	}

}
