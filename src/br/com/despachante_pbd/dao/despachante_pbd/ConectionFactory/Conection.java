package br.com.despachante_pbd.dao.despachante_pbd.ConectionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class Conection {

    private EntityManagerFactory enf;


    public Conection(){

    }

    public EntityManager getEntityManager() throws PersistenceException {
        this.enf = Persistence.createEntityManagerFactory ("postgresql");
        return this.enf.createEntityManager ();
    }
}
