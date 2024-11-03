package libro.cap01;
import java.util.Scanner;

public class I_DemoArray2 {
	
	public static void main(String[] args) {
		
		String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado","Domingo"};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un dia de la semana en numero: ");
		int diaSemanaNro = scanner.nextInt();
		
		if (diaSemanaNro < dias.length)
		{
			System.out.println(dias[diaSemanaNro-1]);
		}
		else
		{
			System.out.println("El dia ingrsado es incorrecto");
		}

}
}
