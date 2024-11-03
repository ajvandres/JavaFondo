package libro.cap01;
import java.util.Scanner;

public class H_PrimerosNumerosFor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un valor tope para listar sus numeros naturales");
		int valor = scanner.nextInt();
				
		for(int contador = 1; contador <= valor; contador++)
		{
			System.out.println("Numero "+contador);			
		}

	}

}
