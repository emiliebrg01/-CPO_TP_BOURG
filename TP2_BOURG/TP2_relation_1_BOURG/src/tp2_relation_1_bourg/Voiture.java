/*
 * Emilie Bourg
 * TDC
 * 13/10/2023
 * Manipuler et lier différents objets entre eux, exemple avec des voitures 
 */
package tp2_relation_1_bourg;

/**
 *
 * @author Emilie
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
    public Voiture(String modele, String marque, int puiss){
        Modele=modele;
        Marque=marque;
        PuissanceCV=puiss;
        Proprietaire=null;
    }
    @Override 
    public String toString () {
        return "Le modele "+Modele+" de "+Marque+" avec "+PuissanceCV+" CV"; 
    }
}
