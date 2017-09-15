package Listas;

public class Node {
    private Object name;
    private Node next;
    private Node prev;

    public Node(Object name) {
        this.name = name;
        this.next = null;
        this.prev = null;
    }

    public Object getName() {
        if (name == null){
            return "El valor es nulo";
        }else{
        return name;}
    }

    public Node getNext() {
        return next;
    }

    public void linkNext(Node next) {
        this.next = next;
    }
    public void linkPrev(Node prev){
        this.prev = prev;
    }
    public Node getPrev(){
        return this.prev;
    }

}
