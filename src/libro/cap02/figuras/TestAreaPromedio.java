package libro.cap02.figuras;

public class TestAreaPromedio {

	public static void main(String[] args) {
		
		FiguraGeometrica arr[] = { new Circulo(23)
								,new Rectangulo(12,4)
								,new Triangulo(2,5)	};
		
		double areaPromedio = FiguraGeometrica.areaPromedio(arr);
		
		System.out.println("El area promedio de las figuras es: "+areaPromedio);
	}

}
