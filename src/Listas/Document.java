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
    private String name;

    public Document(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public Object addFirst(Object value) {
    //    Read read = new Read();
    //    System.out.println("Inserte el Nombre del Doc");
    //    Object value = read.readInput();
        if (head == null) {
            Node nodo = new Node(value);
            this.head = nodo;
            this.tail = nodo;
        }else{
            Node temp = this.head;
            Node nodo = new Node(value);
            nodo.linkNext(temp);
            temp.linkPrev(nodo);
            nodo.linkPrev(tail);
            this.head = nodo;
            this.tail.linkNext(this.head);
        }
        size++;
        return head;
    }
    public Object seeFirst(){
        return this.head.getName();
    }
    public int getSize(){
        return this.size;
    }



}
