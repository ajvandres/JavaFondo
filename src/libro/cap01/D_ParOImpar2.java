package libro.cap01;
import java.util.Scanner;

public class D_ParOImpar2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un valor");
		int valor = scanner.nextInt();
		
		int resto = valor % 2;
		
		String mensaje = resto == 0 ? valor + " es par" : valor + " es impar";
		
		System.out.println(mensaje);
		

	}

}
