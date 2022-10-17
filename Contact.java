
public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String addr;
	
	public Contact(String id, String fname, String lname, String phoneNum, String address) {
		setID(id);
		setFirstName(fname);
		setLastName(lname);
		setPhone(phoneNum);
		setAddress(address); 
	}
	
	//public boolean equals(Object anObject) {
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Contact) {
			if (((Contact) obj).getID().equals(contactID))
				return true;
			else
				return false;
		}
		else if (obj instanceof String) {
			if (((String) obj).equals(contactID))
				return true;
			else
				return false;
		}
		else {
			return false;
		}
				
	}
	
	public String getID(){
		return contactID;
	}
	
	private void setID(String newID) {
		if (newID.length() <= 10)
			contactID = newID;

	}
	
	public void setFirstName(String name) {
		if (name.length() <= 10) 
			firstName = name;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String name) {
		if (name.length() <= 10) 
			lastName = name;
		
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhone(String pNum) {
		if (pNum.length() == 10)
			phone = pNum;
		
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setAddress(String newAddr) {
		if (newAddr.length() <= 30) {
			addr = newAddr;
		}
	}
	
	public String getAddress() {
		return addr;
	}
}
