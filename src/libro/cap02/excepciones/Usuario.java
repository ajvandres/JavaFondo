package libro.cap02.excepciones;

public class Usuario{
	
	String usuario;
	String password;
	String nombre;
	String email;
	
	

	public void setUsrname(String usr) {		
		usuario = usr;
		
	}

	public void setPassword(String pwd) {
		password = pwd;
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}

	public void setEmail(String email) {
		this.email = email;
		
	}
	
	public String toString()
	{
		return
		"Usuario: " + usuario + "\n"+
		"Password: " + password + "\n"+
		"Nombre: " + nombre + "\n"+
		"E-Mail: " + email;		
	}

}
