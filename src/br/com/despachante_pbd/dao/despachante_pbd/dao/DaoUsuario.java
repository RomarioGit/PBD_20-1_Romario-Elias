package br.com.despachante_pbd.dao.despachante_pbd.dao;

import br.com.despachante_pbd.dao.despachante_pbd.ConectionFactory.Conection;
import br.com.despachante_pbd.dao.despachante_pbd.model.Usuario;

import javax.persistence.EntityManager;

public class DaoUsuario implements IDaoUsuario {

    @Override
    public Usuario salvar(Usuario usuario) {
        EntityManager em = new Conection().getEntityManager();

        try {
            em.getTransaction().begin();
            if (usuario.getId() == null) {
                em.persist(usuario);
            } else {
                em.merge(usuario);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return usuario;
    }

    @Override
    public Usuario buscarId(Integer id) {
        EntityManager em = new Conection().getEntityManager();
        Usuario usuario = null;

        try {
            usuario = em.find(Usuario.class, id);
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return usuario;
    }

    @Override
    public Usuario remover(Integer id) {
        EntityManager em = new Conection().getEntityManager();
        Usuario usuario = null;

        try {
            usuario = em.find(Usuario.class, id);
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return usuario;
    }

    @Override
    public Usuario validaLogin(String login, String senha) {

        EntityManager em = new Conection().getEntityManager();
        Usuario usuario = null;
        try {
            usuario = (Usuario) em
                    .createQuery("select u from Usuario u where login = :login and senha = :senha")
                    .setParameter("login", login).setParameter("senha", senha).getSingleResult();

        } catch (Exception e) {
            return null;
        } return usuario;
    }

    /*@Override
    public Usuario validaLogin(String login) {

        EntityManager em = new Conection().getEntityManager ();
        Usuario usuario = null;
        try{
            usuario = em.find(Usuario.class, login);
            if(login.equalsIgnoreCase(usuario.getLogin())){
                return usuario;
            }
        }catch (Exception e){
            em.getTransaction().rollback();
        }finally {
            em.close();
        }return usuario ;
    }*/
}
