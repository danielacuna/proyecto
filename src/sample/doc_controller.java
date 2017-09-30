package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class doc_controller extends Controller {
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

    /**
     * Al final no funcionó de nada.
     */
    public void print(){
        store.getHead().addDoc("Daniel");
        System.out.println(store.getSize());
        System.out.println(store.getHeadName().toString() + store.getDoc().seeFirstName().toString());
    }
}
