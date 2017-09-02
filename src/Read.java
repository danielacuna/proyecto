import java.util.Scanner;

public class Read {
    private Store current;

    public Object readInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Store: ");
        Object input = sc.nextLine();
        return input;

    }
    public void readName(){
        Store temp = new Store();
        int i = 0;
        while (i < temp.getSize()-1){
            System.out.println("Documentos: ");
            System.out.println("");
            System.out.println(temp.obtener());
        }

    }
}
