package entrega_dos;

import java.util.Scanner;

public class Entrega_dos {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int A, B;
    System.out.print("Ingrese A: ");
    A=input.nextInt();
    System.out.print("Ingrese B: ");
    B=input.nextInt();
    
   if (A>B){
   System.out.println("A es mayor que B"); 
   } else if (A<B) {
    System.out.println("A es menor que B");
   } else { System.out.println("A es igual que B");
    }           
    }    
}
