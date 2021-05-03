package br.com.despachante_pbd.model;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
//@SequenceGenerator(sequenceName = "pessoa_sequence", name = "pessoa", initialValue = 1, allocationSize = 1)
public abstract  class Pessoa implements Serializable {
    protected static final String SEQUENCE_PESSOA = "pessoa_sequence";

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = SEQUENCE_PESSOA) //Gera IDs diferentes para cada tabela, não interfere em outras tarefas
    @GenericGenerator(name = "incremento",strategy = "increment")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private Integer id;

    @Column(length = 11)
    private String cpf;

    public Pessoa() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return cpf == pessoa.cpf && Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpf);
    }

    public Pessoa(String cpf) {
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
