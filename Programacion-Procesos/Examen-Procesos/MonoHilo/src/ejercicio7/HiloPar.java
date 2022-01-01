package ejercicio7;



public class HiloPar extends Thread
{

	public void run() 
	{
		int total = 0;
		for (int i = 0; i <= 100; ++i)
		{
			if (i % 2 == 0)
			{
				total += i;
			}
		}
		System.out.println("Total de la suma de los pares: "+total);
	}	
}


