package solucionSensores;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Trabajador extends Thread 
{
	  Semaphore semTrabajador;
	  Semaphore [] semsensores;
	  int [] datos;
	  
	  Trabajador( Semaphore semTrabajador, Semaphore [] semsensores,int [] datos)
	  {
		  this.semTrabajador =semTrabajador;
		  this.semsensores = semsensores;
		  this.datos = datos;
	  }
	  
	  public void run ()
	  {
		   while(true){
		   try {
		    semTrabajador.acquire(3);
		     
		    
		    sleep((new Random()).nextInt(500));  // tiempos de espera aleatorio simulando la tarea del trabajador 
		          //(tiempo que tarda el recoger los datos por ejemplo)
		    System.out.println("Temperatura: " + datos[0]);
		    System.out.println("Humedad: "+ datos[1]);
		    System.out.println("Luz: " + datos[2] + "\n");
		   
		    
		    semsensores[0].release();
		    semsensores[2].release();
		    semsensores[1].release(); 
		    
		   } catch (InterruptedException e) { e.printStackTrace();   }
		   }
		  }
		 }

