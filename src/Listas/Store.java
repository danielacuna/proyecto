package Listas;

import java.util.ArrayList;

//Lista Doblemente Enlazada
public class Store {

    private Node head;
    private Node tail;
    private Document doc;
    private int size;

    public Store() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addhead(Object name) {
        if (this.head == null) {
            Node nodo = new Node(name);
            doc = new Document();
            this.head = nodo;
            this.tail = nodo;


        } else {
            Node temp = this.head;
            Node nodo = new Node(name);
            nodo.linkNext(temp);
            temp.linkPrev(nodo);
            this.head = nodo;

        }
        this.size++;
    }

    public void addTail(Object name) {
        if (this.head == null) {
            Node nodo = new Node(name);
            doc = new Document();
            this.head = nodo;
            this.tail = nodo;


        } else {
            Node temp = this.tail;
            Node nodo = new Node(name);
            nodo.linkPrev(temp);
            temp.linkNext(nodo);
            this.tail = nodo;

        }
        this.size++;
    }

    public int getSize() {
        return this.size;
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


    public ArrayList<Object> getStores() {
        int count = 0;
        Node temp = this.head;
        ArrayList<Object> stores = new ArrayList<Object>(getSize());
        if (head == null) {
            return null;
        } else {
            while (count < getSize()) {
                temp = temp.getNext();
                count++;
                stores.add(temp.getName());
            }
        }
        return stores;
    }

    public Object getHead() {
        return this.head.getName();
    }

    public Object getTail() {
        return this.tail.getName();
    }

    public Object getPrevI(int index) {
        int counter = 0;
        Node temp = this.head;
        if (index == 0) {
            return "El previo es nulo";
        }
        if (index > getSize() - 1) {
            return "Este nodo no existe";
        } else {

            while (counter < index) {
                temp = temp.getNext();
                counter++;
            }
            return temp.getPrev().getName();
        }
    }

    Directory dir = new Directory();

    public void addStore() {
        Read read = new Read();
        System.out.println("Ingrese el Nombre del Store: ");
        Object name = read.readInput();
        dir.setName(name);
        addTail(name);
    }

    public void addDoc(Document value) {
        Document doc = new Document();
        if(head==null) {
            Node node = new Node(value);
            node = head;
        }else{
            Node temp = head;
            Node node = new Node(value);
            temp.linkPrev(node);
            node.linkNext(temp);
        }
    }
    public void getStore(Object name){
        Node node = head;
    }

    public void commit(){
        Node temp = this.head;
        int count = 0;
        while (count < getSize()) {
            dir.setName(temp.getName());
            dir.createDir();
            temp = temp.getNext();
            count++;
        }
    }

}