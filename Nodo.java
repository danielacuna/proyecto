public class Nodo {
    private Object value;
    private Nodo next;
    private Nodo prev;

    public Nodo(Object value) {

        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public Object getValue() {
        if (value == null){
            return "El valor el nulo";
        }else{
        return value;}
    }

    public Nodo getNext() {
        return next;
    }

    public void linkNext(Nodo next) {
        this.next = next;
    }
    public void linkPrev(Nodo prev){
        this.prev = prev;
    }
    public Nodo getPrev(){
        return this.prev;
    }

}
