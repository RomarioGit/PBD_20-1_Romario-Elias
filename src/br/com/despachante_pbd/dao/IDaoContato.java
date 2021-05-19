package br.com.despachante_pbd.dao;

import br.com.despachante_pbd.model.Contato;

import java.util.List;

public interface IDaoContato {
    public Contato salvar(Contato contato);
    public Contato buscarId(Integer id);
    public List<Contato> buscarTodos();
    public Contato remover(Integer id);
}
