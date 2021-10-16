import java.io.Serializable;

public class Definizione implements Serializable{
private String def;
Definizione(String d){
	this.def = d;
}
public String toString() {
	return "Definizione :"+def +"\n";
}
}
