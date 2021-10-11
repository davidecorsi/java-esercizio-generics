import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 *La classe ProvaMobile deve essere dotata di un metodo scegliMobile che riceve in ingresso un catalogo di
 * oggetti di tipo Mobile (o suoi sotto-tipi), un prezzo e tre dimensioni (larghezza, altezza, profondità)
 * e restituisce un lista di mobili il cui prezzo è inferiore al prezzo dato e le cui dimensioni sono 
 * inferiori alle dimensioni date.
 */
public class ProvaMobile {
	public static <T extends Mobile> List<T> scegliMobile(Catalogo<T> catalogo, double prezzo, 
			double lunghezza, double altezza, double profondità) {
		List<T> selezionati = new ArrayList<T>();
		List<T> selezionatiPerPrezzo = catalogo.getArticoliSottoPrezzo(prezzo);
		Iterator<T> it = selezionatiPerPrezzo.iterator();
		while(it.hasNext()) {
			T el=it.next();
			if(el.getLunghezza() < lunghezza && el.getAltezza() < altezza 
					&& el.getProfondita() < profondità) {
				selezionati.add(el);
			}
		}
		return selezionati;
	}
}
