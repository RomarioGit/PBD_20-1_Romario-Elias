package br.com.despachante_pbd.model;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)

public  class Pessoa {
    @Id
    @GeneratedValue (generator = "incremento")
    @GenericGenerator(name = "incremento",strategy = "increment")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)

    private Integer id;
    private int cpf;

    public Pessoa() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
