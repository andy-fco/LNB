package lnb;

import java.util.ArrayList;

public class Evento {

	//Atributos 
	private String titulo;
	private String descripcion;
	private String fechaYHora;
	private ArrayList<Aficionado> inscriptos;
	private int capMax;
	
	//Constructor
	public Evento(String titulo, String descripcion, String fechaYHora, ArrayList<Aficionado> inscriptos, int capMax) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaYHora = fechaYHora;
		this.inscriptos = inscriptos;
		this.capMax = capMax;
	}

	
	//Getters & Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechaYHora() {
		return fechaYHora;
	}

	public void setFechaYHora(String fechaYHora) {
		this.fechaYHora = fechaYHora;
	}

	public ArrayList<Aficionado> getInscriptos() {
		return inscriptos;
	}

	public void setInscriptos(ArrayList<Aficionado> inscriptos) {
		this.inscriptos = inscriptos;
	}

	public int getCapMax() {
		return capMax;
	}

	public void setCapMax(int capMax) {
		this.capMax = capMax;
	}

	
	//To String
	@Override
	public String toString() {
		return "Evento [titulo=" + titulo + ", descripcion=" + descripcion + ", fechaYHora=" + fechaYHora
				+ ", inscriptos=" + inscriptos + ", capMax=" + capMax + "]";
	}
	
	
	
	
	
	
	
}
