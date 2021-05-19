package br.com.despachante_pbd.dao.despachante_pbd.facade;

import br.com.despachante_pbd.dao.despachante_pbd.model.*;

import java.util.List;

public interface IFacade {

    //Pessoa
    public Pessoa salvarPessoa(Pessoa pessoa);


    //Funcionario
    public Funcionario salvarFuncionario(Funcionario funcionario);
    public Funcionario buscarIdFuncionario(Integer id);
    public List<Funcionario> buscarTodosFuncionario();
    public List<Funcionario> buscarTodosNomeFuncionario (String nome);
    public List<Funcionario> buscarTodosCpfFuncionario(String cpf);
    public Funcionario removerFuncionario(Integer id);

    //Usuario
    public Usuario salvarUsuario(Usuario usuario);
    public Usuario buscarIdUsuario(Integer id);
    public Usuario removerUsuario(Integer id);
    public Usuario validaLoginUsuario(String login, String senha);

    //Endereco
    public Endereco salvarEndereco(Endereco endereco);
    public Endereco buscarIdEndereco(Integer id);
    public List<Endereco> buscarTodosEndereco();
    public Endereco removerEndereco(Integer id);

    //Contato
    public Contato salvarContato(Contato contato);
    public Contato buscarIdContato(Integer id);
    public List<Contato> buscarTodosContato();
    public Contato removerContato(Integer id);
}
