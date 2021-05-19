package br.com.despachante_pbd.model;

import javax.persistence.*;

@Entity
@Table(name = "funcionario")
//@SequenceGenerator(name = Pessoa.SEQUENCE_PESSOA,sequenceName = Funcionario.SEQUENCE_FUNCIONARIO, initialValue = 1, allocationSize = 1)
public class Funcionario{

    @Id
    @GeneratedValue
    private Integer id;

    @Column (nullable = false, length = 150)
    private String nome;

    @Column (nullable = false)
    private String setor;

    @Column (nullable = false)
    private String func;

    @Column
    private boolean status;

    @OneToOne (cascade = CascadeType.ALL)
    private Usuario usuario;

    @OneToOne (cascade = CascadeType.ALL)
    private Contato contato;

    @OneToOne (cascade = CascadeType.ALL)
    private Endereco endereco;

    @OneToOne (cascade = CascadeType.ALL)
    private Pessoa pessoa;


    public Funcionario (){

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                ", nome='" + nome + '\'' +
                ", setor='" + setor + '\'' +
                ", func='" + func + '\'' +
                ", status=" + status +
                ", usuario=" + usuario +
                '}';
    }
}
