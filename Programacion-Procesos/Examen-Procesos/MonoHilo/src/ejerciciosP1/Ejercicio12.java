package ejerciciosP1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio12 extends Thread 
{
	float a,b;
	public Ejercicio12( float a, float b) 
	{
		this.a = a;
		this.b = b;
	}
	
	public void run()
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca una operación ->");
		char op = ' ';
		try {
			op = br.readLine().charAt(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		switch (op) 
		{
			case '+':
					System.out.println(a+b);
			break;
			
			case '-':
				System.out.println(a-b);
			break;
			
			case '*':
				System.out.println(a*b);
			break;
			
			case '/':
				System.out.println(a/b);
			break;
				
	
			default:
				System.out.println("Operación no controlada");
			break;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Ejercicio12 ej = new Ejercicio12(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
		ej.start();
	}
}
