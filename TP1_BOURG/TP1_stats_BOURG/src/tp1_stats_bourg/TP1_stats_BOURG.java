/*
 *  Emilie Bourg
 * TDC
 * Probabilité de tomber sur une certaine face de dé
 * 5 octobre 2023
 */
package tp1_stats_bourg;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Emilie
 */
public class TP1_stats_BOURG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int face[]=new int[6];
    Scanner sc = new Scanner(System.in);
    int m;
    System.out.println("Entrez un nombre entier");
    m=sc.nextInt();
    
    for (int i=0; i<m ; i++){
        Random alea = new Random();
        int lancer = alea.nextInt(6);
        System.out.println(lancer);
        if (lancer==1){
            face[0]+=1;
        } else if(lancer==2){
            face[1]+=1;
        } else if(lancer==3){
            face[2]+=1;
        } else if(lancer==4){
            face[3]+=1;
        } else if(lancer==5){
            face[4]+=1;
        } else if(lancer==6){
            face[5]+=1;
        }
    }
    }
    
}
