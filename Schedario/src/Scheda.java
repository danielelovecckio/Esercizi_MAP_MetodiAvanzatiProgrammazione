import java.io.Serializable;

public class Scheda implements Serializable {
private String titolo;
private double prz;
	
	Scheda(String titolo,double prz){
		this.titolo=titolo;
		this.prz = prz;
	}

	public String getTitolo() {
		return titolo;
	}

	public double getPrz() {
		return prz;
	}
	
	public String toString() {
		return "titolo : " + titolo +" "+ "prezzo :"+prz+"\n";
	}
}
