
public class Playlist {
	//Variable
	int id_playlist; //Indication du playlist
	String titre_morceau; //Le titre du morceau
	int nbmorceau; //le nombre du morceau
	
	//GETTEUR
	public int getId_playlist() {
		return id_playlist;
	}
	public String getTitre_morceau() {
		return titre_morceau;
	}
	public int getNbmorceau() {
		return nbmorceau;
	}
	
	//SETTEUR
	public void setId_playlist(int id_playlist) {
		this.id_playlist = id_playlist;
	} 
	
	public void setTitre_morceau(String titre_morceau) {
		this.titre_morceau = titre_morceau;
	}
 
	public void setNbmorceau(int nbmorceau) {
		this.nbmorceau = nbmorceau;
	}
	
	//Fonction
	/* ecouter()
	 * fonction pour ecouter la musique
	 */
	public void ecouter_playlist(){
		System.out.println("J'ecoute une playlist");
	}
	/* ajoutermorceau()
	 * fonction pour ajouter
	 */
	public void ajoutermorceau(){
		System.out.println("Ajouter un morceau");
	}
	
	/* supprimermorceau()
	 * fonction pour supprimer
	 */
	public void supprimermorceau(){
		System.out.println("Supprimer un morceau");
	}

	
	//Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Je suis une playlist");
	}

}
