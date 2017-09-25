package Listas;//Lista Circular Doblemente Enlazada

/**
 * @author daniel acuña
 *
 * La clase documentos
 *
 * */

    public class Document {

    private Node head;
    private Node tail;
    private int size;
    private Object object;

    public Document(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
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
    public Object getIndexName(int index) {
        int count = 0;
        Node temporal = this.head;

        while (count < index ) {
            temporal = temporal.getNext();
            count++;
        }
        return temporal.getName();
    }
    public Object seeFirst(){
        return this.head.getName();
    }
    public int getSize(){
        return this.size;
    }



}
