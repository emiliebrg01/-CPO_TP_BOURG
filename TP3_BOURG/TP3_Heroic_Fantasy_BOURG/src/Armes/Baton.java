/*
 * Emilie Bourg
 * TDC
 * 18/10/2023
 * Sous class de arme, permet de donner plus de précision pour les batons
 */
package Armes;

/**
 *
 * @author Emilie
 */
public class Baton extends Arme{
    int age;
    
    public Baton(String nom, int attaque, int age) {
        super(nom, attaque);
        this.age=age;
    }
    
}
