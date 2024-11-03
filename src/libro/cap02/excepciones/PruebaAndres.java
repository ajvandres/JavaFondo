package libro.cap02.excepciones;
import java.util.ResourceBundle;


public class PruebaAndres {

	public static void main(String[] args) {
		

		try
		{
			int i[] = new int[2];
			i[3] = 4;
			
		}
		catch(Exception ex)
		{
		//Throwable ex = new Throwable() ;
		//ResourceBundle rb = ResourceBundle.getBundle("usuario");
		throw new RuntimeException("Error verificando datos", ex);
		}
	}

}
