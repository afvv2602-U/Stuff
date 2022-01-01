package ejerciciosP1;

public class Ejercicio13 extends Thread 
{
	int dorsal;
	double tiempo;
	public Ejercicio13( int dorsal)
	{
		this.dorsal = dorsal;
		do
		{
			tiempo = Math.random()*11000;//Generamos una velocidad entre nueve y 11 segundos;
		} while (tiempo < 9000);
 	}
	
	public void run()
	{
		System.out.println("El atleta con dorsal "+this.dorsal+" ha empezado la carrera");
		double tiempo = this.tiempo;
		boolean finish = false;
		do
		{
			tiempo -= 100;
			try {
				System.out.println("El atleta con dorsal "+this.dorsal+" ha avanzado unos metros");
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finish = (tiempo <= 0);
			
		}while(!finish); 
		System.out.println("El atleta con dorsal "+this.dorsal+" ha terminado la carrera en: "+this.tiempo);
	}
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Preparados!");
		sleep(1000);
		System.out.println("Listos!");
		sleep(1000);
		System.out.println("Yaa!");
		sleep(1000);
		Ejercicio13 ej;
		for (int i = 1; i < 14; i++)
		{
			ej = new Ejercicio13(i);
			ej.start();
		}
	}
}
