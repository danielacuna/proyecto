
public class ListaEnlazada {

    private Nodo head;
    private Nodo tail;
    private int size;

    public ListaEnlazada(){
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
            head = new Nodo(value);

        }else{
            Nodo temp = this.head;
            Nodo nodo = new Nodo(value);
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
        Nodo temporal = this.head;

        while (count < i){
            temporal = temporal.getNext();
            count++;
        }
        return temporal.getValue();
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
            Nodo temp = head;
            while (contador < index-1){
                temp = temp.getNext();
                contador++;
            }
            temp.linkNext(temp.getNext().getNext());
        }
        size--;


    }
}
