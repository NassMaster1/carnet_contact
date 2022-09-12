package com.lip6.daos.DAOAdresse;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.lip6.entities.EntityAdresse.Adresse;
import com.lip6.util.JPAutile;
public class DAOAdresse implements IDAOAdresse {
	
		
		public void addAdresse( String street, String city,String zip,String Country) {

			//1: obtenir une connexion et un EntityManager, en passant par la classe JpaUtil
			EntityManager em=JPAutile.getEmf().createEntityManager();
			// 2 : Instanciation Objet métier
			Adresse adresse = new Adresse(street, city,zip,Country);
			// 3 : Ouverture transaction
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			// 4 : Persistance Objet/Relationnel : création d'un enregistrement en base
			em.persist(adresse);

			// 5 : Fermeture transaction
			tx.commit();
			// 6 : Fermeture de l'EntityManager et de unité de travail JPA
			em.close();
		}
	
	

}
