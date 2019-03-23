package pl.sda.AddressBookFX_LP.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import pl.sda.AddressBookFX_LP.Main;
import pl.sda.AddressBookFX_LP.model.Person;

import java.net.URL;
import java.util.ResourceBundle;

public class RootViewController implements Initializable {

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

    private Main main;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }

    public void loadPerson() {
        System.out.println(this.main.getPersonList());
        personTableView.setItems(getMain().getPersonList());
        nameCol.setCellValueFactory(c -> c.getValue().nameProperty());
        lastnameCol.setCellValueFactory(c-> c.getValue().lastnameProperty());
    }

}
