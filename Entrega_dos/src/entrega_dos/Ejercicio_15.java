package entrega_dos;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
    double A,B,C,D;
    Scanner input = new Scanner(System.in);
    System.out.println("Peso de la esfera A: ");
    A = input.nextDouble();
    System.out.println("Peso de la esfera B: ");
    B = input.nextDouble();
    System.out.println("Peso de la esfera C: ");
    C = input.nextDouble();
    System.out.println("Peso de la esfera D: ");
    D = input.nextDouble();
    

        if (A==B && A==C){
            if (D>A){
                System.out.println("La esfera D es la diferente y es de mayor peso"); 
            } else {
                System.out.println("La esfera D es la diferente y es de menor peso"); 
            }
                  
        } else{
            if (A==B && A==D){
                if (C>A){
                    
                    System.out.println("La esfera C es la diferente y es de mayor peso"); 
                } else {
                    System.out.println("La esfera C es la diferente y es de menor peso"); 
                }
                
            } else {
                if (A==C && A==D){
                    if (B>A){
                        System.out.println("La esfera B es la diferente y es de mayor peso"); 
                    } else {
                        System.out.println("La esfera B es la diferente y es de menor peso"); 
                    }
                
                } else {
                    if (A>B){
                        System.out.println("La esfera A es la diferente y es de mayor peso"); 
                    } else {
                        System.out.println("La esfera A es la diferente y es de menor peso"); 
                    }
                    
                }
                
                
                
                
                
                
                
            }
            
        }
            
    
    }
    
}
   