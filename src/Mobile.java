/*
 * Definire la classe Mobile che implementa l'interfaccia Articolo. 
 */
public class Mobile implements Articolo {

	String nome;
	double prezzo;
	double lunghezza;
	double altezza;
	double profondita;

	public Mobile(String nome, double prezzo, double lunghezza, double altezza, double profondita) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.lunghezza = lunghezza;
		this.altezza = altezza;
		this.profondita = profondita;
	}

	public double getLunghezza() {
		return lunghezza;
	}
	
	public double getAltezza() {
		return altezza;
	}
	
	public double getProfondita() {
		return profondita;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getPrezzo() {
		return this.prezzo;
	}
	
	public String toString(){
		return this.nome + " Prezzo: " + prezzo + " Misure: " + lunghezza + " X " + altezza + " X " 
				+ profondita;
	}
}
