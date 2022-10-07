package sistemaSolar;

public class SistemaSolar {
private Planeta[] planetas;
private String estrellas;

public SistemaSolar(Planeta[] planeta,String estrella) {
	this.planetas=planeta;
	this.estrellas=estrella;
}

public Planeta[] getPlanetas() {
	return planetas;
}

public void setPlanetas(Planeta[] planeta) {
	this.planetas = planeta;
}

public String getEstrellas() {
	return estrellas;
}

public void setEstrellas(String estrellas) {
	this.estrellas = estrellas;
}

}
