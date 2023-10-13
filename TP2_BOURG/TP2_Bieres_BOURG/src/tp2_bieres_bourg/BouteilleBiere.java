/*
 *Emilie Bourg
 *TDC
 *Manipuler les class et les objets 
 *10 octobre 2023
 */
package tp2_bieres_bourg;

/**
 *
 * @author Emilie
 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    public void lireEtiquette(){
        System.out.println("Bouteille de "+nom+" ("+degreAlcool+" degres) \nBrasserie : "+brasserie);
    }
    public boolean Décapsuler(){
        if (ouverte ==false){
            ouverte = true;
            return true;
        } else{
            System.out.println("erreur : biere déjà ouverte");
            return false;
        }
    }
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie){ 
        nom = unNom; 
        degreAlcool = unDegre; 
        brasserie = uneBrasserie; 
        ouverte = false; 
    }
    
    @Override 
    public String toString() { 
        String chaine_a_retourner; 
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés)"
                + " Ouverte ? "; 
        if (ouverte == true ) chaine_a_retourner += "oui" ; 
        else chaine_a_retourner += "non" ; 
        return chaine_a_retourner ; }
}

