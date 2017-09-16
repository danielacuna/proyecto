package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.util.Callback;

public class doc_controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TreeTableView<String> tableView;

    @FXML
    private TreeTableColumn<String , String> col1;

    TreeItem<String> item1 = new TreeItem<>("Daniel");
    TreeItem<String> item2 = new TreeItem<>("Juan");
    TreeItem<String> parent1 = new TreeItem<>("Vainas");

    TreeItem<String> root = new TreeItem<>("Nombres");



    @FXML
    void initialize() {
        parent1.getChildren().setAll(item1,item2);
        root.getChildren().setAll(parent1);
        col1.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getValue()));
                tableView.setRoot(root);


    }
}
