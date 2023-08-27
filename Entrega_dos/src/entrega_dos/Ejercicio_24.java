package entrega_dos;

import java.util.Scanner;

public class Ejercicio_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el peso de la esfera A: ");
        double A = input.nextInt();
        System.out.print("Ingrese el peso de la esfera B: ");
        double B = input.nextInt();
        System.out.print("Ingrese el peso de la esfera C: ");
        double C = input.nextInt();
        

        if (A > B & A>C) {
            System.out.println("La esfera con mayor peso es: " +A);
        } else if (B > C) {
            System.out.println("La esfera con mayor peso es: " +B);
        } else {
            System.out.println("La esfera con mayor peso es: " +C);
        }
    }
    
}
