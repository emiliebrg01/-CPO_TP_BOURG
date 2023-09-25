/*
 * Emilie Bourg
 * calculatrice 
 * 25 septembre 2023
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Emilie
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double resultat = 0;
    int operateur =0;
    Scanner sc = new Scanner (System.in);
    System.out.println("\n Entrez le chiffre de l'opération que vous voulez réaliser : \n1) add\n2) substract\n3) multiply\n4) divide\n5) modulo");
    operateur=sc.nextInt();
    
    while (operateur!=1 && operateur!=2 && operateur!=3 && operateur!=4 && operateur!=5){
    System.out.println("Veuillez entrez un chiffre correspondant à une opération");
    System.out.println("Entrez le chiffre de l'opération que vous voulez réaliser : \n1) add\n2) substract\n3) multiply\n4) divide\n5) modulo");
    operateur=sc.nextInt();
    }
    
    int operande1;
    System.out.println("\nEntrez le premier nombre : ");
    operande1=sc.nextInt();
    
     int operande2;
    System.out.println("\nEntrez le second nombre : ");
    operande2=sc.nextInt();
    
    if (operateur == 1){ 
        resultat = operande1 + operande2;
        }
    else if (operateur == 2){
        resultat = operande1 - operande2;
    }
    else if (operateur == 3){
        resultat = operande1 * operande2;
    }
    else if (operateur == 4){
        resultat = operande1 / operande2;
    }
    else if (operateur == 5){
        resultat = operande1 % operande2;
    }
    
    System.out.println(resultat);
    }

    private static void If(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
