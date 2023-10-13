/*
 * Emilie Bourg
 * TDC
 * 13/10/2023
 * Manipuler la class avec le convertisseur de température
 */
package tp2_convertisseurobjet_bourg;

/**
 *
 * @author Emilie
 */
public class Convertisseur {
    int nbConversions;
    
    public Convertisseur () { 
        nbConversions = 0 ; 
    }
    
    public double CelciusVersKelvin (double tCelcius) {
        double kelvin;
        kelvin=tCelcius+273.15;  
        nbConversions+=1;
        return kelvin;   
    }
    public double KelvinVersCelcius (double tKelvin) {
        double celcius;
        celcius=tKelvin-273.15;    
        nbConversions+=1;
        return celcius;   
    }
    public double FarenheitVersCelcius (double tFarenheit) {
        double celcius;
        celcius=(tFarenheit-32)*(5/9); 
        nbConversions+=1;
        return celcius;   
    }
    public double CelciusVersFarenheit (double tCelcius) {
        double Farenheit;
        Farenheit=tCelcius*(9/5)+32;
        nbConversions+=1;
        return Farenheit;   
    }
    public double KelvinVersFarenheit (double tKelvin) {
        double Farenheit;
        Farenheit=(tKelvin-273.15)*(9/5)-32;   
        nbConversions+=1;
        return Farenheit;   
    }
    public double FarenheitVersKelvin (double tFarenheit) {
        double Kelvin;
        Kelvin=(tFarenheit-32)*(5/9)-273.15;   
        nbConversions+=1;
        return Kelvin;
    }
    
    @Override 
    public String toString () {
        return "nb de conversions "+ nbConversions; 
    }
}
