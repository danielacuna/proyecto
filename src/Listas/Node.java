package Listas;

public class Node {
    private Object name;
    private Node next;
    private Node prev;
    private Document docu;
    private Object obj;

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

    public Document getDocu() {
        return docu;
    }

    public void setDocu(Document docu) {
        this.docu = docu;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
