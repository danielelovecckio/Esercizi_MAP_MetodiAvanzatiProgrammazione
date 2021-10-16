
public class Main {

	public static void main(String[] args) {
		Studente s = new Studente("GG", 12, 1999,13);
		Studente s1 = new Studente("piko", 9, 1998,27);
		Studente s2 = new Studente("dany", 56, 2000,32);
		Pagella p = new Pagella("Informatica", 13);
		Pagella p1 = new Pagella("Informatica", 16);
		Pagella p2 = new Pagella("Informatica", 9);
		
		RegistroScolastico r = new RegistroScolastico();
		r.inserisci(s, p);
		r.inserisci(s1, p1);
		r.inserisci(s2, p2);
		
		
		System.out.println(r.getPagfromStud(s1));
		System.out.println(r.toString());
		
		
		r.incrementaNumeroDiesami();
		
		System.out.println(r.toString());
	}

}
