
public class DipA extends Dipendente {

	private int malattia;

	public DipA(String matricola, float stipendio, float straordinario) {
		super(matricola, stipendio, straordinario);
		malattia = 0;
	}

	public DipA(Dipendente d) {
		super(d.getMatricola(), d.getStipendio(), d.getStraordinario());
		malattia = 0;
	}

	public int getMalattia() {
		return malattia;
	}

	public void setMalattia(int malattia) {
		this.malattia = malattia;
	}

	public void malattia(int n) {
		malattia += n > 0 ? n : 0;
	}

	@Override
	public float paga(int ore) {
		float tmp = super.paga(ore);
		return malattia == 0 ? tmp : tmp - (15 * getMalattia());
	}

	@Override
	public String toString() {
		return super.toString() + "DipA [malattia=" + malattia + "]";
	}

	public void stampaMalattia() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		Dipendente d = new Dipendente("123", 1000, 20);
		d.stampa();
		System.out.println("paga per 3 ore straordinario:" + d.paga(3));
		DipA d2 = new DipA(d);
		d2.stampaMalattia();
		d2.malattia(10);
		System.out.println("paga per 3 ore straordinario e 10g malattia:" + d2.paga(3));
		d2.stampaMalattia();
	}

}
