package pj.gob.pe.sesion01;

public class Alumno extends Persona implements IPersona{
	
	private Integer codigoAlumno;
	
	public Alumno(int codigoAlumno){
		super("Aldo");
	}
	
	public void devolverNuevo(){
		
	}
	
	public static void main(String[] args) {
		
//		IPersona persona = new Alumno();
//		IPersona per = new IPersona();
//		
//		Alumno alumno = new Alumno();
//		alumno.getEdad();
		
		Integer miEdad = 10;
		//mi
	}

	@Override
	public Integer getEdad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEdad(Integer edad) {
		// TODO Auto-generated method stub
		
	}

}
