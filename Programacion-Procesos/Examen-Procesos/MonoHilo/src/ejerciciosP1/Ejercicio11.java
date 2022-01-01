package ejerciciosP1;

public class Ejercicio11 extends Thread
{
	String nombre;
	
	public Ejercicio11(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public void run()
	{
		System.out.println("El caballer "+this.nombre+" empieza las pruebas");
		
		for (int i = 1; i < 13; i++) 
		{
			System.out.println("Caballero "+this.nombre+": "+"Realizando prueba "+i+"...");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("El caballer "+this.nombre+" asciende a oro");
	}
	
	public static void main(String[] args) 
	{
		String caballeros[] = {"Seiya de Pegaso","Shiryu de Dragón","Hyōga de Cisne"
			,"Shun de Andrómeda","Ikki de Fénix"};
		Ejercicio11 ej;
		for (int i = 0; i < caballeros.length; i++) 
		{
			ej = new Ejercicio11(caballeros[i]);
			ej.start();
		}
	}
}
