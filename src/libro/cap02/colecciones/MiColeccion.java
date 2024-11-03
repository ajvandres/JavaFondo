package libro.cap02.colecciones;

public class MiColeccion<T> {
	
	private Object datos[] = null;
	private int len = 0;
	
	public MiColeccion(int capacidadInicial)
	{
		datos = new Object[capacidadInicial];
	}
	
	@SuppressWarnings("unchecked")	
	public T obtener(int i)
	{
		return (T)datos[i];
	}
	
	public int cantidad()
	{
		return len;
	}
	
	public void insertar(T elemento, int posicion)
	{
		if(len == datos.length)
		{
			Object aux[] = datos;
			datos = new Object[datos.length * 2];
			for(int j = len-1; j >= posicion; j--)
			{
				datos[j+1] = aux[j];
			}
			datos[posicion] = elemento;			
		}
		for(int j=len-1; j>=posicion; j--)
		{
			datos[j+1] = datos[j];
		}
		datos[posicion] = elemento;
		len++;	
	}
	
	public int buscar(T elemento)
	{
		int i = 0;
		for(;!elemento.equals(datos[i]) && i< len; i++);
		
		return i<len? i: -1;
	}
	
	public void agregar(T elemento)
	{
		insertar(elemento, len);		
	}
	
	@SuppressWarnings("unchecked")
	public T eliminar(int iesimo)
	{
		Object aux = datos[iesimo];
		for(int i= iesimo; i< len-1; i++)
		{
			datos[i] = datos[i+1];
		}
		datos[len-1] = null;
		len--;
		return (T)aux;
	}
	
	
	
}
