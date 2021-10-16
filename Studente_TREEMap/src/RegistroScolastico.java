import java.util.TreeMap;

public class RegistroScolastico {
	/*
	 * Ho scelto un TreeMap poichè permette di collezionare elementi con la modalità "chiave-valore"
	 * in questo modo posso inserire elementi del tipo Studente come chiave e associarne una pagella.
	 * Lo studente è la chiave e come tale non potrà essere duplicato.
	 */
	
	private TreeMap<Studente,Pagella> registro = new TreeMap<Studente,Pagella>();	
	
	public void inserisci(Studente s , Pagella p) {
		registro.put(s, p);	//metodo che mi permette di inserire elementi nel TreeMap
	}
	public Pagella getPagfromStud(Studente s) {
		return registro.get(s);	//metodo che mi permette di restiuire un elemento associato ad una chiave
	}
	public String toString() {
		return registro.toString();
	}
	void incrementaNumeroDiesami() {
		this.registro.entrySet().stream().filter(s->s.getKey().getDataNascita()>=1999).forEach(s->s.getKey().setNumeroEsami(s.getKey().getNumeroEsami()+1));
	}
}
