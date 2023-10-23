/*
 * Emilie Bourg
 * TDC
 * 18/10/2023
 * Class objet, attributs principaux de chaques armes
 */
package Armes;

/**
 *
 * @author Emilie
 */
public abstract class Arme {
    String nom;
    int niveau_att;
    
    public Arme(String nom, int attaque){
        this.nom=nom;
        niveau_att=attaque;
    }
    
    @Override 
    public String toString () {
        return "\nL'arme "+nom+" a un niveau d'attaque de "+niveau_att; 
    }
}
