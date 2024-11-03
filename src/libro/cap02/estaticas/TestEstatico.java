package libro.cap02.estaticas;

public class TestEstatico {
	
	private int a = 0;
	
	public void unMetodo()
	{
		System.out.println("Este es unMetodo()");
	}
	
	public static void main(String[] args) {
		
		TestEstatico test = new TestEstatico();
		
		System.out.println(test.a);
		test.unMetodo();

	}

}
