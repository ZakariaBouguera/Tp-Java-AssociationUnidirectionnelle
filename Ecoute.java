package fr.voxi.admin;
import java.time.LocalDate ;
public class Ecoute { 
	private  int numero ;
	private LocalDate date ;
	private AudioBook audiobook ;
	
	public Ecoute (int numero, LocalDate date, AudioBook audiobook) {
		this.numero = numero ; 
		this.date = date;
		this.audiobook = audiobook;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public AudioBook getAudiobook() {
		return audiobook;
	}

	public void setAudiobook(AudioBook audiobook) {
		this.audiobook = audiobook;
	}

	@Override
	public String toString() {
		return "Ecoute [numero=" + numero + ", date=" + date + ", audiobook=" + audiobook + "]";
	}
	

}