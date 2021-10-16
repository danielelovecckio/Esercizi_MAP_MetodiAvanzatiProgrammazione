
/*
 * Utilizzo la classe Thread per aggregazione, ovvero inserisco un attributo di tipo Thread
 * Implemento l'interfaccia funzionale Runnable che mi permette di implementare il metodo run (unico metodo contenuto)
 */
public class MyThread implements Runnable {
	private int x;
	private int y;
	Thread th;	//attributo Thread
	MyThread(String name, int x, int y){
		this.x = x;
		this.y = y;
		th = new Thread(this,name);	//creo un oggetto Thread
		th.start();//Avvio il thread, le istruzioni all'interno di start prevedono l'interazione con il sistema operativo per notificare la sua presenza,
					//infine, come ultima istruzione c'è la chiamata al metodo run
	}
	
	@Override
	/*
	 * Il metodo run contiene al suo interno le azioni che il thread deve eseguire
	 */
	public void run() {
		System.out.println(x);
		for(int i=1;i>0;i++) {
			System.out.println(x+1*y);
			try {
				th.sleep(1500);	//il metodo sleep chiamato su uno specifico thread fa in modo che esso si sospenda per 1500 millisecondi (il parametro indica i millisecondi desiderati)
								//tale metodo prevede un try-catch poichè per l'azione che ne deriva si può generare una InterruptedException a gestire
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
