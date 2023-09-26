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
    double celsius;
    double kelvin;
    Scanner sc = new Scanner(System.in);
    System.out.println("Saisissez une temperature en C que vous voulez convertir en Kelvin");
    celsius=sc.nextDouble();
    //kelvin = celsius + 273.15;
    kelvin = CelciusVersKelvin(celsius);
    System.out.println("Pour "+celsius+" C, la temperature vaut "+kelvin+" K");
    
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
