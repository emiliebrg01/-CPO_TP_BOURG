/*
 * Emilie Bourg
 * TDC
 * Création d'un convertisseur de températures en utilisant différentes méthodes
 * 26 septembre 2023
 */
package tp1_convertisseur_bourg;

import java.util.Scanner;

/**
 *
 * @author Emilie
 */
public class TP1_convertisseur_BOURG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double temp;
    int choix;
    Scanner sc = new Scanner(System.in);
    System.out.println("Saisissez une temperature que vous voulez convertir dans une autre unite");
    temp=sc.nextDouble();
    //kelvin = celsius + 273.15;
    System.out.println("""
                       Saisissez la conversion que vous souhaiter effectuer : 
                       1 pour Celcius vers Kelvin 
                       2 pour Kelvin vers Celcius 
                       3 pour Farenheit vers Celcius 
                       4 pour Celcius vers Farenheit 
                       5 pour Kelvin vers Farenheit 
                       6 pour Farenheit vers Kelvin""");
    choix=sc.nextInt();
    while (choix!=1 && choix!=2 && choix!=3 && choix!=4 && choix!=5 && choix!=6){
        System.out.println("le chiffre entre ne correspond à aucune posibilite, veuillez en entrer un autre");
        choix=sc.nextInt();
    }
    if (choix==1){
        System.out.println("Pour "+temp+" C, la temperature vaut "+CelciusVersKelvin(temp)+" K");
    } else if (choix==2){
        System.out.println("Pour "+temp+" K, la temperature vaut "+KelvinVersCelcius(temp)+" C");
    } else if (choix==3){
        System.out.println("Pour "+temp+" F, la temperature vaut "+FarenheitVersCelcius(temp)+" C");
    } else if (choix==4){
        System.out.println("Pour "+temp+" C, la temperature vaut "+CelciusVersFarenheit(temp)+" F");
    } else if (choix==5){
         System.out.println("Pour "+temp+" K, la temperature vaut "+KelvinVersFarenheit(temp)+" F");
    } else if (choix==6){
        System.out.println("Pour "+temp+" F, la temperature vaut "+FarenheitVersKelvin(temp)+" K");
    }
    }
    
    public static double CelciusVersKelvin (double tCelcius) {
        double kelvin;
        kelvin=tCelcius+273.15;      
        return kelvin;   
    }
    public static double KelvinVersCelcius (double tKelvin) {
        double celcius;
        celcius=tKelvin-273.15;      
        return celcius;   
    }
    public static double FarenheitVersCelcius (double tFarenheit) {
        double celcius;
        celcius=(tFarenheit-32)*(5/9);      
        return celcius;   
    }
    public static double CelciusVersFarenheit (double tCelcius) {
        double Farenheit;
        Farenheit=tCelcius*(9/5)+32;      
        return Farenheit;   
    }
    public static double KelvinVersFarenheit (double tKelvin) {
        double Farenheit;
        Farenheit=(tKelvin-273.15)*(9/5)-32;      
        return Farenheit;   
    }
    public static double FarenheitVersKelvin (double tFarenheit) {
        double Kelvin;
        Kelvin=(tFarenheit-32)*(5/9)-273.15;      
        return Kelvin;
    }
}
