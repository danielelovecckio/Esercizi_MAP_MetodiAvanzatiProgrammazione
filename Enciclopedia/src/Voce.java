import java.io.Serializable;

public class Voce implements Serializable, Comparable<Voce>{
	private String voce;
	Voce(String v){
		this.voce = v;
	}
	
	public String toString() {
		return "Voce :"+ voce;
	}

	@Override
	public int compareTo(Voce o) {
		return this.getVoce().compareTo(o.getVoce());
	}
	
	public String getVoce() {
		return voce;
	}
}
