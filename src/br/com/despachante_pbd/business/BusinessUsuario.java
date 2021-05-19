package br.com.despachante_pbd.business;

import br.com.despachante_pbd.dao.DaoUsuario;
import br.com.despachante_pbd.dao.IDaoUsuario;
import br.com.despachante_pbd.model.Usuario;

public class BusinessUsuario implements IBusinessUsuario {

    private IDaoUsuario daoUsuario;

    public BusinessUsuario() {
        this.daoUsuario = new DaoUsuario();
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        return this.daoUsuario.salvar(usuario);
    }

    @Override
    public Usuario buscarId(Integer id) {
        return this.buscarId(id);
    }

    @Override
    public Usuario remover(Integer id) {
        return this.remover(id);
    }

    @Override
    public Usuario validaLogin(String login, String senha) {
        return this.daoUsuario.validaLogin(login, senha);
    }
}
