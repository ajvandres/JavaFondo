package libro.cap01;
import java.util.Scanner;

public class A_HolaMundoNombre {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese su Nombre, edad y altura");
		
		String nombre = scanner.nextLine();
		
		int edad = scanner.nextInt();
		
		double altura = scanner.nextDouble();
		
		System.out.println("Hola Mundo: "+ nombre
							+", Edad: " + edad
							+" , Altura: " + altura);

	}

}
