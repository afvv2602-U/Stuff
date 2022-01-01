package ejerciciosP1;

import java.util.Scanner;

public class Ejercicio1 extends Thread
{
	String nombre;
	int dia;
	String hora;
	
	public Ejercicio1(String n, int dia, String hora)
	{
		this.nombre = n;
		this.dia = dia;
		this.hora = hora;
	}
	
	public String whichDay() 
	{
		String day = "";
		switch (this.dia)
		{
		case 0: day = "Lunes"; break;
		case 1: day = "Martes"; break;
		case 2: day = "Miércoles"; break;
		case 3: day = "Jueves"; break;
		case 4: day = "Viernes"; break;
		case 5: day = "Sábado"; break;
		case 6: day = "Domingo"; break;
		default: day = "Error";	break;
		}
		return day;
	}
	public void run() 
	{
			boolean found = false;
			String horaAux = "";
			int i = 0;
			
			while (!found)
			{
				found = hora.charAt(i) == ':';//7:45   7  10:45  10
				
				if(!found)
				{
					horaAux += hora.charAt(i);
					++i;
				}
				
			}

			if (horaAux.length() < 2 && Integer.parseInt(horaAux) < 8 )
			{
				System.out.println("El profesor ha sido puntual");	
			}
			else
			{
				System.out.println("El profesor ha llegado tarde");
			}
			
			// OR
			
System.out.println( (horaAux.length() < 2 && Integer.parseInt(horaAux) < 8 )
					?	"El profesor ha sido puntual"
					:	"El profesor ha llegado tarde");
			
		
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String nombre = input.nextLine();
		int dia = input.nextInt();
		input.nextLine();
		String hora = input.nextLine();
		new Ejercicio1(nombre,dia,hora).start();
		
		input.close();
	}
}


