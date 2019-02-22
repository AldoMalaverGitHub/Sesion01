package pj.gob.pe.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class EjercicioMain {

	public static void main(String[] args) {
		
		List<Rol> roles = new ArrayList<>();
		
		Rol rol = new Rol();
		rol.setId(1);
		rol.setNombre("Administrador");
		roles.add(rol);
		
		rol = new Rol();
		rol.setId(2);
		rol.setNombre("Invitado");
		roles.add(rol);
		
		rol = new Rol();
		rol.setId(3);
		rol.setNombre("Contribuidor");
		roles.add(rol);
				
		List<Usuario> listaUsuarios = new ArrayList<>();
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setUsuario("amalaver");
		usuario.setPassword("abc.123");
		usuario.setRol(roles.get(0));
		listaUsuarios.add(usuario);
		
		usuario = new Usuario();
		usuario.setId(2);
		usuario.setUsuario("jgavino");
		usuario.setPassword("a**123");
		
		
		
		for(Rol rol1: roles){
			if(rol1.getNombre().equals("Invitado")){
				usuario.setRol(rol1);
				break;
			}
		}
		//docker run --name mysql57 -e MYSQL_ROOT_PASSWORD=mysql -d mysql:5.7
		
		usuario.setUsuario("solin");
		usuario = new Usuario();
		listaUsuarios.add(usuario);
		usuario.setRol(roles.get(1));
		
		Usuario usuario3 = new Usuario();
		usuario3.setId(3);
		usuario3.setUsuario("conrad");
		usuario3.setPassword("123ddd");		
		usuario3.setRol(roles.get(1));
		listaUsuarios.add(usuario3);
		
		for(Usuario usuario1: listaUsuarios){
			if(usuario1.getRol().getNombre().equals("Invitado")){
				System.out.println("id:" + usuario1.getId());
				System.out.println("nombre:" + usuario1.getUsuario());
				System.out.println("id rol:" + usuario1.getRol().getId());
				
			}
		}
	}
}
