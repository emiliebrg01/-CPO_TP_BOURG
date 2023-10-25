/*
 * Emilie Bourg
 * TDC
 * 24/10/2023
 * Sous class de personnage, permet de donner plus de précision pour les magiciens
 */
package Personnage;

/**
 *
 * @author Emilie
 */
public class Magicien extends Personnage{
    boolean confirme;
    static int nb_mage=0;

    public boolean isConfirme() {
        return confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
    public Magicien(String nom, int vie, boolean confirm) {
        super(nom, vie);
        confirme=confirm;
        nb_mage+=1;}
    
    public void finalize() {
        nb_mage-=1;}
}
