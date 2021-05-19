package br.com.despachante_pbd.dao.despachante_pbd.business;

import br.com.despachante_pbd.dao.despachante_pbd.model.Endereco;

import java.util.List;

public interface IBusinessEndereco {

    public Endereco salvar(Endereco endereco);

    public Endereco buscarId(Integer id);

    public List<Endereco> buscarTodos();

    public Endereco remove(Integer id);
}
