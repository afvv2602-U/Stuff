package letrasAbecedario;

public class LetrasAbecedario extends Thread 
{
	/*
	 Palabra reservada que permite el acceso directo desde memoria principal del valor de la variable.
	 Es decir, los objetos no guardar?n su copia sino que acceder?n a ella directamente desde memoria principal.
	 Este modificador SOLO se puede utilizar sobre atributos, sin embargo, synchornized puede sobre clases y m?todos.
	 */
    public volatile static int turno; 
	private int vuelta;
	private char letra;
	private int id;
	
	public LetrasAbecedario(int vuelta, char letra, int i) 
	{
		this.turno = 0;
		this.vuelta = vuelta;
		this.letra = letra;
		this.id = i;
	}
	
	public void run() 
	{
		while(turno!=id);
		for(int k = 0; k < vuelta; k++) 
		{
			System.out.print(letra);
		}
		turno = (turno+1)%3;
		System.out.println(turno);
	}

	public static void main(String[] args) throws InterruptedException 
	{
		LetrasAbecedario h1, h2, h3;
		h1 = new LetrasAbecedario(12, 'A', 0);
		h2 = new LetrasAbecedario(2, 'B', 1);
		h3 = new LetrasAbecedario(3, 'C', 2);
		
		h1.start();
		h2.start();
		h3.start();
		try 
		{
			h1.join();
			h2.join();
			h3.join();
		} catch(InterruptedException e) 
		{
			throw new InterruptedException();
		}
	}
}
