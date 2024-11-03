package libro.cap01;
import java.util.Scanner;

public class N_Cadenas8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena: ");
		String s1 = scanner.next();
		
		System.out.println("Ingrese otra cadena: ");
		String s2 = scanner.next();
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1==s2)
		{
			System.out.println("Las cadenas son iguales");
		}
		else
		{
			System.out.println("Las cadenas son distintas");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("Las cadenas son iguales");
		}
		else
		{
			System.out.println("Las cadenas son distintas");
		}		
		
	}

}
