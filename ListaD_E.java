public class ListaD_E {

    private Nodo head;
    private Nodo tail;
    private int size;

    public ListaD_E(){
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
    public void addhead(Object value){
        if (this.head==null){
            Nodo nodo = new Nodo(value);
            this.head = nodo;
            this.tail = nodo;



        }else{
            Nodo temp = this.head;
            Nodo nodo = new Nodo(value);
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
        Nodo temporal = this.head;

        while (count < i){
            temporal = temporal.getNext();
            count++;
        }
        return temporal.getValue();
    }
    public Object obtenerFinal(){
        int count = 0;
        Nodo temp = this.head;

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
        Nodo temp = this.head;
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
