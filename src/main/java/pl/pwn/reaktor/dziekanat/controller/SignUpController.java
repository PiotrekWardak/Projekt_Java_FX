package pl.pwn.reaktor.dziekanat.controller;

        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;
        import javafx.scene.input.MouseEvent;
        import javafx.stage.Stage;
        import org.hibernate.Session;
        import org.hibernate.Transaction;
        import org.hibernate.query.Query;
        import pl.pwn.reaktor.dziekanat.DziekanatMain;
        import pl.pwn.reaktor.dziekanat.model.RoleEnum;
        import pl.pwn.reaktor.dziekanat.model.User;
        import pl.pwn.reaktor.dziekanat.utils.HibernateUtils;

public class SignUpController {

    @FXML
    private TextField tfNewLogin;

    @FXML
    private TextField tfNewPassword;

    @FXML
    private Button btnAddToDB;

    @FXML
    private Button btnGoBack;

    @FXML
    void AddToDBEvent(MouseEvent event) {

        String login = tfNewLogin.getText();
        String pass =tfNewPassword.getText();
        System.out.println(login);
        System.out.println(pass);

        User user = new User(login, pass, RoleEnum.ROLE_STUDENT, true);

        Session session = HibernateUtils.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.save(user);

        transaction.commit();
        session.close();

    }

    @FXML
    void GoBackEvent(MouseEvent event) throws Exception {

        Stage primaryStage = DziekanatMain.getPrimaryStage();
        Parent root = FXMLLoader.load(getClass().getResource("/view/dziekanatView.fxml"));
        primaryStage.setTitle("Dziekanat");
        primaryStage.setScene((new Scene(root)));
        primaryStage.show();
    }

}
