package libro.cap02.colecciones;

public class TestPila {

	public static void main(String[] args) {
		
		MiPila<Integer> pila = new MiPila<Integer>();
		
		pila.apilar(1);
		pila.apilar(2);
		pila.apilar(3);
		
		System.out.println(pila.desapilar()); //saca el 3
		System.out.println(pila.desapilar()); //saca el 2
		
		pila.apilar(4);
		
		System.out.println(pila.desapilar()); //saca el 4
		System.out.println(pila.desapilar()); //saca el 1
	}

}
