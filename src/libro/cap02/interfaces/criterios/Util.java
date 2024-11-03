package libro.cap02.interfaces.criterios;

public class Util {

	public static void ordenar(Comparable arr[], Criterio cr) // ORDENAMIENTO BURBUJA
	{
	    boolean ordenado = false;
	    
	    while (!ordenado) 
	    { 
	      ordenado = true;
	    
	      for (int i = 0; i < arr.length - 1; i++) 
	      {	      
	    	  if (cr.comparar(arr[i+1], arr[i]) < 0) 
	    	  {
		          Comparable aux = arr[i];
		          arr[i] = arr[i + 1];
		          arr[i + 1] = aux;
		          ordenado = false;
	    	  }
	      }
	    }
	}
	
	public static void imprimir(Object arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}