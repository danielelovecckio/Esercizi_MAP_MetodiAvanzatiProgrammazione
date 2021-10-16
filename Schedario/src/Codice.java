import java.io.Serializable;

/*
 * La classe codice modella l'intero id e implementa Comparable, interfaccia che contiene
 * al suo interno il metodo compareTo che definisce una relazione d'ordine
 */
public class Codice implements Comparable<Codice>,Serializable{
	private int id;
	Codice(int id){
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	/*
	 * Con il metodo compareTo definisco una relazione d'ordine sul quale si baserà il TreeMap per l'ordinamento
	 */
	@Override
	public int compareTo(Codice o) {
		if(this.getId()>o.getId())
			return 1;
			else if(this.getId()<o.getId())
				return -1;
		return 0;
	}
	
	public String toString() {
		return "ID :"+id;
	}
}
