
class Elemento {
	Integer dimensione;
	Elemento(int dim){
		this.dimensione=dim;
	}
	
	/*
	 * il metodo hashCode restiusce l'hashCode dell'attributo dimensione
	 */
	public int hashCode() {
		return dimensione.hashCode();
	}
	
	//metodo equals, overriding dalla classe object, stabilisce il confronto tra due elementi
	public boolean equals(Object o) {
		Elemento e1 = (Elemento) o;
		
		return this.dimensione==e1.getDimensione();
	}
	//overriding da Object
	public String toString() {
		return "L'elemento è :" + this.dimensione;
	}
	Integer getDimensione() {
		return dimensione;
	}

	void setDimensione(Integer dimensione) {
		this.dimensione = dimensione;
	}
}
