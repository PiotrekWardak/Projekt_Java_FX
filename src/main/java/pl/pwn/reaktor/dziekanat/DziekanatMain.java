package pl.pwn.reaktor.dziekanat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.pwn.reaktor.dziekanat.utils.HibernateUtils;

public class DziekanatMain extends Application {



    private static Stage priamryStage;
    @Override
    public void start(Stage primaryStage) throws Exception {

        setPriamryStage(primaryStage);
        Parent root = FXMLLoader.load(getClass().getResource("/view/dziekanatView.fxml"));
        primaryStage.setTitle("Dziekanat");
        primaryStage.setScene((new Scene(root)));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    public static Stage getPriamryStage() {
        return priamryStage;
    }

    private static void setPriamryStage(Stage priamryStage) {
        DziekanatMain.priamryStage = priamryStage;
    }

    @Override
    public void init() throws Exception{
        super.init();
        System.out.println("Metoda init uruchamiana tylko raz przy starcie projketu");
        HibernateUtils.initSessionFactory();
    }
    @Override
    public void stop() throws Exception{

        super.stop();
        System.out.println("Metoda stop - uruchamia tylko raz przy zamykaniu projketu");
        HibernateUtils.destroySessionFactory();
    }

}
