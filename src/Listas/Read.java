package Listas;

import java.util.Scanner;

public class Read {
    private Store current;

    public Object readInput(){
        Scanner sc = new Scanner(System.in);
        Object input = sc.nextLine();
        return input;

    }
}
