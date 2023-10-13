/*
 * Emilie Bourg
 * TDC
 * 13/10/2023
 * Manipuler les méthode et les class avec un convertisseur de température 
 */
package tp2_convertisseurobjet_bourg;

import java.util.Scanner;

/**
 *
 * @author Emilie
 */
public class TP2_convertisseurObjet_BOURG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        double temp;
        System.out.println("Entrer une température à convertir");
        temp = sc.nextDouble();
        
        int choix;
        System.out.println("La température entrée est en \n1 en Celsius \n2 en Kelvin \n3 en Farenheit \nEntrez 1, 2 ou 3");
        choix =sc.nextInt();
        
        if (choix==1){
            Convertisseur convertirC = new Convertisseur();
            System.out.println(convertirC.CelciusVersFarenheit (temp)+" F");
            System.out.println(convertirC.CelciusVersKelvin(temp)+" K");
            System.out.println(convertirC);
        } else if (choix==2){
            Convertisseur convertirK = new Convertisseur ();
            System.out.println(convertirK.KelvinVersCelcius(temp)+" C");
            System.out.println(convertirK.KelvinVersFarenheit(temp)+" F");
            System.out.println(convertirK);
        } else if(choix==3){
            Convertisseur convertirF = new Convertisseur ();
            System.out.println(convertirF.FarenheitVersCelcius(temp)+" C");
            System.out.println(convertirF.FarenheitVersKelvin(temp)+" K");
            System.out.println(convertirF);
        }
    }
    
}
