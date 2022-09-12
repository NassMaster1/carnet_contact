package com.lip6.services.ServiceContact;

import com.lip6.daos.DAOContacts.DAOContact;
import com.lip6.daos.DAOContacts.IDAOContact;

public class ServiceContact {
	
	public void createContact( String fname, String lname, String email) {
		
		IDAOContact daoc=new DAOContact();
	   daoc.addContact(fname, lname, email);
		
	}

}
