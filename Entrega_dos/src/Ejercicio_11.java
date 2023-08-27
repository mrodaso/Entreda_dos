
import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int A, B, C;
    System.out.print("Ingrese A:");
    A=input.nextInt();
    System.out.print("Ingrese B:");
    B=input.nextInt();
    System.out.print("Ingrese C:");
    C=input.nextInt();
    
    if (A>B && A>C){
    System.out.println("A es el mayor de los números");
    } else if (B>A && B>C){
    System.out.println("B es el mayor de los números");
    } else System.out.println("C es el mayor de los números");  
    }
    
}
