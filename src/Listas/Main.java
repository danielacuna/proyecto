package Listas;

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

        Document lc = new Document();
        Store store = new Store();

        store.addStore();
        store.addDoc(lc);
        store.getStores();
        System.out.println(lc.seeFirst());



    }
}
