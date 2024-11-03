package libro.cap02.colecciones;

public class TestCola {

	public static void main(String[] args) {
		
		MiCola<Integer> cola = new MiCola<Integer>();
		
		cola.encolar(1);
		cola.encolar(2);
		cola.encolar(3);

		System.out.println(cola.desencolar()); //saca el 1		
		System.out.println(cola.desencolar()); //saca el 2
		
		cola.encolar(4);
		
		System.out.println(cola.desencolar()); //saca el 3
		System.out.println(cola.desencolar()); //saca el 4   
		
	}

}
