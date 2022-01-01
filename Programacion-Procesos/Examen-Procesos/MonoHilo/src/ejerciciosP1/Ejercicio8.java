package ejerciciosP1;

import java.util.Scanner;

public class Ejercicio8 extends Thread
{
	String estacion;
	int duracion;
	
	public Ejercicio8(String estacion)
	{
		this.estacion = estacion;
	}
	
	public String mesesPorEstacion()
	{
		String meses = "";
		int dur;
		if (this.estacion.toLowerCase() == "primavera") 
		{
			dur = 1500;
			meses ="20-21 Marzo | Abril | Mayo | 20 Junio";
		} else		if (this.estacion.toLowerCase() == "verano") 
		{
			dur = 2000;
			meses ="20-21 Junio | Julio | Agosto | 21 Septiembre";
		} else 		if (this.estacion.toLowerCase() == "otoño") 
		{
			dur = 1000;
			meses =" 22-24 Septiembre | Octubre | Noviembre \n 20 Diciembre";
		} else 
		{
			meses =" 21-22 Diciembre | Enero | Febrero | 19 Marzo";
			dur = 500;
		}
		this.duracion = dur;
		return meses;
	}
	
	public void run()
	{
		String mesesArray[] = mesesPorEstacion().split("|");
		for (int i = 0; i < mesesArray.length; i++) 
		{
			System.out.println(mesesArray[0]);
			try {
				sleep(this.duracion);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String estacion = teclado.nextLine();
		Ejercicio8 eh = new Ejercicio8(estacion);
		eh.start();
		teclado.close();
	}
}
