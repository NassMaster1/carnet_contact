package com.lip6.services.ServicePhoneNumber;

import com.lip6.daos.DAOContacts.DAOContact;
import com.lip6.daos.DAOContacts.IDAOContact;
import com.lip6.daos.DAOPhoneNumber.DAOPhoneNumber;
import com.lip6.daos.DAOPhoneNumber.IDAOPhoneNumber;

public class ServicePhoneNumber {

	public void createPhoneNumber( String phoneKind, String PhoneNumber) {
		
		IDAOPhoneNumber daoc=new DAOPhoneNumber();
	   daoc.addPhoneNumber(phoneKind, PhoneNumber);
		
	}
}
