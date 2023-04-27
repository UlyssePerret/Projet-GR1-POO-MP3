public class Album {
	
	public int id_album;
	public int nombre_morceau;
	public int annee_enregistrement;
	public String nom_album;
	public String genre_musical;
	public String compositeur;
	
	//GETTEUR
	
	public int getId_album() {
		return id_album;
	}

	public String getNom_album() {
		return nom_album;
	}
	public int getNombre_morceau() {
		return nombre_morceau;
	}

	public String getGenre_musical() {
		return genre_musical;
	}

	public String getCompositeur() {
		return compositeur;
	}

	public int getAnnee_enregistrement() {
		return annee_enregistrement;
	}
	//SETTEUR
	public void setNom_album(String nom_album) {
		this.nom_album = nom_album;
	}
	
	public void setId_album(int id_album) {
		this.id_album = id_album;
	}
	
	public void setNombre_morceau(int nombre_morceau) {
		this.nombre_morceau = nombre_morceau;
	}
	
	public void setGenre_musical(String genre_musical) {
		this.genre_musical = genre_musical;
	}
	public void setCompositeur(String compositeur) {
		this.compositeur = compositeur;
	}
	public void setAnnee_enregistrement(int annee_enregistrement) {
		this.annee_enregistrement = annee_enregistrement;
	}

	//Fonction
	public void ecouter_album(){
		System.out.println("J'écoute un album");
	}
	public void explorer_album(){
		System.out.println("J'explore album");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
