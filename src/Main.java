package org.linkedDb.lists;

public class Main {
    public static void main (String[] args){
        org.linkedDb.lists.Objects l = new org.linkedDb.lists.Objects();
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



        org.linkedDb.lists.Documentos lc = new org.linkedDb.lists.Documentos();
        lc.addFirst(2);
        lc.addFirst(5);
        System.out.println(lc.seeFirst());
        org.linkedDb.lists.Store store = new org.linkedDb.lists.Store();
        store.addDoc();
        store.addDoc();
        store.addDoc();
        store.addDoc();
        store.getStores();
    }
}
