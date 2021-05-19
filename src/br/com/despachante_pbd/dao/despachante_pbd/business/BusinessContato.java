package br.com.despachante_pbd.dao.despachante_pbd.business;

import br.com.despachante_pbd.dao.despachante_pbd.dao.DaoContato;
import br.com.despachante_pbd.dao.despachante_pbd.dao.IDaoContato;
import br.com.despachante_pbd.dao.despachante_pbd.model.Contato;

import java.util.List;

public class BusinessContato implements IBusinessContato {

    private IDaoContato daoContato;

    public BusinessContato() {
        this.daoContato = new DaoContato();
    }

    @Override
    public Contato salvar(Contato contato) {
        return this.daoContato.salvar(contato);
    }

    @Override
    public Contato buscarId(Integer id) {
        return this.daoContato.buscarId(id);
    }

    @Override
    public List<Contato> buscarTodos() {
        return this.daoContato.buscarTodos();
    }

    @Override
    public Contato remover(Integer id) {
        return this.daoContato.remover(id);
    }
}
