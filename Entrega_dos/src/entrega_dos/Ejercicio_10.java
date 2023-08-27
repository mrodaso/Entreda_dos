package entrega_dos;

import javax.swing.JOptionPane;

public class Ejercicio_10 {
public static void main(String[] args) { 
String NI,NOM;
double PT,EST,MATR=50000;
NI=JOptionPane.showInputDialog("Número de inscripción");
NOM=JOptionPane.showInputDialog("Nombre");
EST=Integer.parseInt(JOptionPane.showInputDialog("Estrato Social"));
PT=Integer.parseInt(JOptionPane.showInputDialog("Patrimonio"));

if (PT>2000000 && EST>3) {
    MATR=(PT*0.03)+MATR;
    
}
JOptionPane.showMessageDialog(null,"El estudiante con número de inscripción "+NI+" y nombre "+NOM+ " debe pagar $"+Math.round(MATR));
}
}
