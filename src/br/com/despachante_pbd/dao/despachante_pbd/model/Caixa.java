package br.com.despachante_pbd.dao.despachante_pbd.model;

public class Caixa {

    private Integer id;
    private double receita;
    private double despesa;
    private double valor_Total;
    //private String balanc_Dia;

    public Caixa(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }

    public double getDespesa() {
        return despesa;
    }

    public void setDespesa(double despesa) {
        this.despesa = despesa;
    }

    public double getValor_Total() {
        return valor_Total;
    }

    public void setValor_Total(double valor_Total) {
        this.valor_Total = valor_Total;
    }
}
