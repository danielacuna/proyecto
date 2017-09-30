package Listas;//Lista Circular Doblemente Enlazada

/**
 * @author Daniel Acuña
 *
 * La clase documentos está dentro de Json Stores
 *
 *
 * */

    public class Document {
    /**
     * Se ponen los atributos que tendrá la clase
     */
    private Node head;
    private Node tail;
    private int size;
    private Object object;

    /**
     * Constructor de la clase
     */
    public Document(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     *Agregar nodo al principio de la Lista
     * @param name
     */


    public Object addFirst(Object name){
        if (head == null) {
            Node nodo = new Node(name);
            object = new Object();
            this.head = nodo;
            this.tail = nodo;
        }else{
            Node temp = this.head;
            Node nodo = new Node(name);
            object = new Object();
            nodo.linkNext(temp);
            temp.linkPrev(nodo);
            nodo.linkPrev(tail);
            this.head = nodo;
            this.tail.linkNext(this.head);
        }
        size++;
        return head;
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
     * Metodos para ver el tamaño de la lista, y para ver el nombre del primer nodo
     *
     * @return
     */
    public Object seeFirstName(){return this.head.getName();
    }
    public int getSize(){
        return this.size;
    }



}
