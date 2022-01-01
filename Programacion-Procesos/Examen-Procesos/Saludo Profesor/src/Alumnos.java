import java.awt.desktop.ScreenSleepEvent;

public class Alumnos implements Runnable{
	Monitor gestorSaludo;
	private int idAlumno;
	boolean saludado;
	
	public Alumnos (Monitor gestorSaludo, int idAlumno) 
	{
		this.gestorSaludo = gestorSaludo;
		this.idAlumno = idAlumno;
		this.saludado = true;
	}
	
	public void run() 
	{
		
		while(saludado) 
		{
			System.out.println("Morgen " + this.idAlumno);
				
			this.saludado = false;//Ya ha saludado, no vuelve a saludar

		}
		
		
	}

}
