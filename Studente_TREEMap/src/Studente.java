/*
 * Affinchè nel TreeMap abbia un ordinamento basato sulla matricola di un determinato studente implemento l'interfaccia Comparable 
 * che mi permette di implementare il metodo compareTo che definisce una relazione d'ordine che il TreeMap dovrà seguire
 */
public class Studente implements Comparable<Studente>{	
	private String nomeCognome;
	private int mat;
	private int dataNascita;
	private int numeroEsami;
	Studente(String nomeCognome, int mat, int dataNascita, int numeroEsami){
		this.nomeCognome=nomeCognome;
		this.mat = mat;
		this.dataNascita = dataNascita;
		this.setNumeroEsami(numeroEsami);
	}

	public String getNomeCognome() {
		return nomeCognome;
	}

	public int getMat() {
		return mat;
	}

	public int getDataNascita() {
		return dataNascita;
	}

	@Override
	/*
	 * metodo compareTo:
	 * nel metodo viene definita una relazione d'ordine basata sulla matricola degli studenti
	 * restituisce 0 nel caso sono uguali, altrimenti 1 o -1 a seconda dei casi
	 */
	public int compareTo(Studente o) {
		if(o.getMat()<this.getMat()) {
			return 1;
		}else if(this.getMat()< o.getMat()) {
			return -1;
		}
		return 0;
	}
	
	public String toString() {
		return this.nomeCognome +" "+ this.mat+ " "+ this.dataNascita +"     "+"NUMERO DI ESAMI "+" "+ numeroEsami;
	}

	public int getNumeroEsami() {
		return numeroEsami;
	}

	public void setNumeroEsami(int numeroEsami) {
		this.numeroEsami = numeroEsami;
	}
}
