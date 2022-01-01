package solucionSensores;


import java.util.concurrent.Semaphore;

public class Principal 
{
	 private static Semaphore semTrabajador;
	 private static Semaphore [] semsensores;
	 private static int [] datos;

	 public static void main(String[] args) 
	 {
		  semTrabajador = new Semaphore(0, true);
		  semsensores = new Semaphore[3];
		  datos = new int[3];
		  semsensores [0] = new Semaphore (1, true);
		  semsensores [1] = new Semaphore (1, true);
		  semsensores [2] = new Semaphore (1, true);
		  
		  Trabajador trabajador = new Trabajador (semTrabajador,semsensores,datos);
		  Sensor sensor0 = new Sensor (0,semTrabajador,semsensores,datos);
		  Sensor sensor1 = new Sensor (1,semTrabajador,semsensores,datos);
		  Sensor sensor2 = new Sensor (2,semTrabajador,semsensores,datos);
		  

		  

		  trabajador.start ();
		  sensor0.start ();
		  sensor1.start ();
		  sensor2.start ();
		 }


}
