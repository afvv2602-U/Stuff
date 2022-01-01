
public class Monitor {

	boolean saludo;
	
	public Monitor () {
		
		this.saludo = false;
		
	}
	
	public synchronized void Saludar(Thread [] clase)
    {
		while(saludo) 
		{
			System.out.println("Guten Morgen die Klasse!");
			System.out.println("");
			
			for (int i = 0; i < clase.length; i++) 
			{
	        	clase[i].start();
	        	try {
					clase[i].sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
	        	
	        }
			this.saludo = false;
		}

        
    }
	
	
}
