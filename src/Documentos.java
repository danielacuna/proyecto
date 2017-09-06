package org.linkedDb.lists;

//Lista Circular Doblemente Enlazada
public class Documentos {

    private org.linkedDb.lists.Node head;
    private org.linkedDb.lists.Node tail;
    private int size;

    Documentos(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void addFirst(Object value) {
        if (head == null) {
            org.linkedDb.lists.Node nodo = new org.linkedDb.lists.Node(value);
            this.head = nodo;
            this.tail = nodo;
        }else{
            org.linkedDb.lists.Node temp = this.head;
            org.linkedDb.lists.Node nodo = new org.linkedDb.lists.Node(value);
            nodo.linkNext(temp);
            temp.linkPrev(nodo);
            nodo.linkPrev(tail);
            this.head = nodo;
            this.tail.linkNext(this.head);
        }
        size++;
    }
    public Object seeFirst(){
        return this.tail.getNext().getName();
    }




}
