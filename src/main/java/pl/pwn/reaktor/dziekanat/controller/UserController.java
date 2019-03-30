package pl.pwn.reaktor.dziekanat.controller;

        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.input.MouseEvent;
        import javafx.stage.Stage;
        import pl.pwn.reaktor.dziekanat.DziekanatMain;
        import pl.pwn.reaktor.dziekanat.model.utils.CurrentUser;


public class UserController {


    @FXML
    private Label lbLogin;

    @FXML
    private Button btnUpdateData;

    @FXML
    void UpdateDataEvent(MouseEvent event) throws Exception {
        Stage primaryStage = DziekanatMain.getPrimaryStage();
        Parent root = FXMLLoader.load(getClass().getResource("/view/updateDataView.fxml"));
        primaryStage.setTitle("Update");
        primaryStage.setScene((new Scene(root)));
        primaryStage.show();
    }


    public void initialize() {

        lbLogin.setText(lbLogin.getText()+ CurrentUser.getCurrentUser().getLogin());
    }


}
