package fr.voxi.admin;

public class Oeuvre {
	private int numero ; 
	private String titre ; 
	private Auteur auteur;
	private String nom;
	
	public Oeuvre (int numero, String titre, Auteur auteur, String nom) {
		this.numero = numero ; 
		this.titre = titre ;
		this.auteur = auteur;
		this.nom = nom;
	}
	public Oeuvre (int numero, String titre,Auteur auteur) {
		this.numero = numero ; 
		this.titre = titre ;
		this.auteur = auteur;
	}
	public Oeuvre (int numero, String titre) {
		this.numero = numero ; 
		this.titre = titre ;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Oeuvre [numero=" + numero + ", titre=" + titre + ", auteur=" + auteur + ", nom=" + nom + "]";
	}
	

	
	
}
