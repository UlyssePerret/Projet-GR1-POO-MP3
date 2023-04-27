package phonebook;

public interface PhonebookInterface {
	public void add(Contact contact);

	public Contact searchByName(String name);

	public Contact searchByNumber(String number);

	public Contact searchByEmail(String email);

	public void remove(Contact contact);

	public int contactCount();
}
