package ejercicio7;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HiloImpar extends Thread
{

	public void run() 
	{
		int total = 0;
		for (int i = 0; i <= 100; ++i)
		{
			if (i % 2 != 0)
			{
				total += i;
			}
		}
		System.out.println("Total de la suma de los impares: "+total);
	}	
}


