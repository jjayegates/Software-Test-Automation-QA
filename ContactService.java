import java.util.ArrayList;

public class ContactService {
	private int nextID = 0;
	public ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public boolean addContact(String fname, String lname, String pNum, String addr) {
		Contact newContact = new Contact("" + nextID, fname, lname, pNum, addr);
		if (newContact.getID() != null) {
			nextID++;
			contacts.add(newContact);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean deleteContact(String contactID) {		
		return contacts.remove(new Contact(contactID, "dummy", "dummy", "1234567890", "dummy"));
	}
	
	public boolean updateContact(String contactID, String fname, String lname, String pNum, String addr ) {
		
		int index = contacts.indexOf(new Contact(contactID, "dummy", "dummy", "1234567890", "dummy"));
		if (index < 0) {
			return false;
		}
		else {
			if (fname != null) contacts.get(index).setFirstName(fname);
			if (lname != null) contacts.get(index).setLastName(lname);
			if (pNum != null) contacts.get(index).setPhone(pNum);
			if (addr != null) contacts.get(index).setAddress(addr);
			return true;
		}
	}
}
