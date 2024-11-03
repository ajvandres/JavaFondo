package libro.cap02.fechas;
public class TestFecha
{
public static void main(String[] args)
{
	Fecha f = new Fecha();
	f.setDia(12);
	f.setMes(3);
	f.setAnio(1987);
	
	Fecha g = new Fecha();
	g.setDia(12);
	g.setMes(3);
	g.setAnio(1987);	
	
	System.out.println("Dia: "+f.getDia());
	System.out.println("Mes: "+f.getMes());
	System.out.println("Anio: "+f.getAnio());
	System.out.println(f);
	
	System.out.println(f.equals(g));
}
}