import javax.jws.Oneway;

public class Node {
    private Object name;
    private Object value;
    private Node next;
    private Node prev;

    public Node(Object name, Object value) {

        this.name = name;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
    public Node(Object value){
        this.value = value;
        this.next = null;
        this.prev = null;

    }

    public Object getValue() {
        if (value == null){
            return "El valor es nulo";
        }else{
        return value;}
    }
    public Object getName(){
        return this.name;
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
