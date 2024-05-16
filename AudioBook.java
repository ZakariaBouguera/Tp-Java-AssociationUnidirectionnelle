package fr.voxi.admin;

public class AudioBook {
	private int numero;
	private Oeuvre oeuvre;
	private String langue ; 
	
	public AudioBook (int numero, Oeuvre oeuvre, String langue) {
		this.numero = numero;
		this.oeuvre = oeuvre;
		this.langue = langue;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Oeuvre getOeuvre() {
		return oeuvre;
	}

	public void setOeuvre(Oeuvre oeuvre) {
		this.oeuvre = oeuvre;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	@Override
	public String toString() {
		return "AudioBook [numero=" + numero + ", oeuvre=" + oeuvre + ", langue=" + langue + "]";
	}
	
	
}
