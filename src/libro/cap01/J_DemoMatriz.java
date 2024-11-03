package libro.cap01;
import java.util.Scanner;
import java.util.Random;

public class J_DemoMatriz {

	public static void main(String[] args) {
		
		int nFilas, nColumnas;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese numero de filas: ");
		nFilas = scanner.nextInt();
		
		System.out.println("Ingrese numero de columnas: ");
		nColumnas = scanner.nextInt();
		
		int matriz[][] = new int[nFilas][nColumnas];
		
		Random random = new Random();
		
		for(int i = 0; i < nFilas; i++)
		{
			for( int j = 0; j < nColumnas; j++)
			{
				int valor = random.nextInt(100);				
				matriz[i][j] = valor;
			}
		}
		
		for(int i = 0; i < nFilas; i++)
		{
			for( int j = 0; j < nColumnas; j++)
			{				
				System.out.println("valor fila ["+i+"] columna ["+j+"] es: "+matriz[i][j]);
			}
		}		

		for(int i = 0; i < nFilas; i++)
		{
			for( int j = 0; j < nColumnas; j++)
			{				
				System.out.print(matriz[i][j]+"\t");
			}
		}				
		
	}

}
