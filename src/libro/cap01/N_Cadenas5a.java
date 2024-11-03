package libro.cap01;

public class N_Cadenas5a {

	public static void main(String[] args) {

		String x = "";
		x = x+"Hola ";
		x= x+"que tal";
		
		System.out.println(x);
		
		String y = new StringBuffer().append("hola").append(" que tal").toString();
		System.out.println(y);
	}

}
