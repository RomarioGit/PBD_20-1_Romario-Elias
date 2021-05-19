package br.com.despachante_pbd.facade;

import br.com.despachante_pbd.business.*;
import br.com.despachante_pbd.model.*;

import java.util.List;

public class Facade implements IFacade {

    private IBusinessFuncionario businessFuncionario;
    private IBusinessUsuario businessUsuario;
    private IBusinessEndereco businessEndereco;
    private IBusinessContato businessContato;
    private IBusinessPessoa businessPessoa;

    public Facade() {
        this.businessFuncionario = new BusinessFuncionario();
        this.businessUsuario = new BusinessUsuario();
        this.businessEndereco = new BusinessEndereco();
        this.businessContato = new BusinessContato();
        this.businessPessoa = new BusinessPessoa();
    }

    private static Facade instance;

    public static Facade getInstance(){

        if(instance == null){
            instance = new Facade();
        }return instance;
    }
    //Pessoa
    @Override
    public Pessoa salvarPessoa(Pessoa pessoa) {
        return this.businessPessoa.salvar(pessoa);
    }

    //Funcionario
    @Override
    public Funcionario salvarFuncionario(Funcionario funcionario) {
        return this.businessFuncionario.salvar(funcionario);
    }

    @Override
    public Funcionario buscarIdFuncionario(Integer id) {
        return this.businessFuncionario.buscarId(id);
    }

    @Override
    public List<Funcionario> buscarTodosFuncionario() {
        return this.businessFuncionario.buscarTodos();
    }

    @Override
    public List<Funcionario> buscarTodosNomeFuncionario(String nome) {
        return this.businessFuncionario.buscarTodosNome(nome);
    }

    @Override
    public List<Funcionario> buscarTodosCpfFuncionario(String cpf) {
        return this.businessFuncionario.buscarTodosCpf(cpf);
    }

    @Override
    public Funcionario removerFuncionario(Integer id) {
        return this.businessFuncionario.remover(id);
    }

    //Usuario
    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return this.businessUsuario.salvar(usuario);
    }

    @Override
    public Usuario buscarIdUsuario(Integer id) {
        return this.businessUsuario.buscarId(id);
    }

    @Override
    public Usuario removerUsuario(Integer id) {
        return this.businessUsuario.remover(id);
    }

    @Override
    public Usuario validaLoginUsuario(String login, String senha) {
        return this.businessUsuario.validaLogin(login, senha);
    }

    //Endereco
    @Override
    public Endereco salvarEndereco(Endereco endereco) {
        return this.businessEndereco.salvar(endereco);
    }

    @Override
    public Endereco buscarIdEndereco(Integer id) {
        return this.businessEndereco.buscarId(id);
    }

    @Override
    public List<Endereco> buscarTodosEndereco() {
        return this.businessEndereco.buscarTodos();
    }

    @Override
    public Endereco removerEndereco(Integer id) {
        return businessEndereco.remove(id);
    }

    //Contato
    @Override
    public Contato salvarContato(Contato contato) {
        return this.businessContato.salvar(contato);
    }

    @Override
    public Contato buscarIdContato(Integer id) {
        return this.businessContato.buscarId(id);
    }

    @Override
    public List<Contato> buscarTodosContato() {
        return this.businessContato.buscarTodos();
    }

    @Override
    public Contato removerContato(Integer id) {
        return this.businessContato.remover(id);
    }
}
