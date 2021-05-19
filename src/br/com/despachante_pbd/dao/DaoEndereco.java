package br.com.despachante_pbd.dao;

import br.com.despachante_pbd.ConectionFactory.Conection;
import br.com.despachante_pbd.model.Endereco;

import javax.persistence.EntityManager;
import java.util.List;

public class DaoEndereco implements IDaoEndereco{

    @Override
    public Endereco salvar(Endereco endereco) {
        EntityManager em = new Conection().getEntityManager ();

        try {
            em.getTransaction ().begin ();

            if(endereco.getId () == null){
                em.persist(endereco);
            }else {
                em.merge (endereco);
            }
            em.getTransaction ( ).commit ();
        }catch (Exception e ){
            em.getTransaction ().rollback ();
        }finally {
            em.close ();
        }
        return endereco;
    }

    @Override
    public Endereco buscarId(Integer id) {
        EntityManager em = new Conection().getEntityManager ();

        Endereco endereco = null;

        try {
            endereco = em.find (Endereco.class,id);
        }catch (Exception e ){
            em.getTransaction ().rollback ();
        }finally {
            em.close ();
        }
        return endereco;
    }

    @Override
    public List<Endereco> buscarTodos() {
        return null;
    }

    @Override
    public Endereco remove(Integer id) {
        EntityManager em = new Conection().getEntityManager ();
        Endereco endereco = null;
        try {
            endereco = em.find (Endereco.class, id);
            em.getTransaction ().begin ();
            em.remove (endereco);
            em.getTransaction ().commit ();
        }catch (Exception e ){
            em.getTransaction ().rollback ();
        }finally {
            em.close ();
        }
        return endereco;
    }
}
