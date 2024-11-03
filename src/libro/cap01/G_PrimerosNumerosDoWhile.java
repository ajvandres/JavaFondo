package libro.cap01;
import java.util.Scanner;

public class G_PrimerosNumerosDoWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un valor tope para listar sus numeros naturales");
		int valor = scanner.nextInt();
		int contador = 1;
		
		
		do
		{
			System.out.println("Numero "+contador);
			contador++;
		} while(contador <= valor);


	}

}
