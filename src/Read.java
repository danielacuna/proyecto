import java.util.Scanner;

public class Read {
    public Object read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Store: ");
        Object input = sc.nextLine();
        return input;

    }
}
