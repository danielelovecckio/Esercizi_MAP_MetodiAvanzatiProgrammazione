import java.lang.Math;

/**
 * La classe estende la classe Thread in modo
 * da poter utilizzare tutti i metodi per eseguire i thread
 */
public class ThreadPower extends Thread {
	private String nome;		//nome del thread
	private int X;				
	private int Y;
	ThreadPower(String name, int x, int y){
		this.X=x;
		this.Y=y;
		this.nome=name;
		//if(name.equals("1st thread"))
		//	this.setDaemon(true);
		System.out.println(this.isDaemon() + " "+"NO DEAMON");
		//start(); 
		//con il metodo start il thread parte;
		//all'interno di questo metodo troviamo istruzioni per l'iterazione con il sistema operativo,
		//come ultima istruzione troviamo la chiamata al metodo run().
	}

	/**
	 * il metodo run viene invocato dal metodo start e al suo interno ci sono le istruzioni che il thread deve eseguire
	 */
	public void run() {
		int i=1;
		System.out.println(this.isDaemon() + " "+"DEAMON");
	try {						
		while(true) {
			System.out.println(Math.pow(X,i*Y) +"------------"+ getName());	//getName è un metodo della classe Thread che restituisce il nome del thread
			i++;
			sleep(5000);			//sleep(...) è un metodo che sospende il thread per n millisecondi(passati come parametro)
		}
	  }catch(InterruptedException e) {
		  System.out.println(e.getMessage() +"Interruzione");	
		  //il metodo sleep può generare un eccezione di tipo InterruptedException
	 }
	}
}
