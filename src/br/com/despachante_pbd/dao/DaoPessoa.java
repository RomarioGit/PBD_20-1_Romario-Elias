package br.com.despachante_pbd.dao;

import br.com.despachante_pbd.ConectionFactory.Conection;
import br.com.despachante_pbd.model.Pessoa;

import javax.persistence.EntityManager;
import java.util.List;

public class DaoPessoa implements IDaoPessoa {


    @Override
    public Pessoa salvar(Pessoa pessoa) {
        EntityManager em = new Conection().getEntityManager ();

        try{
            em.getTransaction().begin();
            if (pessoa.getId() == null){
                em.persist(pessoa);
            }else {
                em.merge(pessoa);
            }
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }finally {
            em.close();
        }
        return pessoa;
    }

    @Override
    public Pessoa buscaId(Integer id) {
        return null;
    }

    @Override
    public List<Pessoa> buscaTodos() {
        return null;
    }
}
