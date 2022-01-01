package ejerciciosP1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio10 extends Thread 
{
	//Atributos
    private int contador;
    private String nombre;
    private int limite;
 
    //Constructor
    public Ejercicio10(String nombre, int limite) {
        this.contador = 0;
        this.nombre = nombre;
        this.limite = limite;
    }
 
    @Override
    public void run() {
 
        //Recorremos los numeros
        while (contador <= limite) 
        {
            System.out.println("Hilo " + nombre + ": " + contador);
            contador++;
        }
 
        //fin de hilo
        System.out.println("Hilo " + nombre + " ya ha acaado");
         
    }
	public static void main(String[] args) 
	{
		//Creamos los objetos
		Ejercicio10 c1 = new Ejercicio10("Contador 1", 40);
		Ejercicio10 c2 = new Ejercicio10("Contador 2", 50);
		Ejercicio10 c3 = new Ejercicio10("Contador 3", 20);
		Ejercicio10 c4 = new Ejercicio10("Contador 4", 70);
 
        //Creamos los hilos
        c1.start();
        c2.start();
        c3.start();
        c4.start();
  
        //Esperamos a que acaben los hilos
        try
        {
        	c1.join();
        	c2.join();
        	c3.join();
        	c4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ejercicio10.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        //Fin
        System.out.println("Fin del programa");
 

	}

}
