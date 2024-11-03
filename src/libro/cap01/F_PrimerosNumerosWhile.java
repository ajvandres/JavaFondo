package libro.cap01;
import java.util.Scanner;

public class F_PrimerosNumerosWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un valor tope para listar sus numeros naturales");
		int valor = scanner.nextInt();
		int contador = 1;
		
		
		while(contador <= valor)
		{
			System.out.println("Numero "+contador);
			contador++;
		}

	}

}
