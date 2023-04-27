package phonebook;

public class Contact {
	/*
	 Définition des champs de classe
	*/

	/*
	 Définition des champs d'instance
	*/
	private String name;
	private String number;
	private String email;

	/*
	 Constructeur(s)
	*/
	public Contact(String init_name, String init_number, String init_email) {
		this.name = init_name;
		this.number = init_number;
		this.email = init_email;
	}

	/*
	 Redéfinition de toString() pour l'affichage
	*/
	public String toString() { 
		String msg = "Contact [name=" + name;
		msg = msg + ", number=" + number;
		msg = msg + ", email=" + email + "]\n";
		return msg;
	}

	/*
	 Redéfinition de equals() pour les comparaisons
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj != null) {
			if (obj instanceof Contact) {
				Contact contact = (Contact) obj;
				if (contact.getName() != null && contact.getNumber() != null
						&& contact.getEmail() != null) {
					if (contact.getName().equals(this.name)
							&& contact.getNumber().equals(this.number)
							&& contact.getEmail().equals(this.email)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/*
	 Définition des accesseurs
	*/
	public String getName() {
		return this.name;
	}
	public String getNumber() {
		return this.number;
	}
	public String getEmail() {
		return this.email;
	}

	/*
	 Définition des mutateurs
	*/
	public void setName(String new_name) {
		this.name = new_name;
	}
	public void setNumber(String new_number) {
		this.number = new_number;
	}
	public void setEmail(String new_email) {
		this.email = new_email;
	}
	
	/*
	 Définition des opérations
	*/

}
