package pl.sda.AddressBookFX_LP;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.sda.AddressBookFX_LP.controller.RootViewController;
import pl.sda.AddressBookFX_LP.model.Person;

public class Main extends Application {

    private ObservableList<Person> personList = FXCollections.observableArrayList();

    public Main() {
        personList.add(new Person("Jan", "Kowalski", "adres", "85420", "500300300", "Bydgoszcz"));
        personList.add(new Person("Janusz", "Nowak", "adres", "85420", "500300300", "Bydgoszcz"));
    }

    public ObservableList<Person> getPersonList(){
        return personList;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
//        Parent root =
//                FXMLLoader.load(
//                        getClass()
//                                .getResource("/root.fxml"));

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/root.fxml"));
        loader.load();

        Parent root = loader.getRoot();
        RootViewController rootViewController = loader.getController();
        rootViewController.setMain(this);
        rootViewController.loadPerson();

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}

