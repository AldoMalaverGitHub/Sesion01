package pj.gob.pe.sesion01;

public interface IPersona {
	
	//definicion
	Integer getEdad();
	
	void setEdad(Integer edad);
	
	
	//implementacion
	//java 8
	default void getDatos(){
		System.out.println("Java");
	}
	
	public static int devolverValor(){
		return 10;
	}

}
