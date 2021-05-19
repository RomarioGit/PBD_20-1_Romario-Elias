package br.com.despachante_pbd.dao.despachante_pbd.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "usuario")
public class Usuario{

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false, length = 50)
    private String login;

    @Column(nullable = false, length = 15)
    private String senha;

    public Usuario (){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
