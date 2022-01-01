package ejerciciosP1;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio4 extends Thread
{

	String competidor;
	public Ejercicio4(String competidor)
	{
		this.competidor = competidor;
	}
	
	public void run() 
	{
		for (int i = 0; i < 100; ++i)
		{
			System.out.println(this.competidor+" va por el metro "+i);
		
		}
	}
	
	public static void main(String[] args) 
	{
		new Ejercicio4("Conejo").start();
		new Ejercicio4("Tortuga").start();
		new Ejercicio4("Cigarra").start();
	}
}


