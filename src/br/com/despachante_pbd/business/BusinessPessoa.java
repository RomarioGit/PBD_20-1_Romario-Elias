package br.com.despachante_pbd.business;

import br.com.despachante_pbd.dao.DaoPessoa;
import br.com.despachante_pbd.dao.IDaoPessoa;
import br.com.despachante_pbd.model.Pessoa;

import java.util.List;

public class BusinessPessoa implements IBusinessPessoa{
    private IDaoPessoa daoPessoa;

    public BusinessPessoa() {
        this.daoPessoa = new DaoPessoa();
    }

    @Override
    public Pessoa salvar(Pessoa pessoa) {
        return this.daoPessoa.salvar(pessoa);
    }

    @Override
    public Pessoa buscaId(Integer id) {
        return null;
    }

    @Override
    public List<Pessoa> buscaTodos() {
        return null;
    }
}
