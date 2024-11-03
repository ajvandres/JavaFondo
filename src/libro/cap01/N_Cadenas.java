package libro.cap01;

public class N_Cadenas {

	public static void main(String[] args) {
		
		String cadena = "Esta es mi cadena";
		
		System.out.println(cadena.charAt(0));
		System.out.println(cadena.charAt(5));
		System.out.println(cadena.charAt(cadena.length()-1));
		
		char c;
		
		for (int i = 0; i<cadena.length(); i++)
		{
			c = cadena.charAt(i);
			System.out.println(i+" --> "+c);
			
		}
	}

}
