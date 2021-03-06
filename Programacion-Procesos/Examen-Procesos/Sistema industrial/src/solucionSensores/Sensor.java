package solucionSensores;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Sensor extends Thread 
{
	  private int id;
	  
	  Semaphore semTrabajador;
	  Semaphore [] semsensores;
	  int [] datos;
	  
	  public Sensor(int id,Semaphore semTrabajador, Semaphore [] semsensores,int [] datos)
	  {
		  this.id = id;
		  this.semTrabajador =semTrabajador;
		  this.semsensores = semsensores;
		  this.datos = datos;
	  }
	  public void run(){
	   while(true){
	   try {
	    semsensores[id].acquire();
	    
	    //coge el dato
	    sleep((new Random()).nextInt(500)); // tiempos de espera aleatorio simulando la tarea del sensor
	    datos[id] = (new Random()).nextInt(50);
	    //System.out.println("datos["+id+"] = "+ datos[id]);
	    
	    semTrabajador.release();
	    
	   } catch (InterruptedException e) { e.printStackTrace();  }
	   }
	  }
 }	 

