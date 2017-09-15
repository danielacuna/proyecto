public class Main {
    public static void main (String[] args){
        ListaEnlazada l = new ListaEnlazada();
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
        ListaD_E le = new ListaD_E();
        le.addhead(8);
        le.addhead(7);
        le.addhead(6);
        le.addhead(5);
        le.addhead(88);
        le.addhead(86);
        le.addhead(84);
        le.addhead(83);

        System.out.println(le.obtener(4));
        System.out.println(le.getPrevI(7));
        System.out.println(le.obtenerFinal());
        System.out.println("Head: " + le.gethead());
        System.out.println("Tail: " + le.getTail());

        ListaCircular lc = new ListaCircular();
        lc.addFirst(2);
        lc.addFirst(5);
        System.out.println(lc.seeFirst());

    }
}
