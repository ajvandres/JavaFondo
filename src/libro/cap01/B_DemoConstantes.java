package libro.cap01;

import java.util.Scanner;

public class B_DemoConstantes {

public static final int DOMINGO = 1;
public static final int LUNES = 2;
public static final int MARTES = 3;
public static final int MIERCOLES = 4;
public static final int JUEVES = 5;
public static final int VIERNES = 6;
public static final int SABADO = 7;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un valor de dia de semana: ");
		int diaSemana = scanner.nextInt();
		
		switch(diaSemana)
		{
			case DOMINGO:
			System.out.println("Dia Domingo");
			break;
			
			case LUNES:
			System.out.println("Dia Lunes");
			break;
			
			case MARTES:
			System.out.println("Dia Martes");
			break;
			
			case MIERCOLES:
			System.out.println("Dia Miercoles");
			break;
			
			case JUEVES:
			System.out.println("Dia Jueves");
			break;
			
			case VIERNES:
			System.out.println("Dia Viernes");
			break;
			
			case SABADO:
			System.out.println("Dia Sabado");
			break;
			
			default:
				System.out.println("El valor ingresado no corresponde a ningun dia de semana");
		}
	}
}
