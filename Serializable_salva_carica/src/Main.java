import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Main implements Serializable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studente s = new Studente("GG", 22,44);
		Studente s1 = new Studente("Dany", 21,80);
		System.out.println(s1.toString()+"\n");
		try {
			s.salva("fileBinario.dat");
			s1 = s.carica("FileBinario.dat");
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
		
		System.out.println(s1.toString()+"\n");
		
	}

}
