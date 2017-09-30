package sample;

import Listas.Directory;
import Listas.Document;
import Listas.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author Daniel Acuña
 */
public class Controller {
    /**
     *
     * Variables JavaFX
     */
    @FXML
    private TextField storeF;
    @FXML
    private Button commit;
    @FXML
    private Button document;
    @FXML
    private TreeView<String> treeView;
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
    @FXML
    private Pane paneDoc;

    /**
     * Instanciacion de lo que se estará usando
     */
    Document doc = new Document();
    Directory dir = new Directory();
    Store store = new Store();

    /**
     * Para obetner Nodo de Stores
     * @return
     */
    public Store getStore() {
        return this.store;
    }

    /**
     * El treeView por medio de un for llama los nombres de los stores,
     * hace un treeitem con dicho nombre y sigue hasta alcanzar el tamaño
     * maximo de la lista.
     *
     */

    public void tree_View() {

        storeF.clear();
        int sizeS = store.getSize();
        int sizeD = store.getDoc().getSize();

        TreeItem<String> root = new TreeItem<>();
        for (int i = 0; i < sizeS; i++) {

            root.setExpanded(true);
            TreeItem<String> item = new TreeItem<String>(store.getIndexName(i).toString());
            root.getChildren().add(item);
            for (int d = 0;d< sizeD; d++){
                TreeItem<String> subitem = new TreeItem<String>(store.getHead().getDocu().getIndexName(d).toString());
                subitem.setExpanded(true);
                item.getChildren().add(subitem);



            }
        }
        treeView.setRoot(root);
        treeView.setShowRoot(false);


    }

    /**
     * addStore agrega los Stores y llama la función para mostrarlos en el tree view
     * StroeF es la variable del JavaFX que contiene los Datos.
     */
    public void addStore() {
        if (storeF.getText().trim().isEmpty()) {
            System.out.println("No se puede agregar vacío");
        } else {
            store.addhead(storeF.getText());
            System.out.println(store.getHeadName());
            System.out.println(store.getSize());
            tree_View();
        }
    }

    /**
     * Si se le puede llamar commit, esto lo es. llama a la fución en store.
     */
    public void commit() {
        store.commit();
    }

    /**
     * Usado para Crear el documento dentro del Store "solo el head" logré
     * Llama a las instancias de doc y store, y consecuentementes
     * funciones dentro de las listas para poder "adentrarse" en la
     * jerarquía
     */

    public void addDoc() {
        if(store.isEmpty()==true){
            throw new RuntimeException("No puede estar vacía");
        }
        store.getHead().getDocu().addFirst(name.getText());
        System.out.println(store.getSize());
        System.out.println("Store: "+store.getHeadName().toString()+": "
                + "Documento:" +store.getHead().getDocu().seeFirstName().toString());
    }

    /**
     * Cuando tenía una ventana extra, esta función llamaba a la misma.
     * @param event
     * @throws Exception
     */
    public void document0(ActionEvent event) throws Exception {
        try {
            Stage Stage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("document.fxml"));
            Stage.setTitle("New Document");
            Stage.setScene(new Scene(root1, 300, 275));
            Stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Al presionar el boton de addDocument se muestra el panel
     * con las opciones.
     *
     */
    public void PaneDocT() {
        paneDoc.setVisible(true);
    }

    /**
     * Usada para cuando se apreta el botón aceptar en la pantalla de agreagar Doc
     * Lo que hace es Esconder el panel y además llamar otras funciones para la
     * creación del documento.
     *
     */
    public void PaneDocF() {
        if(store.getSize()==0){
            System.out.println("No puedes  hacer eso");}
        paneDoc.setVisible(false);
        addDoc();
        tree_View();
    }

}
