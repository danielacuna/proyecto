package Listas;

import java.io.Serializable;

/**
 * @author Daniel Acuña
 */

//Lista Doblemente Enlazada
public class Store implements Serializable{
    /**
     * Se ponen los atributos que tendrá la clase
     */
    private Node head;
    private Node tail;
    private Document doc;
    private int size;

    /**
     * Constructor de la clase
     */
    public Store() {
        this.doc = new Document();
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Ver si la lista está vacía.
     * @return
     */
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Obetner el nodo principal de la Lista, el tamaño getSize.
     * y getHeadName para ver el nombre del primer nodo.
     * @return
     */
    public Node getHead(){
        return this.head;
    }
    public Object getHeadName() {
        return this.head.getName();
    }
    public int getSize() {
        return this.size;
    }



    /**
     *Agregar nodo al principio de la Lista
     * @param name
     */
    public void addhead(Object name) {
        if (this.head == null) {
            Node nodo = new Node(name);
            doc = new Document();
            this.head = nodo;
            this.tail = nodo;


        } else {
            Node temp = this.head;
            Node nodo = new Node(name);
            doc = new Document();
            nodo.linkNext(temp);
            temp.linkPrev(nodo);
            this.head = nodo;

        }
        this.size++;
    }

    /**
     * Agregar un nodo al final de la lista.
     * @param name
     */
    public void addTail(Object name) {
        if (this.head == null) {
            Node nodo = new Node(name);
            doc = new Document();
            this.head = nodo;
            this.tail = nodo;


        } else {
            Node temp = this.tail;
            Node nodo = new Node(name);
            nodo.linkPrev(temp);
            temp.linkNext(nodo);
            this.tail = nodo;

        }
        this.size++;
    }


/**
 * Obtener el Nombre de un store basado en su indice(Necesaario para el
 * ciclo for)
 */
    public Object getIndexName(int index) {
        int count = 0;
        Node temporal = this.head;

        while (count < index ) {
            temporal = temporal.getNext();
            count++;
        }
        return temporal.getName();
    }

    /**
     * Obetner el nodo según su indice o posicion en la lista
     * @param index
     * @return
     */
    public Node getIndex(int index) {
        int count = 0;
        Node temporal = this.head;

        while (count < index ) {
            temporal = temporal.getNext();
            count++;
        }
        return temporal;
    }

    /**
     * Para obtener un nodo basado en su nombre.
     * @param name
     * @return
     */
    public Object getNode(Object name) {
        int count = 0;
        Node temporal = this.head;

        while (temporal.getName() != name ) {
            temporal = temporal.getNext();
            count++;
        }
        return temporal;
    }
    /**
     *
     * Para obtener el nodo anterior
     */

    public Object getPrevI(int index) {
        int counter = 0;
        Node temp = this.head;
        if (index == 0) {
            return "El previo es nulo";
        }
        if (index > getSize() - 1) {
            return "Este nodo no existe";
        } else {

            while (counter < index) {
                temp = temp.getNext();
                counter++;
            }
            return temp.getPrev().getName();
        }
    }
/**
 * Instancia de clase Directory para usarse posteriormente
 * en el "commit"
 */
    Directory dir = new Directory();

    /**
     * Para obtener el nodo de Tipo documento.
     * @return
     */
    public Document getDoc(){
        return this.doc;
    }

    /**
     * El "Commit" que basicamente solo hace los directorios.
     */
    public void commit(){
        Node temp = this.head;
        int count = 0;
        while (count < getSize()) {
            dir.setName(temp.getName());
            dir.createDir();
            temp = temp.getNext();
            count++;
        }
    }

}