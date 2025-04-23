package lnb;

public class Persona {
	
	private String nobmre;
	private String apellido;
	
	public Persona(String nobmre, String apellido) {
		super();
		this.nobmre = nobmre;
		this.apellido = apellido;
	}

	public String getNobmre() {
		return nobmre;
	}

	public void setNobmre(String nobmre) {
		this.nobmre = nobmre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Persona [nobmre=" + nobmre + ", apellido=" + apellido + "]";
	}
	
	
	
	
	
}
