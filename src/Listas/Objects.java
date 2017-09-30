package Listas;

import java.io.Serializable;

//Lista Simple
public class Objects implements Serializable {
    /**
     * Se ponen los atributos que tendrá la clase
     */
    private Node head;
    private Node tail;
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
            head = new Node(value);

        }else{
            Node temp = this.head;
            Node nodo = new Node(value);
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
        Node temporal = this.head;

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
            Node temp = head;
            while (contador < index-1){
                temp = temp.getNext();
                contador++;
            }
            temp.linkNext(temp.getNext().getNext());
        }
        size--;


    }
}
