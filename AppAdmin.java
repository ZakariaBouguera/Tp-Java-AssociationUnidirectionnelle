package fr.voxi.admin;

import java.time.LocalDate;
import java.util.ArrayList;

public class AppAdmin {
	public static void main(String[] args) {
		Auteur aut115 = new Auteur(115, "SAND", "George"); //qs1
		System.out.println(aut115.toString());//qst2
		System.out.println(aut115.getNom());//qst3
		
		Oeuvre oeuv35 = new Oeuvre (35, "Indiana", aut115,"SAND"); //qst4
		System.out.println(oeuv35.toString());//qst5
		System.out.println(oeuv35.getTitre());//qst6
		System.out.println(oeuv35.getAuteur());//qst7
		System.out.println(oeuv35.getNom());//8
		
		AudioBook audio235 = new AudioBook(235, oeuv35, "Francais");//9
		System.out.println(audio235.toString());//10
		System.out.println(oeuv35.getTitre());//12
		System.out.println(oeuv35.getAuteur());//13
		System.out.println(oeuv35.getNom());//14
		
		ArrayList <Auteur> LesAuteurs = new  ArrayList <Auteur>();//15
		LesAuteurs.add (0, new Auteur (111, "MAUPASSANT", "Guy de") );
		LesAuteurs.add (1, new Auteur (112, "DUMAS", "Alexandre") );
		LesAuteurs.add (2, new Auteur (113, "CAMUS", "Albert") );
		LesAuteurs.add (3, new Auteur (114, "BARJAVEL", "René") );
		
		for (int i = 0; i < LesAuteurs.size(); i = i+1) {
			System.out.println(LesAuteurs.get(i).getNom()+" "+ LesAuteurs.get(i).getPrenom());//16
		}
		for (int i = 0; i < LesAuteurs.size(); i = i+1) { //17
			if (LesAuteurs.get(i).getNumero() == 113) {
				System.out.println("17 " +LesAuteurs.get(i).getNom()+" "+ LesAuteurs.get(i).getPrenom());
			}
		}
		
		ArrayList <Oeuvre> LesOeuvres = new  ArrayList <Oeuvre>();//18
		LesOeuvres.add(0, new Oeuvre (28,"La Reine Margot", LesAuteurs.get(1)));
		LesOeuvres.add(1, new Oeuvre (31,"Bel Ami", LesAuteurs.get(0)));
		LesOeuvres.add(2, new Oeuvre (28,"Chanson de Roland"));
		LesOeuvres.add(3, new Oeuvre (33,"Pauline",LesAuteurs.get(1)));
		int nbOeuvreinconnu = 0;
		for (int i = 0; i < LesOeuvres.size()-1; i = i+1) {//20
			if (LesOeuvres.get(i).getAuteur() != null) {
				System.out.println("20- " +LesOeuvres.get(i).getTitre()+" "+ LesOeuvres.get(i).getAuteur().getNom());
			}
			else { //19
					nbOeuvreinconnu += 1;
					System.out.println("19 - Le nombre d'oeuvre avec un auteur inconnu est de " + nbOeuvreinconnu);
				}			
		}
		
		int nbOeuvreDumas = 0;
		for (int i = 0; i < LesOeuvres.size(); i = i+1) {	
			if (LesOeuvres.get(i).getAuteur() == LesAuteurs.get(1)) {
				nbOeuvreDumas +=1;
			}
		}
		System.out.println("21 - Le nombre d'oeuvre de l'auteur DUMAS est de " + nbOeuvreDumas);
				
		ArrayList <AudioBook> LesAudioBook = new  ArrayList <AudioBook>(); //22
		LesAudioBook.add(0, new AudioBook(223, LesOeuvres.get(2), "Français"));
		LesAudioBook.add(1, new AudioBook(224, LesOeuvres.get(0), "Anglais"));
		LesAudioBook.add(2, new AudioBook(225, LesOeuvres.get(0), "Français"));
		LesAudioBook.add(3, new AudioBook(228, LesOeuvres.get(3), "Anglais"));
		LesAudioBook.add(4, new AudioBook(229, LesOeuvres.get(1), "Français"));
		
		for (int i = 0; i < LesAudioBook.size(); i = i+1) {
			if (LesAudioBook.get(i).getOeuvre().getAuteur() != null) {
				System.out.println("23 - "+ LesAudioBook.get(i).getOeuvre().getAuteur().getPrenom() + " "+ LesAudioBook.get(i).getOeuvre().getAuteur().getNom() );
			}
		}
		int NbRB = 0;
		for (int i = 0; i < LesAudioBook.size(); i = i+1) {
			if (LesAudioBook.get(i).getOeuvre().getAuteur() == LesAuteurs.get(3)) {
				NbRB += 1 ;
				
			}
		}
		System.out.println("24 - nombre d'audio-books dont font l'objet les œuvres de René Barjavel " + NbRB);

		ArrayList <Ecoute> LesEcoutes = new ArrayList <Ecoute>(); //qst 25
		LesEcoutes.add(0, new Ecoute(503,LocalDate.of(2021, 02, 28),LesAudioBook.get(1)));
		LesEcoutes.add(1, new Ecoute(504,LocalDate.of(2021, 02,28),LesAudioBook.get(2)));
		LesEcoutes.add(2, new Ecoute(505,LocalDate.of(2021, 02,28),LesAudioBook.get(1)));
		LesEcoutes.add(3, new Ecoute(510,LocalDate.of(2021, 02,28),LesAudioBook.get(4)));
		LesEcoutes.add(4, new Ecoute(511,LocalDate.of(2021, 03,01),LesAudioBook.get(3)));		
		
		System.out.println("26 - " + LesEcoutes.get(4).getNumero());
		for (int i = 0; i < LesEcoutes.size(); i = i+1) {
			if (LesEcoutes.get(i).getAudiobook().getOeuvre().getAuteur() != null) {
				System.out.println("27 - "+ LesEcoutes.get(i).getAudiobook().getOeuvre().getAuteur().getPrenom() + " "+ LesEcoutes.get(i).getAudiobook().getOeuvre().getAuteur().getNom());		
			}
		}
		int NbGuy2 = 0;
		for (int i = 0; i < LesEcoutes.size(); i = i+1) {
			if(LesEcoutes.get(i).getAudiobook().getLangue() == "Anglais" && LesEcoutes.get(i).getAudiobook().getOeuvre().getAuteur().getNom() == "MAUPASSANT") {
				NbGuy2 += 1 ;
			}
		}
		System.out.println("28 -" + "nombre d'écoutes des œuvres de Guy de Maupassant en version anglaise " + NbGuy2);
	
	}	
}


