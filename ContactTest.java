//import static org.junit.Assert.*;
//import  org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {
	
	@Test
	public void testSetFirstName() {
		Contact c = new Contact("oldname", "aaaaaaa", "aaaaaaa", "1234567890", "aaaaaaaaaaaaaaaaaaa");
		String newFirstName = "newName";
		String oldName = c.getFirstName();  
		c.setFirstName(newFirstName);
		assertNotEquals(c.getFirstName(),oldName);
		//return !c.getFirstName().equals(oldName);
	}
	
	@Test 
	public void testSetLastName() {
		Contact c = new Contact("oldname", "aaaaaaa", "aaaaaaa", "1234567890", "aaaaaaaaaaaaaaaaaaa");
		String newLastName = "newName";
		String oldName = c.getLastName();
		c.setLastName(newLastName);
		assertNotEquals(c.getLastName(),oldName);
		//return !c.getLastName().equals(oldName);
	}
	
	@Test 
	public void testSetLastName2() {
		Contact c = new Contact("oldname", "aaaaaaa", "aaaaaaa", "1234567890", "aaaaaaaaaaaaaaaaaaa");
		String newLastName = "newName12345678901234567890";
		String oldName = c.getLastName();
		c.setLastName(newLastName);
		assertEquals(c.getLastName(),oldName);
		//return !c.getLastName().equals(oldName);
	}
	
	@Test
	public void testSetNumber() {
		Contact c = new Contact("oldname", "aaaaaaa", "aaaaaaa", "1234567890", "aaaaaaaaaaaaaaaaaaa");
		String newNumber = "0000000000";
		String oldNumber = c.getPhone();
		c.setPhone(newNumber);
		assertNotEquals(c.getPhone(),oldNumber);
		//return !c.getPhone().equals(oldNumber);
	}
	
	@Test
	public void testSetAddress() {
		Contact c = new Contact("oldname", "aaaaaaa", "aaaaaaa", "1234567890", "aaaaaaaaaaaaaaaaaaa");
		String newAddr = "newAddr";
		String oldAddr = c.getAddress();
		c.setAddress(newAddr);
		assertNotEquals(c.getAddress(),oldAddr);
		//return !c.getAddress().equals(oldAddr);
	}
	
	@Test
	public void testGetID() {
		Contact c = new Contact("0", "first", "last", "0000000000", "123 st");
		assertEquals(c.getID(),"0");
		//return c.getID().equals("0");
	}
	
	@Test
	public void testGetFirstName() {
		Contact c = new Contact("0", "first", "last", "0000000000", "123 st");
		assertEquals(c.getFirstName(), "first");
		//return c.getFirstName().equals("first");
	}
	
	@Test
	public void testGetLastName() {
		Contact c = new Contact("0", "first", "last", "0000000000", "123 st");
		assertEquals(c.getLastName(), "last");
		//return c.getLastName().equals("last");
	}
	
	@Test
	public void testGetAddress() {
		Contact c = new Contact("0", "first", "last", "0000000000", "123 st");
		assertEquals(c.getAddress(), "123 st");
		//return c.getAddress().equals("123 st");
	}
	
	@Test
	public void testGetPhone() {
		Contact c = new Contact("0", "first", "last", "0000000000", "123 st");
		assertEquals(c.getPhone(),"0000000000");
		//return c.getPhone().equals("0000000000");
	}
}
