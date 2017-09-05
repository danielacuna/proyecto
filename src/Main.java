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



        Documentos lc = new Documentos();
        lc.addFirst(2);
        lc.addFirst(5);
        System.out.println(lc.seeFirst());
        Store store = new Store();
        store.addDoc();
        store.addDoc();
        store.addDoc();
        store.addDoc();
        store.getStores();
    }
}
