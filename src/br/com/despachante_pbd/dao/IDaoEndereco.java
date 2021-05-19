package br.com.despachante_pbd.dao;

import br.com.despachante_pbd.model.Endereco;

import java.util.List;

public interface IDaoEndereco {

    public Endereco salvar(Endereco endereco);

    public Endereco buscarId(Integer id);

    public List<Endereco> buscarTodos();

    public Endereco remove(Integer id);
}
