package libro.cap01;

public class N_Cadenas4 {

	public static void main(String[] args) {

		String s = "Un buen libro de Java";
		
		boolean b1 = s.startsWith("Un buen");
		boolean b2 = s.startsWith("A");
		boolean b3 = s.endsWith("Java");
		boolean b4 = s.startsWith("Chau");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);		
	}

}
