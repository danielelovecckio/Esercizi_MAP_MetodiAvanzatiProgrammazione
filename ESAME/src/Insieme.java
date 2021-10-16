import java.util.HashSet;
/*
 * la classe Insieme modella un attributo di tipo HashSet (la classe estende, ma meglio, specializza, la classe astratta Set) che ho voluto scegliere per poter effettuare una ricerca rapida. 
 * Il tutto è dovuto al fatto che HashSet, basata sulla tabella hash,  utilizza il metodo hashCode, che ho reimplementato, ricercando il codice hash dell'elemento
 */
class Insieme {
	private HashSet<Elemento> insieme;	//attributo di tipo hasSet
												//sono in grado di costruire un hashSet di questo tipo grazie al fatto che HasSet è una classe che utilizza java generics
	
	Insieme(){		//metodo crea : costruttore
		insieme = new HashSet<Elemento>();
	}
	void aggiungi(Elemento e){
		insieme.add(e);	//utilizzo il metodo add per inserire all'interno dell'hashSet l'elemento
	}
	
	void cancella(Elemento e) throws ElementoMancante {
		for(Elemento e1 : insieme) {			//costrutto forEach 
			if(e1.equals(e)) {
				insieme.remove(e1);  	//elemento trovato, cancellato e dopo termine del metodo
				return;
			}
		}
		throw new ElementoMancante();
		
	}
	//richiamo il to string dell'hasSet
	public String toString() {
		return insieme.toString();
	}
	public static void main(String[] args) {
		Insieme e = new Insieme();
		Elemento el = new Elemento(10);
		e.aggiungi(new Elemento(5));
		e.aggiungi(el);
		e.aggiungi(new Elemento(6));
		System.out.println(e.toString());
		
		try {			//il metodo poteva generare un'eccezione e pertanto va gestita con un costrutto try-catch 
			e.cancella(el);	//el è presente e non genera eccezioni
			e.cancella(new Elemento(17));	//l'elemento non è presente e genera eccezione
		} catch (ElementoMancante e1) {
			System.err.println(e1.getMessage());   		//richiamo il messaggio inserito nel costruttore dell'eccezione
		}
		
		
	}

}
