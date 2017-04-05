
public class Dipendente {

	String matricola;
    double stipendio, straordinario;
    
    public Dipendente (String matricola, double stipendio, double straordinario){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.straordinario = straordinario;
    }
    
    public double getStipendio(){
        return stipendio;
    }
    
    public double paga (int ore){
        double x = ore * straordinario;
        return x + stipendio;
    }
    
    public void stampa(){
        System.out.println ("Matricola: "+ this.matricola + ", Stipendio: " + this.stipendio+ ", Straordinario: " + this.straordinario);
    }
}
