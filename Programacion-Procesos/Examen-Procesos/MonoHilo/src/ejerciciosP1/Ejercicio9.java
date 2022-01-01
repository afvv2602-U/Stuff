package ejerciciosP1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9 extends Thread 
{
	String nombre;
	public Ejercicio9(String nombre) 
	{
		this.nombre = nombre;
	}
	
	@Override
	public void run() 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		float nota = 0,promedio = 0;
		for (int i = 0; i < 8; i++) 
		{
			try {
				nota = Float.parseFloat(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			promedio += nota;
		}
		promedio /= 7;
		System.out.println("Nota promedia del alumno"+this.nombre+": "+promedio);

	}

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Ejercicio9 ej = new Ejercicio9(br.readLine());
		ej.start();
		br.close();

	}

}
