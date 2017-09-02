public class Main {
    public static void main (String[] args){
        Objects l = new Objects();
        System.out.println("Está vacia: "+l.isEmpty());
        l.delHead();
        l.addhead(9);
        l.addhead(8);
        l.getSize();
        l.del(1);
        l.getSize();
        System.out.println("Dato: "+l.obtener(0));


        System.out.println("Está vacia: "+l.isEmpty());

        System.out.println("Dato: "+l.obtener(0));
        Stores le = new Stores();

        System.out.println(le.obtener(4));
        System.out.println(le.getPrevI(7));
        System.out.println(le.obtenerFinal());
        System.out.println("Head: " + le.gethead());
        System.out.println("Tail: " + le.getTail());

        Documentos lc = new Documentos();
        lc.addFirst(2);
        lc.addFirst(5);
        System.out.println(lc.seeFirst());

        Directory dir = new Directory();
        Read read = new Read();
        Stores store = new Stores();
        store.addhead();
        System.out.println(store.getSize());
        System.out.println(store.gethead());
    }
}
