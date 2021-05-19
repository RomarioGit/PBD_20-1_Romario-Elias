package br.com.despachante_pbd.dao.despachante_pbd.dao;

import br.com.despachante_pbd.dao.despachante_pbd.model.Pessoa;

import java.util.List;

public interface IDaoPessoa {

    public Pessoa salvar(Pessoa pessoa);
    public Pessoa buscaId(Integer id);
    public List<Pessoa> buscaTodos();
}
