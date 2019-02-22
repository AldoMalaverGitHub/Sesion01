package pj.gob.pe.sesion01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Listas {
	
	public static void main(String[] args) {
		ArrayList<String> listaNombres = new ArrayList<>();
		listaNombres.add("Jhonny");
		
		System.out.println(listaNombres.get(0));
		System.out.println(listaNombres.size());
		
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		Persona persona = new Persona();
		persona.setNombres("Carmen");
		
		listaPersonas.add(persona);
		
		
		Persona persona2 = new Persona();
		persona2.setNombres("Solin");
		listaPersonas.add(persona2);
		
		Persona persona3 = new Persona();
		persona3.setNombres("Aldo");
		listaPersonas.add(persona3);
		
		for(Persona p: listaPersonas){
			System.out.println(p.getNombres());
			
		}
		
		System.out.println(listaPersonas.size());
		listaPersonas.remove(2);
		
		System.out.println(listaPersonas.size());
		
		List<Persona> listaPersonas2 = new ArrayList<>();
		IPersona per = new Alumno(10);
		List<String> apellidos = Arrays.asList("Malaver", "Gavino", "Lezama");
		//Integer valor = 10;
		//Integer valor = 20;
		
		
	}

}
