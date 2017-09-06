package org.linkedDb.lists;

//Lista Simple
public class Objects {

    private org.linkedDb.lists.Node head;
    private org.linkedDb.lists.Node tail;
    private int size;

    public Objects(){
        this.head = null;
        this.size = 0;
    }
    public boolean isEmpty(){
        if (this.head == null){
            return true;
        }else{
            return false;
        }
    }
    public void addhead(Object value){
        if (this.head==null){
            head = new org.linkedDb.lists.Node(value);

        }else{
            org.linkedDb.lists.Node temp = this.head;
            org.linkedDb.lists.Node nodo = new org.linkedDb.lists.Node(value);
            nodo.linkNext(temp);
            this.head = nodo;

        }
        this.size++;
    }
    public int getSize(){
        System.out.println(this.size);
        return this.size;
    }
    public Object obtener(int i){
        int count = 0;
        org.linkedDb.lists.Node temporal = this.head;

        while (count < i){
            temporal = temporal.getNext();
            count++;
        }
        return temporal.getName();
    }
    public Object delHead(){
        if (head == null){
            System.out.println("La lista está vacía y no se puede eliminar");
            return null;
        }else {
            head = head.getNext();
            size--;
        }
        return null;
    }

    public void del(int index){
        if(index == 0){
            head= head.getNext();
        }else{
            int contador = 0;
            org.linkedDb.lists.Node temp = head;
            while (contador < index-1){
                temp = temp.getNext();
                contador++;
            }
            temp.linkNext(temp.getNext().getNext());
        }
        size--;


    }
}
