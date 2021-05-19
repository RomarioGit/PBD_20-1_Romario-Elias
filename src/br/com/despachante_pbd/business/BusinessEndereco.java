package br.com.despachante_pbd.business;

import br.com.despachante_pbd.dao.DaoEndereco;
import br.com.despachante_pbd.dao.IDaoEndereco;
import br.com.despachante_pbd.model.Endereco;

import java.util.List;

public class BusinessEndereco implements IBusinessEndereco {

    private IDaoEndereco daoEndereco;

    public BusinessEndereco() {
        this.daoEndereco = new DaoEndereco();
    }

    @Override
    public Endereco salvar(Endereco endereco) {
        return this.daoEndereco.salvar(endereco);
    }

    @Override
    public Endereco buscarId(Integer id) {
        return this.daoEndereco.buscarId(id);
    }

    @Override
    public List<Endereco> buscarTodos() {
        return this.daoEndereco.buscarTodos();
    }

    @Override
    public Endereco remove(Integer id) {
        return this.daoEndereco.remove(id);
    }
}
