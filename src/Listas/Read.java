package Listas;

/**
 * En fase de pruebas para el input de usuario en consola, actualmaente está obsoleto.
 */

import java.util.Scanner;

public class Read {
    private Store current;

    public Object readInput(){
        Scanner sc = new Scanner(System.in);
        Object input = sc.nextLine();
        return input;

    }
}
