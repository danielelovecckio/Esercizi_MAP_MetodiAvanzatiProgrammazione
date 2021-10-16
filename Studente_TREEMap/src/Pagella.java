
public class Pagella {
	private String nomeCorso;
	private int nrEsami;
	
	Pagella(String nomeCorso, int nrEsami){
		this.nomeCorso = nomeCorso;
		this.nrEsami = nrEsami;
	}
	
	public String toString() {
		return this.nomeCorso + " "+ this.nrEsami+"\n";
	}
}
