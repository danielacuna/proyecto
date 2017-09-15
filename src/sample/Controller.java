package sample;

import Listas.Document;
import Listas.Node;
import Listas.Store;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {
    private Node head;
    @FXML
    private TextField dato;
    @FXML
    private Button btn;

    Document doc = new Document();
    Store store = new Store();


    public void aber() {
        System.out.println(dato.getText());
        dato.clear();
    }
    public void addDoc(){
        doc.addFirst(dato.getText());
        dato.clear();
        System.out.println(doc.getSize());
        System.out.println(doc.seeFirst());
    }
    public void addStore(){
        store.addhead(dato.getText());
        dato.clear();
        System.out.println(store.getHead());
        System.out.println(store.getSize());


    }

}
