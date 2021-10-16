
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Studente implements Serializable {
	private String nome;
	private int eta;
	private int code;

	Studente(String nome, int eta, int code){
		this.nome = nome;
		this.eta = eta;
		this.code = code;
	}
	
	
	/**
	 * Salvo un oggetto di tipo studente all'interno di un file binario
	 * Viene lanciata un' IOException e FileNotFoundException gestite poi da chi chiamerà il metodo
	 */
	public void salva(String nome) throws FileNotFoundException, IOException{
	
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nome));		
		out.writeObject(this);
		out.close();

	}
	
	/**
	 * Carico un oggetto di tipo studente da un file binario
	 * Viene lanciata un' IOException, ClassNotFoundException e FileNotFoundException gestite poi da chi chiamerà il metodo 
	 */
	public Studente carica(String nome) throws FileNotFoundException, IOException, ClassNotFoundException{
	
	ObjectInputStream in = new ObjectInputStream(new FileInputStream(nome));
	Studente temp = (Studente)in.readObject();
	in.close();
	
	return temp;
}
	
   public String toString() {
		return "Nome : "+" "+ this.nome + " "+ "Età :"+ " "+this.eta+ " "+ " Codice :"+ " "+ this.code;
  }
}
