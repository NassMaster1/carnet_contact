package com.lip6.services.ServiceContact;

import java.util.ArrayList;


import com.lip6.daos.DAOContacts.DAOContact;
import com.lip6.daos.DAOContacts.IDAOContact;
import com.lip6.entities.EntityContact.Contact;

public class ServiceSearchContact {
	
	public void getcontacts() {
		
		IDAOContact daoc=new DAOContact();
		ArrayList<Contact> contacts=daoc.getContacts();
		
		
		
		contacts.forEach(contact->System.out.println(contact));
	}

}
