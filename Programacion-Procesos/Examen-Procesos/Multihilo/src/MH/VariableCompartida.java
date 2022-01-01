package MH;


public class VariableCompartida 
{
	 public static volatile int turno = 0;
	 private int numero;
	 public VariableCompartida(int numero) {
	  this.numero = numero;
	 }
	 
	 public void set(int i) {
	  numero = i;
	 }
	 public int get() {
	  return numero;
	 }
	 public void incrementar() {
	  numero++;
	 }
	 public static void incTurno() {
	  turno = (turno+1)%2;
	 }
	 public static int getTurno() {
	  return turno;
	 }
}

