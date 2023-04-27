
public class Donnefichier {
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
	
	//constructeur
	/**Contrucuteur brouillon
	 * 
	 * @param ouverture2
	 * @param titre2
	 * @param auteurs2
	 * @param canaux_audio2
	 * @param taux_echantillonnage2
	 * @param album2
	 * @param genre2
	 * @param compositeur2
	 * @param taille2
	 */
	public Donnefichier(String ouverture2, String titre2, String auteurs2, String canaux_audio2,
			String taux_echantillonnage2, String album2, String genre2, String compositeur2, String taille2) {
		// TODO Auto-generated constructor stub
	}
	
	//getteur
	/** Get Ouverture
	 * avoir Ouverture du fichier
	 * @return  ouverture
	 */
	public String getOuverture() {
		return ouverture;
	}
	/**getTitre
	 * avoir le titre
	 * @return titre
	 */
	public String getTitre() {
		return titre;
	}
/** getAuteurs
 * avoir auteur
 * @return auteur
 */
	public String getAuteurs() {
		return auteurs;
	}

	/**getCanaux_audio
	 * avoir le canaux
	 * @return canaux_audio;
	 */
	public String getCanaux_audio() {
		return canaux_audio;
	}

	/**getCanaux_audio
	 * avoir
	 * @return taux_echantillonnage;
	 */
	public String getTaux_echantillonnage() {
		return taux_echantillonnage;
	}

	/**getAlbum() Album
	 * avoir l'abum
	 * @return
	 */
	public String getAlbum() {
		return album;
	}

	/** getGenre()
	 * avoir le genre 
	 * @return genre
	 */
	public String getGenre() {
		return genre;
	}
	/**getCompositeur()
	 * avoir le compositeur
	 * @return compositeur;
	 */
	public String getCompositeur() {
		return compositeur;
	}
	/** getTaille()
	 * avoir la taille
	 * @return
	 */
	public String getTaille() {
		return taille;
	}
	
	/** getAnnee() 
	 * avoir l'annee
	 * @return annee
	 */
	public int getAnnee() {
		return annee;
	}
	
	/** getDuree
	 *  avoir la duree
	 * @return duree
	 */
	public int getDuree() {
		return duree;
	}

	/** getDatecreation()
	 * 
	 * @return datecreation
	 */
	public int getDatecreation() {
		return datecreation;
	}

	/** getDatemodifier() 
	 * avoir la date modifier
	 * @return datemodifier
	 */
	public int getDatemodifier() {
		return datemodifier;
	}
	
	//setteur
	/**setOuverture
	 * modifier l'ouverture
	 * @param ouverture
	 */
	public void setOuverture(String ouverture) {
		this.ouverture = ouverture;
	}
	
	/** setTitre
	 * modifier le titre
	 * @param titre
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	/**setAuteur
	 * modifier auteur
	 * @param auteurs
	 */
	public void setAuteurs(String auteurs) {
		this.auteurs = auteurs;
	}
	
	/**setCanaux_audio
	 * madifieu le canaux
	 * @param canaux_audio
	 */
	public void setCanaux_audio(String canaux_audio) {
		this.canaux_audio = canaux_audio;
	}
	/** setTaux_echantillonnage
	 * avoir 
	 * @param taux_echantillonnage
	 */
	public void setTaux_echantillonnage(String taux_echantillonnage) {
		this.taux_echantillonnage = taux_echantillonnage;
	}
	/** setAlbum
	 * avoir l'album
	 * @param album
	 */
	public void setAlbum(String album) {
		this.album = album;
	}
	
	/**Set genre
	 * avoir le genre
	 * @param genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	/** setCompositeur
	 *  modifer le  compositeur
	 * @param compositeur
	 */
	public void setCompositeur(String compositeur) {
		this.compositeur = compositeur;
	}

	/**setTaille
	 * modifier la taille
	 * @param taille
	 */
	public void setTaille(String taille) {
		this.taille = taille;
	}

	 /**setAnnee
	  * modifier l'anne
	  * @param annee
	  */
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	/** setDuree
	 * modifier la duree
	 * @param duree
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}
	/**setDatecreation
	 * modifier la date creation
	 * @param datecreation
	 */
	public void setDatecreation(int datecreation) {
		this.datecreation = datecreation;
	}
	
	 /**setDatemodifier
	  *  modifier la date a modifier
	  * @param datemodifier
	  */
	public void setDatemodifier(int datemodifier) {
		this.datemodifier = datemodifier;
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
