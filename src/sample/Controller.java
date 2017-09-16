package sample;

import Listas.Document;
import Listas.Node;
import Listas.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller {
    private Node head;
    @FXML
    private TextField dato;
    @FXML
    private Button commit;
    @FXML
    private Button document;

    Document doc = new Document();
    Store store = new Store();


    public void aber() {

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
    public void commit(){
        store.commit();
    }
    public void document0 (ActionEvent event) throws Exception{
        try {
            Stage Stage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("document.fxml"));
            Stage.setTitle("Hello World");
            Stage.setScene(new Scene(root1, 300, 275));
            Stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
