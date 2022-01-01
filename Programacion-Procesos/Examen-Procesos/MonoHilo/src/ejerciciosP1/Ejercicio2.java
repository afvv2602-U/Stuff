package ejerciciosP1;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio2 extends Thread
{

	public void run() 
	{
		for (int i = 1; i < 122; ++i)
		{
			if (i%2 != 0)
			{
				System.out.println(" Número impar: "+i);
				try 
				{
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
				   LocalDateTime now = LocalDateTime.now();  
				   System.out.println(dtf.format(now));
			}
		}
	}
	
	public static void main(String[] args) 
	{
		new Ejercicio2().start();
	}
}


