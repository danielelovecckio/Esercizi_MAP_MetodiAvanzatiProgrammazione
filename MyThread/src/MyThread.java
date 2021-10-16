//l’interfaccia Runnable dev'essere implementata dalla classe le cui istanze devono
//essere eseguite da un thread
//l’interfaccia funzionale contiene solo un metodo: run()
public class MyThread implements Runnable{
private String nome;
private Thread th;
private int x;
private int base;

//Costruttore della classe 
//nel costruttore c'è il set degli attributi più l'istanziazione di un thread, x è l’intero da cui partirà il thread e
//base è l’intero che distingue i vari thread
public MyThread (String nome, int x, int base){
	this.nome=nome;
	this.x=x;
	this.base=base;
	th = new Thread(this, nome);
	th.start();
}

//definizione del metodo run() della classe MyThread
public void run(){ 
	int i;
	int risultato;
	//utilizzo un blocco try catch per gestire le eccezioni derivate da sleep
	try{
		for(i=1; i>0; i++){
			risultato= i*base;
			System.out.println(risultato + " " +nome);
			Thread.sleep(1500);
		}
	}catch(InterruptedException e){
		System.out.println(e.getMessage()+"Interruzione");
	}
}

}