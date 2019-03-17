package pl.pwn.reaktor.dziekanat.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import pl.pwn.reaktor.dziekanat.DziekanatMain;

public class DziekanatController {

    @FXML
    private TextField tfLogin;

    @FXML
    private TextField tfPassword;

    @FXML
    private PasswordField pfPassword;

    @FXML
    private Button btnShow;

    @FXML
    private Button btnSignIn;

    @FXML
    private Button btnGuest;

    @FXML
    private Button btnLogin;

    @FXML
    void ShowEvent(MouseEvent event) {

        if("SHOW".equalsIgnoreCase(btnShow.getText())){
            tfPassword.setText(pfPassword.getText());
            tfPassword.setVisible(true);
            pfPassword.setVisible(false);
            btnShow.setText("hide");
        }
        else if ("hide".equalsIgnoreCase(btnShow.getText())){
            pfPassword.setText(tfPassword.getText());
            pfPassword.setVisible(true);
            tfPassword.setVisible(false);
            btnShow.setText("show");
        }
    }

    @FXML
    void SignInEvent(MouseEvent event) {

    }

    @FXML
    void guestEvent(MouseEvent event) {

    }

    @FXML
    void loginEvent(MouseEvent event) throws Exception {

        Stage primaryStage = DziekanatMain.getPriamryStage();
        Parent root = FXMLLoader.load(getClass().getResource("/view/userView.fxml"));
        primaryStage.setTitle("User view");
        primaryStage.setScene((new Scene(root)));
        primaryStage.show();
    }

    @FXML
    void loginKeyAction(KeyEvent event) {

    }

}
