/*
 * Emilie Bourg
 * TDC
 * 18/10/2023
 * Sous class de arme, permet de donner plus de précision pour les épées
 */
package Armes;


/**
 *
 * @author Emilie
 */
public class Epee extends Arme{
    int finesse;
    
    public Epee(String nom, int attaque, int finesse) {
        super(nom, attaque);
        this.finesse=finesse;
    }
    
}
