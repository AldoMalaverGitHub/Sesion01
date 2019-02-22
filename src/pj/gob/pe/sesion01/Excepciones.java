package pj.gob.pe.sesion01;

public class Excepciones {
	
	public Integer dividirValores(Integer valor1, Integer valor2) throws Exception{
		return valor1/valor2;
	}
	
	public static void main(String[] args) {
		
		Excepciones excepciones = new Excepciones();
		
		try{
			excepciones.dividirValores(0, 0);
			//int valor = 0/0;
			//System.out.println(valor);
			
		}catch(Exception ex){
			ex.printStackTrace();
			
		}finally{
			
		}
		System.out.println("Ingreso al sistema");
	}

}
