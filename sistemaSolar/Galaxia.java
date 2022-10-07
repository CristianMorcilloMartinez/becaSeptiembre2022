package sistemaSolar;

public class Galaxia {

	public static void imprimeSistemaSolar(SistemaSolar SS) {

		System.out.println("SISTEMA SOLAR CON SATÉLITE: " + SS.getEstrellas());
		System.out.println("LISTA DE PLANETAS DEL SISTEMA");
		System.out.println();
		Planeta planetas[]=SS.getPlanetas();
		for (int i = 0; i < planetas.length; i++) {
			int cont=i+1;
			System.out.println("PLANETA "+cont);
			System.out.println("NOMBRE: "+planetas[i].getNombre());
			System.out.println("SATÉLITES: "+SS.getPlanetas()[i].getSatelite());
			System.out.println();
			
		}
	}

	public static void main(String[] args) {

		Planeta pla1 = new Planeta("Tierra", "Luna");
		Planeta pla2 = new Planeta("Marte", "Fobos");

		Planeta planetas[] = { pla1,pla2 };

		SistemaSolar SS = new SistemaSolar(planetas, "Sol");
		
		
		
		
		
		Planeta pla3= new Planeta("Mercurio","Prueba");
		
		Planeta planetas2[]= {pla3};
		
		SistemaSolar SS2= new SistemaSolar(planetas2,"Sol2");
		
		
		SistemaSolar Galaxia[]= {SS,SS2};
		

		for (int i = 0; i < Galaxia.length; i++) {
			imprimeSistemaSolar(Galaxia[i]);
		}
		
		
	}

}
