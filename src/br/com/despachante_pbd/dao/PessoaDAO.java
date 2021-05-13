package br.com.despachante_pbd.dao;

import br.com.despachante_pbd.model.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PessoaDAO {
    private EntityManagerFactory emf; //Representação da instancia do banco de dados, só fecha quando o programa for fechar
    private EntityManager em; //Gerencia e Manipula o Banco de dados, se fecha ele, perde a Conexão

    public PessoaDAO() {
        this.emf = Persistence.createEntityManagerFactory("postgres");
    }

    public void persiste(Pessoa p) {
        try{
            this.em = this.emf.createEntityManager(); //instancia o EM
            em.getTransaction().begin(); // abrindo a conexão
            //regras de negócio de persistência aqui

            em.persist(p);
            em.getTransaction().commit(); // comando SALVAR
            System.out.println("Persistir deu certo");
        } catch (Exception e) {
            System.out.println("persistir: deu errado: " + e.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close(); // fechar a conexão
        }
    }

}
