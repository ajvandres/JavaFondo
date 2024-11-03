package libro.cap02.colecciones;
import java.util.Scanner;

public class TestMiColeccion {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		MiColeccion<String> nombresDePersonas = new MiColeccion<String>(5);
		
		System.out.println("Ingrese un Nombre: ");
		String nombre = scanner.next();
		
		while(!nombre.equals("Fin"))
		{
			nombresDePersonas.insertar(nombre,0);
			System.out.println("Ingrese un Nombre: ");
			nombre = scanner.next();			
		}		
		
		String aux;		
		
		for(int i=0; i<nombresDePersonas.cantidad(); i++ )
		{		
			aux = nombresDePersonas.obtener(i);
			System.out.println(aux +" - "+aux.length()+" caracteres");
		}
	}

}
