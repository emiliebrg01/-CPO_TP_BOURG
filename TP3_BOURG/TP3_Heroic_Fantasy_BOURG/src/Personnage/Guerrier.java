/*
 * Emilie Bourg
 * TDC
 * 23/10/2023
 * Sous class de personnage, permet de donner plus de précision pour les guerriers
 */
package Personnage;

/**
 *
 * @author Emilie
 */
public class Guerrier extends Personnage{
    boolean Acheval;

    public boolean isAcheval() {
        return Acheval;
    }

    public void setAcheval(boolean Acheval) {
        this.Acheval = Acheval;
    }
    
    public Guerrier(String nom, int vie, boolean cheval) {
        super(nom, vie);
        Acheval=cheval;
    }
    
}
