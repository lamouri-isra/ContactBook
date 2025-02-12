package lamouri.Isra;
import java.util.ArrayList;
import java.util.List;
public class ContactBook implements Manageable {
	 private String ownerName;
	    private List<Contact> contacts;
        
	    public ContactBook(String ownerName) {
	        this.ownerName = ownerName;
	        this.contacts = new ArrayList<>();
	    }

	    public void add(Contact contact) {
	        contacts.add(contact);
	    }
	    
	    public boolean remove(String name) {
	        Contact contact = search(name);
	        if (contact != null) {
	            contacts.remove(contact);
	            return true;
	        }
	        return false;
	    }
	    
	    public Contact search(String name) {
	        for (Contact contact : contacts) {
	            if (contact.name.equals(name)) {
	                return contact;
	            }
	        }
	        return null;
	    }

	    public boolean shareContact(String name, ContactBook targetContactBook) {
	        Contact contact = search(name);
	        if (contact != null) {
	            targetContactBook.add(contact.copy());
	            return true;
	        }
	        return false;
	    }

	    public void displayAllContacts() {
	        System.out.println("Contacts in " + ownerName + "'s Contact Book:");
	        int temp = 1;
	        for (Contact contact : contacts) {
	        	System.out.print(temp+"/");
	        	contact.displayDetails();
	        	temp+=1;
	        }
       }

}
