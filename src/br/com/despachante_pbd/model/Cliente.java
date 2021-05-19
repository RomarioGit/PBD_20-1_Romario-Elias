package br.com.despachante_pbd.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column
    private int limite_Ate;

    @Column
    private LocalDate data_Nasc;

    @Column
    private int cnh;

    @OneToOne(cascade = CascadeType.ALL)
    private Contato contato;

    @OneToOne (cascade = CascadeType.ALL)
    private Endereco endereco;

    @OneToOne (cascade = CascadeType.ALL)
    private Pessoa pessoa;

    public Cliente(){}

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

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public int getLimite_Ate() {
        return limite_Ate;
    }

    public void setLimite_Ate(int limite_Ate) {
        this.limite_Ate = limite_Ate;
    }

    public LocalDate getData_Nasc() {
        return data_Nasc;
    }

    public void setData_Nasc(LocalDate data_Nasc) {
        this.data_Nasc = data_Nasc;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", limite_Ate=" + limite_Ate +
                ", data_Nasc=" + data_Nasc +
                '}';
    }
}
