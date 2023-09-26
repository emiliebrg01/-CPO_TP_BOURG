/*
 * Emilie Bourg
 * TDC
 * Prise en main et manipulation des nombres 
 * 26 septembre 2023
 */
package tp1_manipnombresint_bourg;

import java.util.Scanner;

/**
 *
 * @author Emilie
 */
public class TP1_manipNombresInt_BOURG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int nombre1 = 0;
    int nombre2 = 0;
    int somme = 0;
    int diff=0;
    int multi =0;
    int divi=0;
    int reste=0;
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Veuillez entrer un premier nombre entier");
    nombre1 = sc.nextInt();
    System.out.println("Veuillez entrer un second nombre entier");
    nombre2 = sc.nextInt();
    somme = nombre1 + nombre2;
    diff = nombre1 - nombre2;
    multi=nombre1*nombre2;
    divi=nombre1/nombre2;
    reste=nombre1%nombre2;
    System.out.println("La somme de ces 2 nombres est "+somme+"\nLa difference est "
            +diff+"\nLa multiplication est "+multi+"\nLa division est "+divi+
            "\nLe reste de cette division est "+reste);
    }
    
}
