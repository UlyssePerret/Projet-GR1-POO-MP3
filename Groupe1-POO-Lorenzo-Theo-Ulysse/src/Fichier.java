
public class Fichier extends Donnefichier{
	
	int id_repertoire;
	int taille_repertoir;
	int gestion_fichier;
	
	//Retour variables donne bute
		//String
			public String ouverture;//Ouverture du morceau
			public String titre;//titre
			public String auteurs; //auteur
			public String canaux_audio; //caunaux audio
			public String taux_echantillonnage; //méthode de musique
			public String album; //album
			public String genre; //genre de musique
			public String compositeur; //compositeur 
			 
			//Donnee
			public int annee; //Anneee
			public int duree; //duree du morceau
			public int datecreation; //date de creation
			public int datemodifier; //date de la modificaiton
		
			public Fichier(String ouverture, String titre, String auteurs, String canaux_audio, String taux_echantillonnage,
					String album, String genre, String compositeur, String taille) {
				super(ouverture, titre, auteurs, canaux_audio, taux_echantillonnage, album, genre, compositeur, taille);
				// TODO Auto-generated constructor stub
			}
	public  void voir_fichier() {
		 
	}
	
	
	
	
}
