package CUCUTRASSincronizado;

public class HiloSincronizado extends Thread 
{
    Thread hilo;
    CucuTras cucuObj;

   // construye un nuevo hilo
    HiloSincronizado ( String name, CucuTras tt ) 
    {
           this.hilo= new Thread (name);
           this.cucuObj= tt;
           hilo.start(); 
  }

	@Override
	public void run() 
	{
        for ( int i=0; i<13; i++ )
        {
        	System.out.println(hilo.getName ( ).compareTo ( "Cucu"));
        	if (hilo.getName ( ).compareTo ( "Cucu") == 0)
        	{
        		
        		cucuObj.cucu( true );
			}
        	else
        	{
        		cucuObj.tras(true);
			}
        	
        }
        cucuObj.tras( false );
	}
}


