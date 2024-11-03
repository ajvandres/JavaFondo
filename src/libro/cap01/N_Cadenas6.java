package libro.cap01;
import java.util.Scanner;

public class N_Cadenas6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un valor entero: ");
		int valor = scanner.nextInt();
		
		System.out.println("Valor ingresado: "+valor);
		System.out.println("Binario: "+Integer.toBinaryString(valor));
		System.out.println("Octal: "+Integer.toOctalString(valor));
		System.out.println("Hexadecimal: "+Integer.toHexString(valor));
		
		System.out.println("Ingrese una base numerica: ");
		int base = scanner.nextInt();
		
		String sBaseN= Integer.toString(valor,base);
		System.out.println(valor+" en base "+base+" es igual a "+sBaseN);

	}

}
