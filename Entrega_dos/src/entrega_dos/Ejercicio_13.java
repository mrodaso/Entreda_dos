package entrega_dos;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        double VALOR, RESTO; 
        System.out.println("Total del valor a pagar: ");
        VALOR = input.nextDouble();   
        System.out.println("Color de la bola");        
        String COLOR = input.next();       
        if (COLOR.equals("BLANCO") || COLOR.equals("blanco")){
            RESTO=0;
        } else if (COLOR.equals("VERDE")|| COLOR.equals("verde")){
            RESTO= 0.1;
        } else if (COLOR.equals("AMARILLO")|| COLOR.equals("amarillo")){
            RESTO= 0.25;
        } else if (COLOR.equals("AZUL")|| COLOR.equals("azul")){
            RESTO= 0.5;
        } else {
            RESTO= 1;
        }
        double TOTAL =VALOR-VALOR*RESTO;
        System.out.println("El cliente debe pagar: $"+ TOTAL);     
    }
    
}
