package libro.cap02.fechas;
import java.util.StringTokenizer;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(int dia, int mes, int anio)
	{
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	public Fecha()
	{
		
	}
	public Fecha(String fecha)
	{
		StringTokenizer st = new StringTokenizer(fecha,"/");
		this.dia = Integer.valueOf(st.nextToken());
		this.mes = Integer.valueOf(st.nextToken());
		this.anio = Integer.valueOf(st.nextToken());
	}
	
	public void setDia(int dia)
	{
		this.dia = dia;
	}
	public void setMes(int mes)
	{
		this.mes = mes;
	}
	public void setAnio(int anio)
	{
		this.anio = anio;
	}	

	public int getDia()
	{
		return this.dia;
	}
	public int getMes()
	{
		return this.mes;
	}
	public int getAnio()
	{
		return this.anio;
	}
	
	public String toString()
	{
		return dia+"/"+mes+"/"+anio;
	}
	
	public boolean equals(Object o)
	{
		Fecha otra = (Fecha)o;
		return dia == otra.dia && mes == otra.mes && anio == otra.anio;
	}
	
	public void addDias(int dias)
	{
		int fechaEnDias = fechaToDias();
		fechaEnDias += dias;
		diasToFecha(fechaEnDias);
	}
	
	private	int fechaToDias()
	{
		return anio*360+mes*30+dia;		
	}
	
	private void diasToFecha(int dias)
	{
		this.anio = dias/360;		
		this.mes = (dias%360)/30;
		this.dia = (dias%360)%30;
		
		if(dia == 0)
		{
			this.dia = 30;
			this.mes--;
		}
		if(mes == 0)
		{
			this.mes = 12;
			this.anio--;
		}
		
	}
}
