package br.com.despachante_pbd.business;

import br.com.despachante_pbd.model.Usuario;

public interface IBusinessUsuario {

    public Usuario salvar(Usuario usuario);

    public Usuario buscarId(Integer id);

    public Usuario remover(Integer id);

    public Usuario validaLogin(String login, String senha);
}
