package phonebook;

import java.util.ArrayList;
import java.util.Iterator;

public class PhonebookList implements PhonebookInterface {
	/*
 	 * In this class, we show 3 ways for iterating an array list. 
 	 * 1) by for             in searchByName()
 	 * 2) by iterator        in searchByNumber()
 	 * 3) by element index   in searchByEmail()
 	 */

	/*
	 Définition des champs de classe
	*/


	/*
	 Définition des champs d'instance
	*/
	private ArrayList<Contact> contacts = new ArrayList<Contact>();

	/*
	 Constructeur(s)
	*/	
	/* Si aucun constructeur présent, alors la JVM en utilise un par défaut !!!
	public PhonebookList() {

	}
	public PhonebookList(int size) {

	}
	*/

	/*
	 Redéfinition de toString() pour l'affichage
	*/
	/**/
	public String toString() { 
		String msg = "\n";
		for (int i=0; i < contactCount(); i++)
			msg = msg + contacts.get(i).toString();
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
		this.contacts.add(new_contact);
	}
	// Suppression d'un contact existant
	public void remove(Contact old_contact) {
		// This works because equals has been redefined (override) in Contact class.
		this.contacts.remove(old_contact);
	}
	// Recherche d'un contact avec son nom
	public Contact searchByName(String search_name) {
		// Le contact cherché n'existe pas...
		Contact result = null;

		// Boucle pour tous les contacts, les uns après les autres
		for (Contact contact : this.contacts) {
			if (contact.getName().equals(search_name)) {
				result = contact;
			}
		}

		return result;
	}
	// Recherche d'un contact avec son numéro
	public Contact searchByNumber(String search_number) {
		// Le contact cherché n'existe pas...
		Contact result = null;

		// Boucle pour tous les contacts, les uns après les autres
		Iterator<Contact> iterator = this.contacts.iterator();
		while (iterator.hasNext()) {
			Contact contact = iterator.next();
			if (contact.getNumber().equals(search_number)) {
				result = contact;
			}
		}

		return result;
	}
	// Recherche d'un contact avec son email
	public Contact searchByEmail(String search_email) {
		// Le contact cherché n'existe pas...
		Contact result = null;

		// Boucle pour tous les contacts, les uns après les autres
		for (int index = 0; index < contactCount(); index++) {
			Contact contact = this.contacts.get(index);
			if (contact.getEmail().equals(search_email)) {
				result = contact;
			}
		}

		return result;
	}

	// Récupération du nombre de contacts
	public int contactCount() {
		return this.contacts.size();
	}	

}
