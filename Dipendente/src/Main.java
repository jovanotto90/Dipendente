
public class Main {

	
	public static void main (String [] args){
	       Dipendente dip1 = new Dipendente ("Mario", 1000, 12.5);
	       Dipendente_A dip2 = new Dipendente_A ("Sara", 1200, 8.30);
	       
	       double salario1 = dip1.paga(32);
	       dip1.stampa();
	       System.out.println("Salario: " + salario1);
	       
	       dip2.prendiMalattia(5);
	       dip2.stampa();
	       dip2.stampaMalattia();
	       System.out.println ("Salario: " + dip2.paga(7));
	       //Ho fatto cose
	}
}
