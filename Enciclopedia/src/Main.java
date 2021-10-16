import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enciclopedia e1 = new Enciclopedia();
		Voce v = new Voce("Prima voce");
		Definizione def = new Definizione("GG");

		Voce v1 = new Voce("Seconda voce");
		Definizione def1 = new Definizione("piko");
		
		Voce v2 = new Voce("Terza voce");
		Definizione def2 = new Definizione("Dany");
		
		Enciclopedia e = new Enciclopedia();
		e.insEnciclopedia(v, def);
		e.insEnciclopedia(v2, def2);
		e.insEnciclopedia(v1, def1);
		try {
			e.serializzazione("filebin.dat");
			e1 = e.deSerializzazione("filebin.dat");
		} catch (FileNotFoundException e4) {
		
			e4.printStackTrace();
	} catch (IOException e4) {
		
			e4.printStackTrace();
		} catch (ClassNotFoundException e2) {
			
			e2.printStackTrace();
		}
		
		System.out.println(e1.toString());
		System.out.println(e.toString());
	}

}
