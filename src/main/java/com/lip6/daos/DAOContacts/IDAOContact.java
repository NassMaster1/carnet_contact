package com.lip6.daos.DAOContacts;

import java.util.ArrayList;


import com.lip6.entities.EntityContact.Contact;

public interface IDAOContact {

	
	public void addContact( String firstname, String lastname, String email);
	
	public int deleteContact(long id);
	
	public Contact getContact(long id);
	
	public boolean modifyContact(long id, String firstname, String lastname, String email);
	
	public ArrayList<Contact> getContactByFirstName(String firstname);
	
	public ArrayList<Contact> getContactByLastName(String lastname);
	
	public ArrayList<Contact> getContactByEmail(String email);

	public ArrayList<Contact> getContacts();

	



	
}
