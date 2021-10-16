

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileBinDemo {

	public static void main(String[] args) {
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		String nome = "fileBin.dat";
		try {
			//scrittura
			out = new ObjectOutputStream(new FileOutputStream(nome));
			out.writeUTF("ciao sono in un binario");
			out.writeInt(80);
			out.close();
			
			//lettura
			in = new ObjectInputStream(new FileInputStream(nome));
			System.out.println(in.readUTF());
			System.out.println(in.readInt());
			in.close();
			
		}catch (IOException e) {
			System.err.println(e.getMessage());
		}
		

	}

}
