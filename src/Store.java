//Lista Doblemente Enlazada
public class Store {

    private Node head;
    private Node tail;
    private int size;

    public Store(){
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

    public void addTail(Object name){
        if (this.head==null){
            Node nodo = new Node(name);
            this.head = nodo;
            this.tail = nodo;



        }else{
            Node temp = this.tail;
            Node nodo = new Node(name);
            nodo.linkPrev(temp);
            temp.linkNext(nodo);
            this.tail = nodo;

        }
        this.size++;
    }
    public int getSize(){
        return this.size;
    }


    public Object getIndex(int index){
        int count = 0;
        Node temporal = this.head;

        while (count < index -1){
            temporal = temporal.getNext();
            count++;
        }
        return temporal.getName();
    }


    public void getStores(){
        int count = 0;
        Node temp = this.head;

        if(head == null){
            System.out.println("Store no tiene Documentos");

        }else{
            while (count<getSize()){
                System.out.println("Documento: "+temp.getName());
                temp = temp.getNext();
                count++;
            }
        }

    }
    public Object gethead(){ return this.head.getName(); }

    public Object getTail(){
        return this.tail.getName();
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
            return temp.getPrev().getName();
        }
    }
    public void addDoc(){
        Directory dir = new Directory();
        if (head == null){
            System.out.println("Debes Agregar un Store!");
            System.out.println("¿Quieres agregar uno? Y/N");
            Read read = new Read();
            Object input = read.readInput();
            if (input.toString().toLowerCase().equals("y")){
                System.out.println("Inserte el nombre: ");
                Object name = read.readInput();
                addTail(name);
                dir.createDir(name);

            }else{
                System.out.println("Por que no");
            }

        }else{
            Read read = new Read();
            System.out.println("Inserte el nombre: ");
            Object name = read.readInput();
            addTail(name);
            dir.createDir(name);

        }


    }
}
