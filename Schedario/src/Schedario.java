import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.TreeMap;

/*
 * Classe che modella l'attributo della collezione che dobbiamo usare
 */
public class Schedario implements Serializable{
	/*
	 * utilizzo un TreeMap poichè mi permette di inserire elementi del tipo "chiave-valore"
	 * ovvero che ad ogni elemento viene associata una chiave unica e non ripetibile
	 * inoltre mi permette di avere un'ordinamento della collezione a seconda della relazione definita da compareTo
	 */
	private TreeMap<Codice,Scheda> tree = new TreeMap<Codice,Scheda>();
	
	/*
	 * inserimento di elementi all'interno del treemap
	 * tramite il metodo put
	 * 
	 */
	public void inserisci(Codice c, Scheda s) {
		tree.put(c, s);
	}
	
	/*
	 * La stampa avverrà già considerando la collezione ordinata
	 */
	public void stampa() {
		System.out.println(tree.toString());
	}
	
	public void serializzazione(String nomeFile) throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeFile));
		out.writeObject(this);
		out.close();
	}
	public Schedario deSerializzazione(String nomeFile) throws FileNotFoundException, IOException, ClassNotFoundException {
		Schedario s =null;
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomeFile));
		s = (Schedario)in.readObject();
		in.close();
		return s;
	}
	
	
	double sommaPrezzi() {
		return (double)this.tree.entrySet().stream().filter(s->s.getValue().getTitolo().charAt(0)=='m' && s.getValue().getTitolo().charAt(1)=='a' && s.getValue().getTitolo().charAt(2)=='p').mapToDouble(s->s.getValue().getPrz()).reduce(0.0,(a,b)->a+b);
	}
	
	
	
	public static void main(String[] args) {
		Schedario sch = new Schedario();
		Scheda s = new Scheda("mapScheda1", 22.5);
		Scheda s1 = new Scheda("mapScheda2", 2.5);
		Scheda s2 = new Scheda("Scheda3", 12.5);
		Scheda s3 = new Scheda("Scheda4", 52.5);
		Scheda s4 = new Scheda("mapScheda5", 27.5);
		
		Codice c = new Codice(10);
		Codice c1 = new Codice(13);
		Codice c2 = new Codice(23);
		Codice c3 = new Codice(3);
		Codice c4 = new Codice(34);
		
		sch.inserisci(c, s);
		sch.inserisci(c1, s1);
		sch.inserisci(c2, s2);
		sch.inserisci(c3, s3);
		sch.inserisci(c4, s4);
		
		sch.stampa();
		
		Schedario sch1 = new Schedario();
		
		try {
			sch.serializzazione("fileBinario.dat");
			sch1 = sch.deSerializzazione("fileBinario.dat");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sch1.stampa();
		
		
		System.out.println(sch.sommaPrezzi());
	}

}
