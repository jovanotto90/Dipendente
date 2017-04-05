
public class Dipendente_A extends Dipendente {
	
	//modificato da Marco
	private int malattia;
	
	public Dipendente_A (String matricola, double stipendio, double straordinario) {
		super (matricola, stipendio, straordinario);
		this.malattia =  0;
	}
	
	public void prendiMalattia (int giorni){
		this.malattia += giorni;
	}
	
	public int getMalattia (){
		return this.malattia;
	}
	
	public double paga (int ore){
		double p = super.paga(ore);
		if (this.malattia == 0)
			return p;
		else
			return p - (this.malattia * 15.0);
	}
	
	public void stampaMalattia (){
		System.out.println ("Malattia: " + this.malattia);
	}

}
