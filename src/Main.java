public class Main {
    public static void main (String[] args){

        Directory dir = new Directory();
        Read read = new Read();
        Store store = new Store();
        store.addhead();
        store.addhead();
        store.addhead();
        store.addhead();
        System.out.println(store.obtener());
    }
}