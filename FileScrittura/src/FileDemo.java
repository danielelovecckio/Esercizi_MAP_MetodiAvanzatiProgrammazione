
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		String nome = "fileDiTesto.txt";
		try {
			//scrittura
			PrintWriter out = new PrintWriter(new File(nome));
			out.println("ciao sono nel file");
			out.println("ciao sono ancora nel file");
			out.close();
			
			//lettura
			BufferedReader in = new BufferedReader(new FileReader(nome));
			System.out.println(in.readLine());
			System.out.println(in.readLine());
			in.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
