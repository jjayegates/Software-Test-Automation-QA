import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class ContactServiceTest {
	
	@Test
	public void testAddContact() {
		ContactService cs = new ContactService();
		int numContactsBefore = cs.contacts.size(); 
		cs.addContact("first", "last", "0000000000", "123 st");
		int numContactsAfter = cs.contacts.size();
		
		assertEquals(numContactsBefore, numContactsAfter - 1);
		//return numContactsBefore == (numContactsAfter - 1);
	}
	

	@Test
	public void testEditContact() {
		String id = "1";
		ContactService cs = new ContactService();
		cs.addContact("first0", "last0", "0000000000", "123 st 0");
		cs.addContact("first1", "last1", "0000000001", "123 st 1");
		cs.addContact("first2", "last2", "0000000002", "123 st 2");
		
		cs.updateContact(id, "bobby", null, null, null);
		
		assertEquals(cs.contacts.get(1).getFirstName(), "bobby");
		//return cs.contacts.get(1).getFirstName().equals("bobby");
	}
	
	@Test
	public void testEditContact2() {
		String id = "9";
		ContactService cs = new ContactService();
		cs.addContact("first0", "last0", "0000000000", "123 st 0");
		cs.addContact("first1", "last1", "0000000001", "123 st 1");
		cs.addContact("first2", "last2", "0000000002", "123 st 2");
		
		Boolean result = cs.updateContact(id, "bobby", null, null, null);
		
		assertEquals(result, false);
		//return cs.contacts.get(1).getFirstName().equals("bobby");
	}
	

	@Test
	public void testEditContact3() {
		String id = "1";
		ContactService cs = new ContactService();
		cs.addContact("first0", "last0", "0000000000", "123 st 0");
		cs.addContact("first1", "last1", "0000000001", "123 st 1");
		cs.addContact("first2", "last2", "0000000002", "123 st 2");
		
		cs.updateContact(id, "bobby", "Mayfield", null, null);
		
		assertEquals(cs.contacts.get(1).getLastName(), "Mayfield");
		//return cs.contacts.get(1).getFirstName().equals("bobby");
	}
	
	@Test
	public void testEditContact4() {
		String id = "1";
		ContactService cs = new ContactService();
		cs.addContact("first0", "last0", "0000000000", "123 st 0");
		cs.addContact("first1", "last1", "0000000001", "123 st 1");
		cs.addContact("first2", "last2", "0000000002", "123 st 2");
		
		cs.updateContact(id, "bobby", "Mayfield", null, "5678 something else");
		
		assertEquals(cs.contacts.get(1).getAddress(), "5678 something else");
		//return cs.contacts.get(1).getFirstName().equals("bobby");
	}

	
	@Test
	public void testRemoveContact() {
		String id = "1";
		ContactService cs = new ContactService();
		cs.addContact("first0", "last0", "0000000000", "123 st 0");
		cs.addContact("first1", "last1", "0000000001", "123 st 1");
		cs.addContact("first2", "last2", "0000000002", "123 st 2");
		int numContactsBefore = cs.contacts.size(); 
		cs.deleteContact(id);
		int numContactsAfter = cs.contacts.size();
		
		assertEquals(numContactsBefore, numContactsAfter + 1);
		//return numContactsBefore == (numContactsAfter + 1);
	}
}
