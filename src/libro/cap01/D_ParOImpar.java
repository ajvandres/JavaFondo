package libro.cap01;
import java.util.Scanner;

public class D_ParOImpar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un valor");
		int valor = scanner.nextInt();
		
		int resto = valor % 2;
		
		if (resto % 2 == 0)
		{
			System.out.println(valor + " es par");
		}
		else
		{
			System.out.println(valor + " es impar");
		}

	}

}
