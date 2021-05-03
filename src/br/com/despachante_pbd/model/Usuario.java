package br.com.despachante_pbd.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@SequenceGenerator(name = Funcionario.SEQUENCE_PESSOA, sequenceName = Usuario.SEQUENCE_USUARIO, initialValue = 1, allocationSize = 1)
//Rever a linha acima !!!!!
public class Usuario extends Funcionario {

    protected static final String SEQUENCE_USUARIO = "usuario_sequence";
    @Id
    private Integer id;

    @Column(nullable = false, length = 50)
    private String login;

    @Column(nullable = false, length = 15)
    private String senha;

    public Usuario (){

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
