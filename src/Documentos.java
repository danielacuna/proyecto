//Lista Circular Doblemente Enlazada
public class Documentos {

    private Node head;
    private Node tail;
    private int size;

    Documentos(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void addFirst(Object value) {
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
    }
    public Object seeFirst(){
        return this.tail.getNext().getValue();
    }




}
