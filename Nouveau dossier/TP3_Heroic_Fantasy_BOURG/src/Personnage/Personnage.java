/*
 * Emilie Bourg
 * TDC
 * 18/10/2023
 * class personnage, attribut principaux des persos
 */
package Personnage;

/**
 *
 * @author Emilie
 */
public abstract class Personnage {
    String nom;
    int niveau_vie;
    
    public Personnage(String nom, int vie){
        this.nom=nom;
        niveau_vie=vie;
    }
    
     @Override 
    public String toString () {
        return "\nLe personnage "+nom+" a un niveau de vie de "+niveau_vie; 
    }
}
