package br.com.despachante_pbd.dao.despachante_pbd.app;

import br.com.despachante_pbd.dao.despachante_pbd.facade.Facade;
import br.com.despachante_pbd.dao.despachante_pbd.facade.IFacade;
import br.com.despachante_pbd.dao.despachante_pbd.model.Funcionario;
import br.com.despachante_pbd.dao.despachante_pbd.model.Pessoa;
import br.com.despachante_pbd.dao.despachante_pbd.model.Usuario;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;

public class App extends Application {

    public static final String LOGIN = "/br/com/despachante_pbd/view/Login.fxml";
    public static final String HOME = "/br/com/despachante_pbd/view/Home.fxml";
    public static final String FUNCIONARIO = "/br/com/despachante_pbd/view/Funcionario.fxml";


    public static  Stage STAGE = new Stage();
    public static  Stage STAGE_PRINCIPAL = new Stage();

    public static void main(String[] args) {
        IFacade facade = Facade.getInstance();
        Funcionario funcionario = new Funcionario();
        Pessoa pessoa = new Pessoa();
        Usuario usuario = new Usuario();
        pessoa.setCpf("010101");
        usuario.setLogin("berg10");
        usuario.setSenha("1000");

        funcionario.setNome("Berg");
        funcionario.setFunc("Analista");
        funcionario.setStatus(true);
        funcionario.setSetor("TI");
        funcionario.setUsuario(usuario);
        funcionario.setPessoa(pessoa);
        facade.salvarFuncionario(funcionario);

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        STAGE.initOwner(STAGE_PRINCIPAL);
        STAGE.initModality(Modality.WINDOW_MODAL);

        stageLogin().setResizable(false);
        stageLogin().setTitle("Login Sistema Disp@tch");
        stageLogin().show();
    }

    public static Stage genericaStage(String caminho) throws IOException {
        STAGE.setScene(new Scene(
                FXMLLoader.load(App.class.getResource (caminho))));
        STAGE.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent event) { STAGE.close(); }});
        return STAGE;
    }

    public static  Stage stageLogin() throws IOException {
        STAGE.setScene(new Scene(
                FXMLLoader.load(App.class.getResource(LOGIN))));
        STAGE.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent event) { STAGE.close(); }});
        return STAGE;
    }

    public static Stage stagePrincipal() throws IOException {
        STAGE_PRINCIPAL.setScene(new Scene(
                FXMLLoader.load(App.class.getResource (HOME))));
        STAGE.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent event) {
                STAGE_PRINCIPAL.close();}});
        return  STAGE_PRINCIPAL;
    }
}
