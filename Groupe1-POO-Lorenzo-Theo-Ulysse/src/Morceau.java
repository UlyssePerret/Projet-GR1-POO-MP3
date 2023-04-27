 /* Morceau
  * 
  */
class Morceau extends DonnebruteMorceau {

	//Variables 
	int id_morceau; //id morceau
	String nom_morceau; //nom du morceau
	String titre_morceau; //titre du morceau
	String nom_artiste; //Nom artiste
	int duree_morceau; //duree_morceau
	String format; //format du morceau
	int taille; //Taille morceau
	int h; //heure
	int m; //minute
	int s; //seconde
	
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
	 
	//Retour des varilabes de la classe DonnebruteMorceau
 	/** Constructeur Morceau
 	 * 
 	 * @param ouverture : ouverture du fichier
 	 * @param titre : titre du fichier
	 * @param auteurs : auteur
	 * @param canaux_audio : canaux audio
	 * @param taux_echantillonnage : taux de musique
	 * @param album : album de morceau
	 * @param genre : genre de musique
	 * @param compositeur : compositeur de musique
	 * @param taille : taille
 
 	 * Super->venu de DonnebruteMorceau
 	 */
		public Morceau(String ouverture, String titre, String auteurs, String canaux_audio, String taux_echantillonnage,
				String album, String genre, String compositeur, String taille) {
			super(ouverture, titre, auteurs, canaux_audio, taux_echantillonnage, album, genre, compositeur, taille);
			// TODO Auto-generated constructor stub
		}
	
	//Function
		/**Date ecoute
		 * 
		 * @param h
		 * @param m
		 * @param s
		 */
	public void date_ecoute(int h, int m, int s){
		System.out.println("La derniere ecoute est :");
	};
	
	public void date_derniermodif(int h, int m, int s){
		System.out.println("La derniere mofication est :");
	};
	public void date_derniercreation(int h, int m, int s){
		System.out.println("La c$date de creation est :");
	};
	
	/* ecouter()
	 * fonction pour ecouter la musique
	 */
	public void ecouter(){
		System.out.println("J'ecoute une morceau");
	}

	/*  dernierecoute()
	 *  permet dernier ecoute
	 */
	public void dernierecoute(){
		System.out.println("Dernier Ecoute");
	}
	
	/*
	 Redéfinition de toString() pour l'affichage
	*/
	public String toString() {
		return "Pour la musique intitulé "+titre+" nous avons les informations suivante : \n"
				+ "Date d'ouverture : '" + ouverture + "', Titre : '" + titre + "', Auteurs=" + auteurs
				+ ", Canaux audio=" + canaux_audio + "\n"
				+"Taux echantillonnage=" + taux_echantillonnage + ", Album="
				+ album + ", Genre=" + genre + ", Compositeur=" + compositeur +  "\n"
				+", Taille=" + taille + ", annee="
				+ annee + ", Duree=" + duree + ", Date de creation=" + datecreation + ", Date de modification=" + datemodifier
				+ "] \n";
	}
	 
	
	public static void main(String[] args) {
		
		System.out.println("\n");
		System.out.println("Test Fonction - Morceau");
		
		DonnebruteMorceau donneetest = new DonnebruteMorceau(
				"ouverture","titre",
				"auteurs", "canaux_audio",
				"taux_echantillonnage", "album",
				"genre","compositeur", "taille" );
		
		DonnebruteMorceau donnees1 = new DonnebruteMorceau(
				"2021-05-05","Ouverture",
				"Lambcat", "Audio MP3",
				"Stéreo", "Cursed princess",
				"comedie", "Lambcat","taille");
	 
		//DonnebruteMorceau.add(donnees1);
		
		System.out.println( "########## Repertoire ################" ) ;
		System.out.println ("Nous  avons les morceaux suivant  dans la playlist : ");
		
		System.out.println( donneetest.toString() ); 
		System.out.println( donnees1.toString() );
		
		//test ecoute?
	}
 
}
