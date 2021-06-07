package br.com.despachante_pbd.dao;

import br.com.despachante_pbd.ConectionFactory.Conection;
import br.com.despachante_pbd.model.Usuario;
import br.com.despachante_pbd.util.SqlUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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
        EntityManager em = new Conection().getEntityManager ();

        try {
            TypedQuery<Usuario> query = em.createQuery (SqlUtil.BUSCAR_LOGIN_SENHA, Usuario.class);
            query.setParameter("login", login);
            query.setParameter("senha", senha);
            return query.getSingleResult();
        }catch (Exception e ){
            e.printStackTrace();
            System.err.println(e.getMessage());
            return null;
        }
    }
}
