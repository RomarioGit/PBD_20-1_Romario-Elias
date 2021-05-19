package br.com.despachante_pbd.dao.despachante_pbd.ConectionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConectionFactory {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory ("postgresql");

    private ConectionFactory(){
    }

    public static EntityManager getConnectionFactory(){
        return entityManagerFactory.createEntityManager ();
    }
}
