package com.lip6.services.ServiceAdresse;

import com.lip6.daos.DAOAdresse.DAOAdresse;
import com.lip6.daos.DAOAdresse.IDAOAdresse;

public class ServiceAdresse {

	public void addAdresse(String street, String city,String zip,String Country) {
		
	IDAOAdresse adresse=new DAOAdresse();
	
	adresse.addAdresse(street, city, zip, Country);
	}
}
