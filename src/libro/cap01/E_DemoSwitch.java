package libro.cap01;
import java.util.Scanner;

public class E_DemoSwitch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un valor de dia de semana: ");
		int diaSemana = scanner.nextInt();
		
		switch(diaSemana)
		{
			case 1:
			System.out.println("Dia Domingo");
			break;
			
			case 2:
			System.out.println("Dia Lunes");
			break;
			
			case 3:
			System.out.println("Dia Martes");
			break;
			
			case 4:
			System.out.println("Dia Miercoles");
			break;
			
			case 5:
			System.out.println("Dia Jueves");
			break;
			
			case 6:
			System.out.println("Dia Viernes");
			break;
			
			case 7:
			System.out.println("Dia Sabado");
			break;
			
			default:
				System.out.println("El valor ingresado no corresponde a ningun dia de semana");
		}
		

	}

}
