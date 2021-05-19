package br.com.despachante_pbd.controller;

import br.com.despachante_pbd.app.App;
import br.com.despachante_pbd.facade.Facade;
import br.com.despachante_pbd.model.Usuario;
import br.com.despachante_pbd.view.Mensagem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    private Usuario usuario;
    private Facade facade = Facade.getInstance();

    @FXML
    private TextField usuarioLog;

    @FXML
    private PasswordField senhaPf;

    @FXML
    void cancelarBt(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void entrarBt(ActionEvent event) throws IOException {
        if (efetuarLogin()){
            App.stagePrincipal().show();
            App.stagePrincipal().setResizable(false);
            App.stagePrincipal().setTitle("Home Disp@tch");
            App.stageLogin().close();
        }
    }

    @FXML
    void resetSenhaBt(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public boolean efetuarLogin(){
        try {
            usuario = facade.validaLoginUsuario(usuarioLog.getText(), senhaPf.getText());
            if (usuario == null){
                Mensagem.mensagem("Senha ou Email incorretos, Por favor verifique novamente seus dados");
                return false;
            }else{

                usuarioLog.clear();
                senhaPf.clear();
                return true;
            }

        }catch (Exception e){
            Mensagem.mensagem("Usuário não cadastrado no sistema!");
            usuarioLog.clear();
            senhaPf.clear();
            return false;
        }
    }

}
