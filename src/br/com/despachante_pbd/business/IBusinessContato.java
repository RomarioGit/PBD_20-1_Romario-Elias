package br.com.despachante_pbd.business;

import br.com.despachante_pbd.model.Contato;

import java.util.List;

public interface IBusinessContato {

    public Contato salvar(Contato contato);
    public Contato buscarId(Integer id);
    public List<Contato> buscarTodos();
    public Contato remover(Integer id);
}
