public class ListaCircular {

    private Nodo head;
    private Nodo tail;
    private int size;

    ListaCircular(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void addFirst(Object value) {
        if (head == null) {
            Nodo nodo = new Nodo(value);
            this.head = nodo;
            this.tail = nodo;
        }else{
            Nodo temp = this.head;
            Nodo nodo = new Nodo(value);
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
