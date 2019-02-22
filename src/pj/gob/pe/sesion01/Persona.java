package pj.gob.pe.sesion01;

/*
 * public -- modificador de acceso (public, private, protected, por default)
 */
public class Persona {
	
	public static final int VALOR_MINIMO = 0;
	public static final double PI = 3.1416;
	
	private Integer edad;
	private String nombres;
	private String apellidos;
	private String estadoCivil;
	
	public Persona(){
		
		this.edad = 0;
		estadoCivil = "amigovio";
		
	}

	public Persona(int edad){
		this.edad = edad;
	}
	
	public Persona(String nombre){
		
	}

	/*
	 * int, char, long, float, double, boolean, byte, short (tipo de datos primitivos)
	 * Integer, Character, String, Long, Float, Double, Boolean, Byte, Short (tipo de dato clase)
	 */
	
	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public int calcularEdades(int nuevaEdad){
		return this.edad * nuevaEdad;
	}
	
	
	//varargs variables de argumentos	
	public static void main(String[] args) {
		System.out.println("Hola Java Developers");
		Docente docente = new Docente();
		
		Persona persona = new Persona();
		persona.setEdad(18);
		System.out.println("Mi edad es:" + persona.getEdad());
		
		System.out.println("Mi nueva edad es: " + persona.calcularEdades(10));
		
		System.out.println(Persona.VALOR_MINIMO);
		
		Persona persona1 = new Persona(10);
		System.out.println(persona1.getEdad());
		System.out.println(persona.getEdad());
		
		String nombres = new String("");
	}



}
