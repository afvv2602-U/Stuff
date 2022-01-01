package ejerciciosP1;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio6 extends Thread
{

	int tipoVehiculo;
	int distancia;
	public Ejercicio6(int tipoVehiculo, int distancia)
	{
		this.tipoVehiculo = tipoVehiculo;
		this.distancia = distancia;
	}
	
	public String tipoVehiculo() 
	{
		String v = "";
		switch (this.tipoVehiculo)
		{
		case 1: v = "moto";break;
		case 2: v = "bici";break;
		case 3: v = "coche";break;

		default: System.out.println("Type not found!");break;
		}
		return v;
	}
	
	public void run() 
	{
		for (int i = 0; i <= this.distancia; ++i)
		{
			System.out.println(this.tipoVehiculo()+" va por el metro "+i);
//			try {
//				sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		new Ejercicio6(1,50000).start();
		new Ejercicio6(2,20000).start();
		new Ejercicio6(3,100000).start();
	}
}


