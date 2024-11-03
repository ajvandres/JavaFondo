package libro.cap02.interfaces.criterios;
import libro.cap02.interfaces.Alumno;

public class TestOrdenar {
	
	public static void main(String[] args)
	{	
		// defino un array de alumnos
		Alumno arr[] = { new Alumno("Juan",20,8.5)
						, new Alumno("Pedro",18,5.3)
						, new Alumno("Alberto",19,4.6) };
		
		Util.ordenar(arr, new CriterioAlumNombre());
		Util.imprimir(arr);

		
		Util.ordenar(arr, new CriterioAlumNotaProm());
		Util.imprimir(arr);
				
	}
}
