package br.com.despachante_pbd.dao.despachante_pbd.dao;

import br.com.despachante_pbd.dao.despachante_pbd.ConectionFactory.Conection;
import br.com.despachante_pbd.dao.despachante_pbd.model.Contato;

import javax.persistence.EntityManager;
import java.util.List;

public class DaoContato implements IDaoContato {
    @Override
    public Contato salvar(Contato contato) {
        EntityManager em = new Conection().getEntityManager ();
        try{
            em.getTransaction ().begin ();
            if(contato.getId () == null) { // inserir
                em.persist(contato);
            }else{
                em.merge(contato);
            }
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }finally {
            em.close();
        }
        return contato;
    }

    @Override
    public Contato buscarId(Integer id) {
        EntityManager em = new Conection().getEntityManager ();

        Contato contato= null;
        try {
            contato = em.find (Contato.class,id);
        }catch (Exception e ){
            em.getTransaction ().rollback ();
        }finally {
            em.close ();
        }
        return contato;
    }

    @Override
    public List<Contato> buscarTodos() {
        return null;
    }

    @Override
    public Contato remover(Integer id) {
        EntityManager em = new Conection().getEntityManager ();

        Contato contato= null;
        try {
            contato = em.find (Contato.class,id);
            em.getTransaction().begin();
            em.remove(contato);
            em.getTransaction().commit();
        }catch (Exception e ){
            em.getTransaction ().rollback ();
        }finally {
            em.close ();
        }
        return contato;
    }
}
