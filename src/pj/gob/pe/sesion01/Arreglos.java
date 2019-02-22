package pj.gob.pe.sesion01;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {

		String[] arrNombres = new String[8];
		int[] arrNombres1 = new int[8];
		int arrNombres2[] = new int[8];

		arrNombres[0] = "Sergio";
		System.out.println(arrNombres[0]);
		System.out.println(arrNombres[1]);
		
		try{
			System.out.println(arrNombres[8]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Hubo un error de tamaño");
		}
		

		int[] personas, animales;

		int personas1[], animales1;

		System.out.println(arrNombres.length);
		// indice = indice + 1;
		for (int indice = 0; indice < arrNombres.length; indice++) {
			if (indice != 0) {
				System.out.println("arrNombres[" + indice + "]" + arrNombres[indice]);
				System.out.println("Hola");
			}
		}

		for (String valor : arrNombres) {
			if ("Sergio".equals(valor))
				System.out.println(valor);
		}
		
		String[] insectos = { "cricket", "beetle", "ladybug" };
	    String [] alias = insectos;
	    System.out.println(insectos.equals(alias)); 
	    System.out.println(insectos.toString()); 
	    System.out.println(Arrays.toString(insectos));
	    
	    Alumno alumno = new Alumno(1);
	    System.out.println(alumno);
	    
	    //inmutable
	    String nombres = "Aldo" + "Junior" + "Malaver" + "18" + "14 exp";
	    
	    //mutable
	    StringBuilder nombresBuilder = new StringBuilder();
	    nombresBuilder.append("Aldo").append("JUnior");
	   System.out.println(nombresBuilder.toString());
	    nombres = nombresBuilder.toString();
	    


	}

}
