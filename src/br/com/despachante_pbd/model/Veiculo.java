package br.com.despachante_pbd.model;

import javax.persistence.*;

@Entity
@Table(name = "veiculo")
public class Veiculo {

    @Id
    @GeneratedValue
    private Integer id;

    @Column (nullable = false, length = 11)
    private String numDoc;

    @Column (nullable = false, length = 17)
    private String numChassi;

    @Column (nullable = false, length = 17)
    private String placa;

    public Veiculo(){}

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(String numChassi) {
        this.numChassi = numChassi;
    }

    public String getPlaca() {
        return placa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
