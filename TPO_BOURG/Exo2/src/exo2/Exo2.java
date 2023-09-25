/*
 * Emilie Bourg
 * TDC
 * Exos entrainement
 * 25 septembre 2023
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author Emilie
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Déclaration des variables 
    int nb; // nombre d'entier à additionner 
    int result; // resultat
    int ind; // indice
    
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Entrer le nombre :");
    nb=sc.nextInt(); // On demande a sc de donner le prochain entier
    
    result=0;
    
    //Addition des nb premiers entiers
    ind=1;
    while (ind <= nb) {
    result=result+ind;
    ind+=1;
    }
    
    // Affichage du resultat
    System.out.println();
    System.out.println("La somme des "+ nb + " entiers est: "+result);
    }
    
}
