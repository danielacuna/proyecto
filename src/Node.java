public class Node {
    private Object value;
    private Node next;
    private Node prev;

    public Node(Object value) {

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
