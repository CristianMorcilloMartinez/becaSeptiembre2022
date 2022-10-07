package sistemaSolar;

public class Planeta {
	private String nombre;
	private String satelite;

	public Planeta(String nombre, String satelite) {
		this.nombre = nombre;
		this.satelite = satelite;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSatelite() {
		return satelite;
	}

	public void setSatelite(String satelite) {
		this.satelite = satelite;
	}
	
	
}
