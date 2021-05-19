package br.com.despachante_pbd.dao;

import br.com.despachante_pbd.ConectionFactory.Conection;
import br.com.despachante_pbd.model.Funcionario;

import javax.persistence.EntityManager;
import java.util.List;

public class DaoFuncionario implements IDaoFuncionario{


    @Override
    public Funcionario salvar(Funcionario funcionario) {
        EntityManager em = new Conection().getEntityManager ();
        try {
            em.getTransaction().begin();
            if (funcionario.getId() == null){
                em.persist(funcionario);
            }
            else{
                em.merge(funcionario);
            }
            em.getTransaction().commit();
        } catch (Exception e){
            em.getTransaction().rollback();
        } finally {
            em.close();
        }return funcionario;
    }

    @Override
    public Funcionario buscarId(Integer id) {
        EntityManager em = new Conection().getEntityManager ();
        Funcionario funcionario = null;

        try {
            funcionario = em.find(Funcionario.class,id);
        }catch (Exception e){
            em.getTransaction().rollback();
        }finally {
            em.close();
        }
        return funcionario;
    }

    @Override
    public List<Funcionario> buscarTodos() {
        return null;
    }

    @Override
    public List<Funcionario> buscarTodosNome(String nome) {
        return null;
    }

    @Override
    public List<Funcionario> buscarTodosCpf(String cpf) {
        return null;
    }

    @Override
    public Funcionario remover(Integer id) {
        EntityManager em = new Conection().getEntityManager ();
        Funcionario funcionario = null;
        try {
            funcionario = em.find(Funcionario.class,id);
            em.getTransaction().begin();
            em.remove(funcionario);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }finally {
            em.close();
        }
        return funcionario;
    }
}
