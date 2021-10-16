/*
 * classe che modella l'eccezione di un elemento mancante all'interno dell'insieme
 * Estendo la classe Exception che modella un'eccezione.
 * 
 */
class ElementoMancante extends Exception{
	ElementoMancante(String message){	//Costruttore con argomento un messaggio che viene passato al costruttore della superclasse Exception
		super(message);
	}
	ElementoMancante(){	//costruttore a zero argomenti : viene richiamato il costruttore di exception
		super("Elemento mancante nell'insieme");
	}
}
