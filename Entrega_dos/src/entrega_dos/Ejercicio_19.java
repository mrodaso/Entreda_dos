package entrega_dos;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {
        double A, perimetro, altura, area,h,Al;
        Scanner input = new Scanner(System.in);
        System.out.print("Lado del triángulo: ");
        A= input.nextDouble();
        perimetro=A*3;
        area=sqrt(3)*Math.pow(A, 2);
        Al=area/4;
        altura=sqrt(3)*A;
        h=altura/2;
    System.out.println("El valor del perímetro es igual a: "+perimetro);
    System.out.println("La altura es: "+h);
    System.out.println("El área del triángulo es igual a: "+Al);    
        
           
    }
    
}
