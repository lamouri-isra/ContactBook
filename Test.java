package lamouri.Isra;

import java.util.Scanner;

public class Test {
	  public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        ContactBook book1 = new ContactBook("isra");
	        
	        String Name ;String phone;	String email;
     	  
	       
	        int i=1;
			while(i==1) {
	        System.out.println("**************** THE OPTION IS ************** ");
	          System.out.println("1/ ADD  BUSINESS CONTACT");
	          System.out.println("2/ ADD  PERSONAL CONTACT");
	          System.out.println("3/ REMOVE CONTACT");
	          System.out.println("4/ SEARCH CONTACT");
	          System.out.println("5/ DISPLAY CONTACT");
	          System.out.println("6/ EXIT");
	          System.out.println("enter your option");
               int choice = in.nextInt();
               in.nextLine();
              
               switch(choice) {
               case 1 :
            	   System.out.println("enter your name ");
             	    Name = in.nextLine();
             	   System.out.println("enter your phone number ");
             	    phone = in.nextLine();
             	   	System.out.println("enter your email ");
             	   	 email = in.nextLine();
            	   	System.out.println("enter your company name ");
            	   	String company = in.nextLine();
            	   	System.out.println("enter your job title ");
            	   	String job = in.nextLine();
            	   	book1.add(new BusinessContact(Name,phone,email,company, job));
           	   	 System.out.println("---------------------------------------------------------------");

	            break;
               case 2 :
            	   System.out.println("enter your name ");
             	    Name = in.nextLine();
             	   System.out.println("enter your phone number ");
             	    phone = in.nextLine();
             	   	System.out.println("enter your email ");
             	   	 email = in.nextLine();
            	    System.out.println("enter your relationShip ");
             	   String relation = in.nextLine();
            	   	 book1.add(new PersonalContact(Name,phone,email, relation));
            	   	 System.out.println("---------------------------------------------------------------");
            	   	 break;
               case 3 :
            	   
            	   System.out.println("enter your name ");
            	    Name = in.nextLine();
            	   boolean removed = book1.remove(Name);
            	   if (removed == true) {
            		   System.out.println("Contact is removed");  
            	   }else {
            		   System.out.println("Contact is not removed");
            	   }
       	        
       	        break;
               case 4 :
            	   System.out.println("enter your name ");
            	   Name = in.nextLine();
            	   Contact foundContact = book1.search(Name);
       	        if (foundContact != null) {
       	            System.out.println("Found contact:");
       	        
       	            foundContact.displayDetails();
       	        } else {
       	            System.out.println("Contact not found.");
       	        }
       	         break;
               case 5 :
            	book1.displayAllContacts();
       	       
       	        break ;
               case 6 :
            	   System.out.println("EXIT");
            	   i=0;
               }
			}
	    }
}
