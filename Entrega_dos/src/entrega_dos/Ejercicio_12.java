package entrega_dos;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
    String NOM;
    double VALOR,HORAS,EXTRA = 0,EXTRA8,SALARIO;
    Scanner input = new Scanner(System.in);
    System.out.print("Nombre del trabajador: ");
    NOM=input.nextLine();
    System.out.print("Horas trabajadas: ");
    HORAS=input.nextInt();
    System.out.print("Valor de hora: ");
    VALOR=input.nextInt();
    if (HORAS>40){
        EXTRA=HORAS-40;
        if (EXTRA > 8){ 
            EXTRA8=EXTRA-8;
            SALARIO = 40*VALOR+16*VALOR+EXTRA8*3*VALOR;
    } else {
            SALARIO = 40 *HORAS+EXTRA*2*HORAS;
                    }      
} else {
        SALARIO = HORAS*EXTRA; 
    }
    System.out.println("EL TRABAJADOR "+NOM+" DEVENGÓ: $"+SALARIO);
    } 
}
    
  
