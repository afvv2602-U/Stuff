package ejerciciosP1;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio3 extends Thread
{

	public void run() 
	{
		try 
		{
			System.out.println("Estamos con la bicicleta");
			for (int i = 0; i < 181; ++i)
			{
				System.out.println(" Kilómetro: "+i);
				sleep(1);
			
			}
			System.out.println("Hemos terminado con la bicicleta");
			
			System.out.println("Estamos corriendo");
			for (int i = 0; i < 181; ++i)
			{
				System.out.println(" Kilómetro: "+i);
				sleep(1);
			
			}
			System.out.println("Hemos terminado  de correr");

			System.out.println("Estamos nadando");
			for (int i = 0; i <= 3800; ++i)
			{
				if (i% 100 == 0)
				{
					System.out.println(" Metro: "+i);
					sleep(100);					
				}

			
			}
			System.out.println("Hemos terminado de nadar");
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		new Ejercicio3().start();
	}
}


