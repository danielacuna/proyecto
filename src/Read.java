import java.util.Scanner;

public class Read {
    private Store current;

    public Object readInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Store: ");
        Object input = sc.nextLine();
        return input;

    }
}
