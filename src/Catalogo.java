import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * La classe catalogo rappresenta un catalogo di articoli commerciali, quindi memorizza gli articoli 
 * in una lista. Definire poi i vari metodi.
 */
public class Catalogo<E extends Articolo> {
	
	private List<E> catalogo;
	
	public Catalogo() {
		this.catalogo = new ArrayList<E>();
	}
	
	void aggiungiArticolo(E art) {
		this.catalogo.add(art);
	}
	
	List<E> getArticoliSottoPrezzo(double prezzo) {
		List<E> articoli = new ArrayList<E>();
		Iterator<E> it = this.catalogo.iterator();
		while(it.hasNext()) {
			E el = it.next();
			if(el.getPrezzo() < prezzo) {
				articoli.add(el);
			}
		}
		return articoli;
	}
	
	public String toString() {
		String s="Catalogo articoli";
		s += "---------------------\n";
		Iterator<E> it = this.catalogo.iterator();
		while(it.hasNext()) {
			E el=it.next();
			s+=el.toString()+"\n";
		}
		return s;
	}
}
