package br.com.despachante_pbd.business;

import br.com.despachante_pbd.dao.DaoFuncionario;
import br.com.despachante_pbd.dao.IDaoFuncionario;
import br.com.despachante_pbd.model.Funcionario;

import java.util.List;

public class BusinessFuncionario implements IBusinessFuncionario {

    private IDaoFuncionario daoFuncionario;

    public BusinessFuncionario() {
        this.daoFuncionario = new DaoFuncionario();
    }


    @Override
    public Funcionario salvar(Funcionario funcionario) {
        return this.daoFuncionario.salvar(funcionario);
    }

    @Override
    public Funcionario buscarId(Integer id) {
        return this.daoFuncionario.buscarId(id);
    }

    @Override
    public List<Funcionario> buscarTodos() {
        return this.daoFuncionario.buscarTodos();
    }

    @Override
    public List<Funcionario> buscarTodosNome(String nome) {
        return this.daoFuncionario.buscarTodosNome(nome);
    }

    @Override
    public List<Funcionario> buscarTodosCpf(String cpf) {
        return this.daoFuncionario.buscarTodosCpf(cpf);
    }

    @Override
    public Funcionario remover(Integer id) {
        return this.daoFuncionario.remover(id);
    }
}
