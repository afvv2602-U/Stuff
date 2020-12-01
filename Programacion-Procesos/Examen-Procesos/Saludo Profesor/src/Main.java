
public class Main {

	public static void main(String[] args) {
		int numAlumnos = 10;
		Monitor gestorSaludo = new Monitor();
		Alumnos [] listaAlumnos = new Alumnos[numAlumnos];
		Thread hilo [] = new Thread [numAlumnos];
		
		for (int i = 0; i < numAlumnos; i++) 
		{
			listaAlumnos[i] = new Alumnos (gestorSaludo, i);
			hilo[i] = new Thread(listaAlumnos[i]);
						
		}
		
		gestorSaludo.saludo = true;//Saluda el profesor
		gestorSaludo.Saludar(hilo);
	}
	

}
