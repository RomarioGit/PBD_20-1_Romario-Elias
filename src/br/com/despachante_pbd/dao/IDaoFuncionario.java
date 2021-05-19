package br.com.despachante_pbd.dao;

import br.com.despachante_pbd.model.Funcionario;

import java.util.List;

public interface IDaoFuncionario {

    public Funcionario salvar(Funcionario funcionario);

    public Funcionario buscarId(Integer id);

    public List<Funcionario> buscarTodos();

    public List<Funcionario> buscarTodosNome (String nome);

    public List<Funcionario> buscarTodosCpf(String cpf);

    public Funcionario remover(Integer id);
}
