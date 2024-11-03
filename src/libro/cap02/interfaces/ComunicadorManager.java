package libro.cap02.interfaces;

public class ComunicadorManager {
	
	public static Comunicador crearComunicador()
	{
		//return new PalomaMensajera();
		//ahora retorna un telefono celular tambien por clase comunicador
		return new TelefonoCelular();
	}
}
