package libro.cap02.colecciones;

public class MiPila<T> {
	
	private static final int capacidadInicial = 5; 	
	private MiColeccion<T> coll = new MiColeccion<T>(capacidadInicial);
	
	public void apilar(T elemento)
	{
		coll.insertar(elemento, 0);
	}
	
	public T desapilar()
	{
		return coll.eliminar(0);
	}
}
