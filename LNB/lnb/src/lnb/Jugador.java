package lnb;

public class Jugador extends Persona{

	private int media;
	private String posicion;
	private String nacionalidad;
	private Equipo equipo;
	private int tiro;
	private int dribling;
	private int velocidad;
	private int pase;
	private int defensa;
	private int salto;
	private String dOfBirth;
	private String ciudad;
	private float altura;
	private String manoHabil;
	private String especialidad;
	private String jugada;
	
	
	public Jugador(String nobmre, String apellido, int media, String posicion, String nacionalidad, Equipo equipo,
			int tiro, int dribling, int velocidad, int pase, int defensa, int salto, String dOfBirth, String ciudad,
			float altura, String manoHabil, String especialidad, String jugada) {
		super(nobmre, apellido);
		this.media = media;
		this.posicion = posicion;
		this.nacionalidad = nacionalidad;
		this.equipo = equipo;
		this.tiro = tiro;
		this.dribling = dribling;
		this.velocidad = velocidad;
		this.pase = pase;
		this.defensa = defensa;
		this.salto = salto;
		this.dOfBirth = dOfBirth;
		this.ciudad = ciudad;
		this.altura = altura;
		this.manoHabil = manoHabil;
		this.especialidad = especialidad;
		this.jugada = jugada;
	}


	public int getMedia() {
		return media;
	}


	public void setMedia(int media) {
		this.media = media;
	}


	public String getPosicion() {
		return posicion;
	}


	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public Equipo getEquipo() {
		return equipo;
	}


	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}


	public int getTiro() {
		return tiro;
	}


	public void setTiro(int tiro) {
		this.tiro = tiro;
	}


	public int getDribling() {
		return dribling;
	}


	public void setDribling(int dribling) {
		this.dribling = dribling;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public int getPase() {
		return pase;
	}


	public void setPase(int pase) {
		this.pase = pase;
	}


	public int getDefensa() {
		return defensa;
	}


	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}


	public int getSalto() {
		return salto;
	}


	public void setSalto(int salto) {
		this.salto = salto;
	}


	public String getdOfBirth() {
		return dOfBirth;
	}


	public void setdOfBirth(String dOfBirth) {
		this.dOfBirth = dOfBirth;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public String getManoHabil() {
		return manoHabil;
	}


	public void setManoHabil(String manoHabil) {
		this.manoHabil = manoHabil;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	public String getJugada() {
		return jugada;
	}


	public void setJugada(String jugada) {
		this.jugada = jugada;
	}


	@Override
	public String toString() {
		return "Jugador [media=" + media + ", posicion=" + posicion + ", nacionalidad=" + nacionalidad + ", equipo="
				+ equipo + ", tiro=" + tiro + ", dribling=" + dribling + ", velocidad=" + velocidad + ", pase=" + pase
				+ ", defensa=" + defensa + ", salto=" + salto + ", dOfBirth=" + dOfBirth + ", ciudad=" + ciudad
				+ ", altura=" + altura + ", manoHabil=" + manoHabil + ", especialidad=" + especialidad + ", jugada="
				+ jugada + "]";
	}
	
	
	
	
}
