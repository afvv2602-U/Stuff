package ejerciciosP1;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio5 extends Thread
{

	boolean valor;
	public Ejercicio5(boolean tipo)
	{
		this.valor = tipo;
	}
	
	
	public void run() 
	{
		if (this.valor)
		{
			for (int i = 0; i <= 100; i++) 
			{
				if (i % 2 == 0)
				{
					System.out.println("Nº par: "+i);
				}
			}
			
		}
		else 
		{
			for (int i = 0; i < 26; i++) 
			{
					System.out.println("Letra: "+ (char)('a'+i));
			}
		}
	}
	
	public static void main(String[] args) 
	{
		new Ejercicio5(true).start();
		new Ejercicio5(false).start();
	}
}


