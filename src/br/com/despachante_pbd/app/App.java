package br.com.despachante_pbd.app;

import br.com.despachante_pbd.dao.PessoaDAO;
import br.com.despachante_pbd.model.Pessoa;

public class App {
    public static void main(String[] args) {
        System.out.println("Teste BD");
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("12191933483");
        System.out.println("Instanciou pessoa");
        PessoaDAO dao = new PessoaDAO();
        System.out.println("Instanciou dao");
        dao.persiste(pessoa);
        System.out.println("-----> " + pessoa.toString());


    }
}
