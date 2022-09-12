package com.lip6.daos.DAOPhoneNumber;

import javax.persistence.EntityManager;


import javax.persistence.EntityTransaction;

import com.lip6.entities.EntityPhoneNumber.PhoneNumber;
import com.lip6.util.JPAutile;

public class DAOPhoneNumber implements IDAOPhoneNumber {
	
	public void addPhoneNumber( String phoneKind, String phoneNumber) {

		//1: obtenir une connexion et un EntityManager, en passant par la classe JpaUtil
		EntityManager em=JPAutile.getEmf().createEntityManager();
		// 2 : Instanciation Objet métier
		PhoneNumber phone = new PhoneNumber(phoneKind, phoneNumber);
		// 3 : Ouverture transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		// 4 : Persistance Objet/Relationnel : création d'un enregistrement en base
		em.persist(phone);

		// 5 : Fermeture transaction
		tx.commit();
		// 6 : Fermeture de l'EntityManager et de unité de travail JPA
		em.close();

	}

}
