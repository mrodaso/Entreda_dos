package entrega_dos;

import java.util.Scanner;

public class Ejercicio_22 {
    public static void main(String[] args) {
        String NOMBRE;
        double SALARIO, HORAS,RESTO;
        Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el nombre del trabajador: ");
    NOMBRE = input.nextLine();
    System.out.println("Ingrese el salario básico por hora: ");
    SALARIO = input.nextDouble();
    System.out.println("Ingrese el número total de horas trabajadas durante el mes: ");
    HORAS = input.nextDouble();
    RESTO=SALARIO*HORAS;
    System.out.println("El nombre del empleado es: " + NOMBRE);
    if (RESTO>450000){
    System.out.println("El salario mensual es igual a: " + RESTO);   
        
    }    
    }
    
}
