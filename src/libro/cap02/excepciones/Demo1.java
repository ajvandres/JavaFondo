package libro.cap02.excepciones;

public class Demo1 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Hola, Chau!");
			int i = Integer.parseInt("no es una cadena numerica...");
		}
		catch(Exception ex)
		{
			System.out.println("Entre al catch");
		}
		finally
		{
			// seccion ideal para devolver recursos fisicos, cerrar archivos, conexiones a base de datos, etc
			System.out.println("Esto sale siempre");
		}
	}

}
