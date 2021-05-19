package br.com.despachante_pbd.business;

import br.com.despachante_pbd.model.Pessoa;

import java.util.List;

public interface IBusinessPessoa {

    public Pessoa salvar(Pessoa pessoa);
    public Pessoa buscaId(Integer id);
    public List<Pessoa> buscaTodos();
}
