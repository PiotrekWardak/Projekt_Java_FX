package pl.pwn.reaktor.dziekanat.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class userSurveyController {

    @FXML
    private MenuItem mSaveToFile;

    @FXML
    private MenuItem mSaveToDatabase;

    @FXML
    private MenuItem mClose;

    @FXML
    private MenuItem mClear;

    @FXML
    private MenuItem mAbout;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfLastName;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfPhone;

    @FXML
    private ToggleGroup g1;

    @FXML
    void ClearEvent(ActionEvent event) {

    }

    @FXML
    void OtherEvent(MouseEvent event) {

    }

    @FXML
    void PreviewEvent(MouseEvent event) {

    }

    @FXML
    void SaveToDataBaseEvent(ActionEvent event) {

    }

    @FXML
    void SaveToFileEvent(ActionEvent event) {

    }

    @FXML
    void aboutAction(ActionEvent event) {

    }

    @FXML
    void closeEvent(ActionEvent event) {

    }

}
