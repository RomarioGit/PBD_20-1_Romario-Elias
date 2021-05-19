package br.com.despachante_pbd.dao.despachante_pbd.dao;

import br.com.despachante_pbd.dao.despachante_pbd.model.Usuario;

public interface IDaoUsuario {

    public Usuario salvar(Usuario usuario);

    public Usuario buscarId(Integer id);

    public Usuario remover(Integer id);

    public Usuario validaLogin(String login, String senha);


}
