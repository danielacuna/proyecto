//Lista Doblemente Enlazada
public class Stores {

    private Node head;
    private Node tail;
    private int size;

    public Stores(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isEmpty(){
        if (this.head == null){
            return true;
        }else{
            return false;
        }
    }
    public void addhead(){
        Directory dir = new Directory();
        Read read = new Read();
        Object value = dir.createDir(read.read());
        if (this.head==null){
            Node nodo = new Node(value);
            this.head = nodo;
            this.tail = nodo;



        }else{
            Node temp = this.head;
            Node nodo = new Node(value);
            nodo.linkNext(temp);
            temp.linkPrev(nodo);
            this.head = nodo;

        }
        this.size++;
    }
    public int getSize(){
        return this.size;
    }
    public Object obtener(int i){
        int count = 0;
        Node temporal = this.head;

        while (count < i){
            temporal = temporal.getNext();
            count++;
        }
        return temporal.getValue();
    }
    public Object obtenerFinal(){
        int count = 0;
        Node temp = this.head;

        while (count < (getSize()-1)){
            temp = temp.getNext();
            count++;
        }
        return temp.getValue();

        }
    public Object gethead(){
        return this.head.getValue();

    }
    public Object getTail(){
        return this.tail.getValue();
    }
    public Object getPrevI(int index){
        int counter = 0;
        Node temp = this.head;
        if (index==0){
            return "El previo es nulo";
        }if(index > getSize()-1){return "Este nodo no existe";}
        else {

            while (counter < index) {
                temp = temp.getNext();
                counter++;
            }
            return temp.getPrev().getValue();
        }
    }
}
