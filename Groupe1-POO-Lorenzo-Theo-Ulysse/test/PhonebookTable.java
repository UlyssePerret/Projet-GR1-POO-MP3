package phonebook;

public class PhonebookTable implements PhonebookInterface {
	/*
	 Définition des champs de classe
	*/
	private static int MAX = 1000;

	/*
	 Définition des champs d'instance
	*/
	private Contact[] contacts;
	private int nbContacts;

	/*
	 Constructeur(s)
	*/	
	public PhonebookTable() {
		this.contacts = new Contact[MAX];
		this.nbContacts = 0;
	}
	public PhonebookTable(int size) {
		this.contacts = new Contact[size];
		this.nbContacts = 0;
	}

	/*
	 Redéfinition de toString() pour l'affichage
	*/
	/**/
	public String toString() { 
		String msg = "\n";
		for (int i=0; i < nbContacts; i++)
			msg = msg + this.contacts[i].toString();
		msg = msg + "\n";
		return msg;
	}
	/**/

	/*
	 Définition des accesseurs
	*/


	/*
	 Définition des mutateurs
	*/


	/*
	 Définition des opérations
	*/
	// Ajout d'un nouveau contact
	public void add(Contact new_contact) {
		// S'il reste de la place, on peut ajouter !
		if (nbContacts != this.contacts.length) {
			// On ajoute à la fin
			this.contacts[nbContacts] = new_contact;
			this.nbContacts++;
		}
	}
	// Suppression d'un contact existant
	public void remove(Contact old_contact) {
		int index;
		// On cherche si le contact est dans le répertoire
		for (index = 0; index < this.nbContacts; index++) {
			// Les deux chaînes sont-elles égales ?
			if (this.contacts[index].equals(old_contact)) {
				// Si oui, on efface la chaîne cherchée !
				this.contacts[index] = null;
				break;
			}
		}
		// On doit déplacer les contacts suivants (ceux qui sont 
		// présents après le "trou" créé par la suppression)
		for (int newIndex = index; index < this.nbContacts-1; index++) {
			this.contacts[newIndex] = this.contacts[newIndex + 1];
		}
		// On doit diminuer le nombre d'éléments
		if (index != this.nbContacts) {
			this.nbContacts--;
		}
	}
	// Recherche d'un contact avec son nom
	public Contact searchByName(String search_name) {
		// Pour examiner chacun des contacts
		for (int index = 0; index < this.nbContacts; index++) {
			// Le nom du contact courant est-il celui du contact recherché ?
			if (this.contacts[index].getName().equals(search_name)) {
				return this.contacts[index];
			}
		}
		// Le contact cherché n'existe pas...
		return null;
	}
	// Recherche d'un contact avec son numéro
	public Contact searchByNumber(String search_number) {
		// Pour examiner chacun des contacts
		for (int index = 0; index < this.nbContacts; index++) {
			// Le numéro du contact courant est-il celui du contact recherché ?
			if (this.contacts[index].getNumber().equals(search_number)) {
				return this.contacts[index];
			}
		}
		// Le contact cherché n'existe pas...
		return null;
	}
	// Recherche d'un contact avec son email
	public Contact searchByEmail(String search_email) {
		// Pour examiner chacun des contacts
		for (int index = 0; index < this.nbContacts; index++) {
			// L'email du contact courant est-il celui du contact recherché ?
			if (this.contacts[index].getEmail().equals(search_email)) {
				return this.contacts[index];
			}
		}
		// Le contact cherché n'existe pas...
		return null;
	}

	// Récupération du nombre de contacts
	public int contactCount() {
		return this.nbContacts;
	}	

}
