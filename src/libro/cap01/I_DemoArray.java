package libro.cap01;
import java.util.Scanner;

public class I_DemoArray {

	public static void main(String[] args) {
		
		int longArray = 10;
		int arr[] = new int[longArray];
		
		int contador = 0;
		
		Scanner scanner = new Scanner(System.in);
					
		System.out.println("Ingrese valor (0 ==> fin): ");
		int valor = scanner.nextInt();
		
		while (contador < longArray && valor !=0 )
		{
			arr[contador] = valor;
			contador++;
			System.out.println("Ingrese valor (0 ==> fin): ");
			valor = scanner.nextInt();
		}
		
		contador = 0;
		
		while (contador < longArray && arr[contador] != 0 )
		{
			System.out.println(arr[contador]);
			contador++;
		}		
		

	}

}
