package entrega_dos;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        double V1,V2,V3,salario;
        double S1,S2,S3;
        System.out.println("Valor de la venta del primer departamento");
        V1= sc.nextDouble();
        System.out.println("Valor de la venta del segundo departamento");
        V2= sc.nextDouble();
        System.out.println("Valor de la venta del tercero departamento");
        V3= sc.nextDouble();
        System.out.println("¿Cuánto es el salario de los vendedores?");
        salario= sc.nextDouble();
        Double exced=(V1+V2+V3)*0.33;
        if (V1>exced){
            S1= salario+salario*0.2;
        } else{
            S1= salario;
        }
        if (V2>exced){
            S2= salario+salario*0.2;
        } else{
            S2= salario;
        }
        if (V3>exced){
            S3= salario+salario*0.2;
        } else{
            S3= salario;
        }
        System.out.println("El salario de vendedores del departamento 1 es: $" + S1);
        System.out.println("El salario de vendedores del departamento 2 es: $" + S2);
        System.out.println("El salario de vendedores del departamento 3 es: $" + S3);

    }
    
}
