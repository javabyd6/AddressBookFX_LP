package pl.sda.AddressBookFX_LP.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import pl.sda.AddressBookFX_LP.model.Person;

public class RootViewController {

    @FXML
    private TableView<Person> personTableView;
    @FXML
    private TableColumn<Person, String> nameCol;
    @FXML
    private TableColumn<Person, String> lastnameCol;
    @FXML
    private Label labName;
    @FXML
    private Label labLastname;
    @FXML
    private Label labAddress;
    @FXML
    private Label labPostalcode;
    @FXML
    private Label labTelephone;
    @FXML
    private Label labCity;
    @FXML
    private ButtonBar butView;
    @FXML
    private Button butNP;
    @FXML
    private Button butEdit;
    @FXML
    private Button butDel;
    @FXML
    private Button butSave;


}
