package com.lip6.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAutile {
	   /** 
     * Singleton de l’EntityManagerFactory de l’application 
     */ 
    private static EntityManagerFactory emf = null; 
 
    /** 
     * Permet de récupérer l’EntityManagerFactory de  
     * l’application tout en le créant s’il n’existe pas 
     *  
     * @return l’EntityManagerFactory unique de l’application 
     */ 
    public static EntityManagerFactory getEmf() { 
        if(emf == null){ 
            emf = Persistence.createEntityManagerFactory("projetJPA"); 
        } 
        return emf; 
    } 
 
    /** 
     * Libère les ressources et détruit l’EntityManagerFactory 
     * si jamais il faut le recréer. 
     */ 
    public static void close(){ 
        if(emf!=null){ 
            emf.close(); 
            emf=null; 
        } 
    } 

}
