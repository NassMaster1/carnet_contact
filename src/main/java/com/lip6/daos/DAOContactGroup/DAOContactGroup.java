package com.lip6.daos.DAOContactGroup;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.lip6.entities.EntityContact.Contact;
import com.lip6.entities.EntityContactGroup.ContactGroup;
import com.lip6.util.JPAutile;

public class DAOContactGroup implements IDAOContactGroup {

	@Override
	public void addContactGroup(String groupName) {
		
		//1: obtenir une connexion et un EntityManager, en passant par la classe JpaUtil
				EntityManager em=JPAutile.getEmf().createEntityManager();
				// 2 : Instanciation Objet métier
				ContactGroup contactGroup = new ContactGroup(groupName);
				// 3 : Ouverture transaction
				EntityTransaction tx = em.getTransaction();
				tx.begin();
				// 4 : Persistance Objet/Relationnel : création d'un enregistrement en base
				em.persist(contactGroup);
			
				
				// 5 : Fermeture transaction
				tx.commit();
				// 6 : Fermeture de l'EntityManager et de unité de travail JPA
				em.close();
		
	}

}
