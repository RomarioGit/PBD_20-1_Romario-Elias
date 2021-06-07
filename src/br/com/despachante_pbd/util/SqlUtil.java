package br.com.despachante_pbd.util;

public class SqlUtil {

    public static final String BUSCAR_LOGIN_SENHA = "select u from Usuario u where u.login = :login and u.senha = :senha";

}
