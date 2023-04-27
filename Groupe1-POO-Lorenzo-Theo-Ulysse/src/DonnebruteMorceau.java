 
public class DonnebruteMorceau{
	//Variables
	
	//String
	public  String ouverture;//Ouverture du morceau
	public String titre;//titre
	public String auteurs; //auteur
	public String canaux_audio; //caunaux audio
	public String taux_echantillonnage; //méthode de musique
	public String album; //album
	public String genre; //genre de musique
	public String compositeur; //compositeur 
	public String taille; //taille du fichier
	
	//Donnee int
	public int annee; //Anneee
	public int duree; //duree du morceau
	public int datecreation; //date de creation
	public int datemodifier; //date de la modificaiton
	 
	//Constructeur
	//Remettre a jour les composant
	/** DonnebruteMorceau est un contructeur
	 * Parametre
	 * @param ouverture : ouverture du fichier
	 * @param titre : titre du fichier
	 * @param auteurs : auteur
	 * @param canaux_audio : canaux audio
	 * @param taux_echantillonnage : taux de musique
	 * @param album : album de morceau
	 * @param genre : genre de musique
	 * @param compositeur : compositeur de musique
	 * @param taille : taille
	 * 
	 * Retourne le constructeur avec les donnes
	 */
	
	public DonnebruteMorceau(
			String ouverture,String titre,
			String auteurs, String canaux_audio,
			String taux_echantillonnage, String album,
			String genre, String compositeur, String taille) {
		
	//Donnees
		this.ouverture = ouverture; //ouverture
		this.titre = titre; //titre
		this.auteurs = auteurs; //auteur
		this.canaux_audio = canaux_audio;//canaux - type d'audio
		this.taux_echantillonnage= taux_echantillonnage; //echantionn - hertz taille
		this.album = album; //album
		this.genre= genre; //genre de musique
		this.compositeur=compositeur; //compositeur
		this.taille=taille; //taille du fichier
	}  
	
	 //Getteur 
	/**Getteur 
	 * get Ouverture : avoir l'ouvertur
	 * @returnouverture
	 */
	public String getOuverture() {
		return ouverture;
	}
	 
	/** getTitre()
	 * avoir titre de la musique
	 * @return titre
	 */
	public String getTitre() {
		return titre;
	}
	 
	/** getAuteurs
	 * avoir auteur de la musique
	 * @return auteurs
	 */
	public String getAuteurs() {
		return auteurs;
	}

	/** getCanaux_audio
	 * avoir le canaux audio
	 * @return canaux_audio
	 */
	public String getCanaux_audio() {
		return canaux_audio;
	}
	
	/** getAlbum
	 * avoir l'album
	 * @return album
	 */
	public String getAlbum() {
		return album;
	}
	/** getTaux_echantillonnage
	 * avoir le taux echantillo,nage
	 * @return taux_echantillonnage
	 */
	public String getTaux_echantillonnage() {
		return taux_echantillonnage;
	}
	 
	/**getGenre
	 * modifer genre de la musique
	 * @return genre
	 */
	public String getGenre() {
		return genre;
	} 
	/*getCompositeur
	 * avoir compositeur de la musieur
	 */
	public String getCompositeur() {
		return compositeur;
	}
	/** gettaille
	 * get taille
	 * @return taille
	 */
	public String getTaille() {
		return taille;
	}
	 
	/** getAnnee
	 * avoir l'annee
	 * @return annee
	 */
	public int getAnnee() {
		return annee;
	}
 
	/**getDuree
	 * avoir la duree 
	 * @return duree
	 */
	public int getDuree() {
		return duree;
	}

	/**getDatecreation
	 * avoir la date de la creation
	 * @return datecreation
	 */
	public int getDatecreation() {
		return datecreation;
	}
	
	/**getDatemodifier
	 * avoir la date modifier
	 * @return datemodifier
	 */
	public int getDatemodifier() {
		return datemodifier;
	}
	
	 //Setteur
	/*Setteur Ouverture 
	 */
	/** setteur ouverture
	 * modifier l'ouverture
	 * @param ouverture
	 */
	public void setOuverture(String ouverture) {
		this.ouverture = ouverture;
	}
	
	/** setTitre
	 *modifier le titre  
	 * @param titre
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
 
	/**SetAuteur
	 * modifier l'auteur de la musique 
	 * @param auteurs
	 */
	public void setAuteurs(String auteurs) {
		this.auteurs = auteurs;
	}
 
	/** setCanaux_audio
	 * modifier les canaux audio
	 * @param canaux_audio
	 */
	public void setCanaux_audio(String canaux_audio) {
		this.canaux_audio = canaux_audio;
	}

	/** setTaux_echantillonnage 
	 * modifier le taux echantillannage
	 * @param taux_echantillonnage
	 */
	public void setTaux_echantillonnage(String taux_echantillonnage) {
		this.taux_echantillonnage = taux_echantillonnage;
	}
 
	/**setAlbum
	 * modifier l'album
	 * @param album
	 */
	public void setAlbum(String album) {
		this.album = album;
	}
 /** setGenre
  *  modifier le genre
  * @param genre
  */
	public void setGenre(String genre) {
		this.genre = genre;
	}
 
	/** Compositeur
	 * compositeur 
	 * @param compositeur
	 */
	public void setCompositeur(String compositeur) {
		this.compositeur = compositeur;
	}

/** setTaille
 * modifier la taille
 * @param taille
 */
	public void setTaille(String taille) {
		this.taille = taille;
	}

	/**setAnnee
	 * modifier l'anne
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}
 
	/**setDuree
	 * duree du morceau
	 * @param duree
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}
 
	/** setDatecreation
	 * datecreation
	 * @param datecreation
	 */
	public void setDatecreation(int datecreation) {
		this.datecreation = datecreation;
	}
 
	/**  setDatemodifier
	 * datemodifier : la 
	 * @param datemodifier
	 */
	public void setDatemodifier(int datemodifier) {
		this.datemodifier = datemodifier;
	}

	 
	
	//Autres methodes
	@Override
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

	//Test
	public static void main(String[] args) {
		
		System.out.println("\n");
		System.out.println("Test Fonction - DonnebruteMorceau");
		
		DonnebruteMorceau donneetest = new DonnebruteMorceau(
				"ouverture","titre",
				"auteurs", "canaux_audio",
				"taux_echantillonnage", "album",
				"genre","compositeur", "taille" );
		
		DonnebruteMorceau donnees1 = new DonnebruteMorceau(
				"2021-05-05","Ouverture",
				"Lambcat", "Audio MP3",
				"Stéreo", "Cursed princess",
				"Comedie", "Lambcat","210 ko");
	 
		//DonnebruteMorceau.add(donnees1);
		
		System.out.println( "########## Informations - test ajout ################" ) ;
		System.out.println ("Nous avons  Les donnees brutes suivantes  : ");
		System.out.println ( donneetest.toString());
		System.out.println ( donnees1.toString());
		
		  
	}
	 
}
