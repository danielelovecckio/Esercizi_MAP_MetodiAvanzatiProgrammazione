import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.TreeMap;

public class Enciclopedia implements Serializable {

	
	private TreeMap<Voce,Definizione> enciclopedia = new TreeMap<Voce,Definizione>();
	
	Enciclopedia(){
		//enciclopedia.put(v,d);
	}
	
	public String toString(){
		return enciclopedia.toString();
	}
	
	public void serializzazione(String nomeFile) throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeFile));
		out.writeObject(this);
		out.close();
	}
	public Enciclopedia deSerializzazione(String nomeFile) throws FileNotFoundException, IOException, ClassNotFoundException {
		Enciclopedia temp = null;
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomeFile));
		temp =(Enciclopedia)in.readObject();
		in.close();
		return temp;
	}
	
	public void insEnciclopedia(Voce v, Definizione d) {
		enciclopedia.put(v,d);
	}

}
