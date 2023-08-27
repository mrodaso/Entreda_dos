package entrega_dos;

import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {
      String CODIGO, NOMBRE;
      int HORAS,VALOR,RETEN,SALARIOB,SALARION,RESTO;
       Scanner input = new Scanner(System.in);
        System.out.print("Código del empleado: ");
        CODIGO = input.nextLine();
        System.out.print("Nombre del empleado: ");
        NOMBRE = input.nextLine();
        System.out.print("Horas trabajadas: ");
        HORAS = input.nextInt();
        System.out.print("Valor por hora trabajada: ");
        VALOR = input.nextInt();
        System.out.print("Porcentaje de retención: ");
        RETEN = input.nextInt();
    SALARIOB=VALOR*HORAS;
    SALARION=(SALARIOB*RETEN)/100;
    RESTO=SALARIOB-SALARION;
    System.out.println("Su código es: "+CODIGO);
    System.out.println("Su nombre es: "+NOMBRE);
    System.out.println("El salario bruto es igual a: "+SALARIOB);
    System.out.println("El salario neto es igual a: "+RESTO);
    
          
    }
    
    
}
