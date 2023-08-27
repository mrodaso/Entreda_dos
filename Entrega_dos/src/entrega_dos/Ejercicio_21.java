package entrega_dos;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Ejercicio_21 {
     public static void main(String[] args) {
          double A,B,C, perimetro, semiperimetro,area,altura;
        Scanner input = new Scanner(System.in);
        System.out.print("Valor del lado A: ");
        A= input.nextDouble();
        System.out.print("Valor del lado B: ");
        B= input.nextDouble();
        System.out.print("Valor del lado C: ");
        C= input.nextDouble();
        perimetro=A+B+C;
        semiperimetro=(A+B+C)/2;
        area=Math.sqrt(semiperimetro*(semiperimetro-A)*(semiperimetro-B)*(semiperimetro-C));
    System.out.println("El valor del perímetro es igual a: "+perimetro);
    System.out.println("El valor del semiperímetro es igual a: "+semiperimetro);  
    System.out.println("El área total es: "+area); 
     }
    
}
