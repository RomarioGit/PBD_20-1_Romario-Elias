package br.com.despachante_pbd.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "atendimento")
public class Atendimento {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false, length = 20)
    private String situacao;

    @Column
    private boolean status;

    @Column(nullable = false, length = 20)
    private String tipo_Pg;

    @Column
    private LocalDate data_Ate;
    @Column
    private LocalDate data_Pg;

    @OneToOne (cascade = CascadeType.ALL)
    private Cliente cliente;

    @OneToOne (cascade = CascadeType.ALL)
    private Usuario usuario;

    @ManyToOne
    private Servicos servicos;

    public Atendimento(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTipo_Pg() {
        return tipo_Pg;
    }

    public void setTipo_Pg(String tipo_Pg) {
        this.tipo_Pg = tipo_Pg;
    }

    public LocalDate getData_Ate() {
        return data_Ate;
    }

    public void setData_Ate(LocalDate data_Ate) {
        this.data_Ate = data_Ate;
    }

    public LocalDate getData_Pg() {
        return data_Pg;
    }

    public void setData_Pg(LocalDate data_Pg) {
        this.data_Pg = data_Pg;
    }
}
