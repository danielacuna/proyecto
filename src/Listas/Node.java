package Listas;

/**
 * @author Daniel Acuña
 * Clase NODO, usada como base para todas las listas
 * Stores, Documentos y Objetos, Y atributos
 */
public class Node {
    /**
     * Se ponen los atributos que tendrá la clase
     */
    private Object name;
    private Node next;
    private Node prev;
    private Document docu;
    private Object obj;

    /**
     * Constructor de la clase
     * @param name
     */
    public Node(Object name) {
        this.docu = new Document();
        this.name = name;
        this.next = null;
        this.prev = null;
    }

    /**
     * Setters y Getters
     * @return
     */
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

    public void addDoc(Object name){
        docu.addFirst(name);
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
