package br.com.despachante_pbd.dao.despachante_pbd.business;

import br.com.despachante_pbd.dao.despachante_pbd.model.Funcionario;

import java.util.List;

public interface IBusinessFuncionario {
    public Funcionario salvar(Funcionario funcionario);

    public Funcionario buscarId(Integer id);

    public List<Funcionario> buscarTodos();

    public List<Funcionario> buscarTodosNome(String nome);

    public List<Funcionario> buscarTodosCpf(String cpf);

    public Funcionario remover(Integer id);
}
