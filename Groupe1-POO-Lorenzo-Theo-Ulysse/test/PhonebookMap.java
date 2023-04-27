package phonebook;

import java.util.Collection;
import java.util.HashMap;

public class PhonebookMap implements PhonebookInterface {
	/*
	 Définition des champs de classe
	*/


	/*
	 Définition des champs d'instance
	*/
	// We choose number (une des valeurs qui est unique) as the key of the hash map.
	private HashMap<String,Contact> contacts = new HashMap<String,Contact>();

	/*
	 Constructeur(s)
	*/	
	/* Si aucun constructeur présent, alors la JVM en utilise un par défaut !!!
	public PhonebookMap() {

	}
	public PhonebookMap(int size) {

	}
	*/

	/*
	 Redéfinition de toString() pour l'affichage
	*/
	/**/
	public String toString() { 
		String msg = "\n";
		Collection<Contact> values = this.contacts.values();
		for (Contact contact : values)
			msg = msg + contact.toString();
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
		this.contacts.put(new_contact.getNumber(), new_contact);
	}
	// Suppression d'un contact existant
	public void remove(Contact old_contact) {
		this.contacts.remove(old_contact.getNumber());
	}
	// Recherche d'un contact avec son nom
	public Contact searchByName(String search_name) {
		// Le contact cherché n'existe pas...
		Contact result = null;
		Collection<Contact> values = this.contacts.values();
		for (Contact contact : values) {
			if (contact.getName().equals(search_name)) {
				result = contact;
			}
		}
		return result;
	}
	// Recherche d'un contact avec son numéro
	public Contact searchByNumber(String search_number) {
		return this.contacts.get(search_number);
	}
	// Recherche d'un contact avec son email
	public Contact searchByEmail(String search_email) {
		// Le contact cherché n'existe pas...
		Contact result = null;
		Collection<Contact> values = this.contacts.values();
		for (Contact contact : values) {
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
