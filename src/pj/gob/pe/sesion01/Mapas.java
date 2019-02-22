package pj.gob.pe.sesion01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Mapas {
	
	public static void main(String[] args) {
		
		Map<String, String> alumnos = new HashMap<>();
		alumnos.put("1", "Aldo");
		alumnos.put("2", "Jhordy");
		alumnos.put("3", "Jhonny");
		alumnos.put("3", "Carmen");
		
		// alumnos.remove("3");
		System.out.println(alumnos.get("3"));
		
		Set<String> nombres = new HashSet<>();
		nombres.add("Aldo");
		nombres.add("Carmen");
		nombres.add("Carmen");
	
		
		
		System.out.println(nombres.size());
	}

}
