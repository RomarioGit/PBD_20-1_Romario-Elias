package br.com.despachante_pbd.model;

import javax.persistence.*;

@Entity
@Table(name = "funcionario")
@PrimaryKeyJoinColumn(name = "pessoa_id")
//@SequenceGenerator(name = Pessoa.SEQUENCE_PESSOA,sequenceName = Funcionario.SEQUENCE_FUNCIONARIO, initialValue = 1, allocationSize = 1)
public class Funcionario extends Pessoa {
    protected static final String SEQUENCE_FUNCIONARIO = "funcionario_sequence";

    @Id
    private Integer id;

    @Column (nullable = false, length = 150)
    private String nome;

    @Column (nullable = false)
    private String setor;

    @Column (nullable = false)
    private String func;

    @Column
    private boolean status;

    @OneToMany
    private Usuario usuario;

    @OneToOne (cascade = CascadeType.ALL)
    private Contato contato;

    @OneToOne (cascade = CascadeType.ALL)
    private Endereco endereco;

    public Funcionario (){

    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
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
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", setor='" + setor + '\'' +
                ", func='" + func + '\'' +
                ", status=" + status +
                ", usuario=" + usuario +
                '}';
    }
}
