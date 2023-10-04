/*
 * * Emilie Bourg
 * TDC
 *
 * 4 octobre 2023
 */
package tp1_guessmynumber_bourg;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Emilie
 */
public class TP1_guessMyNumber_BOURG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choixmode;
        System.out.println("Entrez un mode de jeu: \n1 pour facile \n2 pour moyen \n3 pour difficile");
        choixmode=sc.nextInt();
        
        int nombre;
        Random alea = new Random();
        int n1 = alea.nextInt(100);
              System.out.println("Entrez un nombre entre 0 et 100");
        nombre = sc.nextInt();
        int result;
        
        if (choixmode==1){
            result=modefacile(nombre,n1);
            System.out.println("Vous avez gagne en " + result + " coups");
        }
    }

    public static int modefacile(int nombrej, int nombreo) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (nombreo != nombrej) {
            if (nombreo < nombrej) {
                System.out.println("trop grand, choisir un autre nombre:");
                nombrej = sc.nextInt();
                i += 1;
            } else if (nombreo > nombrej) {
                System.out.println("trop petit, choisir un autre nombre:");
                nombrej = sc.nextInt();
                i += 1;
            }
        }
        return i;
    }
    
    public static int modemoyen(int nombrej, int nombreo) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (nombreo != nombrej && i!=10) {
            if (nombreo < nombrej) {
                System.out.println("trop grand, choisir un autre nombre:");
                nombrej = sc.nextInt();
                i += 1;
            } else if (nombreo > nombrej) {
                System.out.println("trop petit, choisir un autre nombre:");
                nombrej = sc.nextInt();
                i += 1;
            }
        } if (i==10){
            return 2;
        }
        return i;
    }
    
    public static int modedifficile(int nombrej, int nombreo) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (nombreo != nombrej) {
            if (nombreo < nombrej) {
                System.out.println("trop grand, choisir un autre nombre:");
                nombrej = sc.nextInt();
                i += 1;
            } else if (nombreo > nombrej) {
                System.out.println("trop petit, choisir un autre nombre:");
                nombrej = sc.nextInt();
                i += 1;
            }
        }
        return i;
    }
}
