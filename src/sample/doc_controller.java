package sample;
import Listas.Directory;
import Listas.Document;
import Listas.Node;
import Listas.Store;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Callback;

public class doc_controller {
    @FXML
    private TextField name;
    @FXML
    private TextField atN;
    @FXML
    private TextField atT;
    @FXML
    private TextField atS;
    @FXML
    private TextField atR;
    @FXML
    private Button accept;

    Store store = new Store();
    Document doc = new Document();

    public void print(){
        System.out.println("Nombre Documento: "+name.getText());
        System.out.println("Nombre at: "+atN.getText());
        System.out.println("Tipo at: "+atT.getText());
        System.out.println("Llave at: "+atS.getText());
        System.out.println("Requerido : "+atR.getText());
    }



}
