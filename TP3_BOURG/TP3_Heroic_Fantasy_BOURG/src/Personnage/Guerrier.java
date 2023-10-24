/*
 * Emilie Bourg
 * TDC
 * 24/10/2023
 * Sous class de personnage, permet de donner plus de précision pour les guerriers
 */
package Personnage;

/**
 *
 * @author Emilie
 */
public class Guerrier extends Personnage{
    boolean Acheval;
    static int nb_guerrier=0;

    public boolean isAcheval() {
        return Acheval;
    }

    public void setAcheval(boolean Acheval) {
        this.Acheval = Acheval;
    }
    
    public Guerrier(String nom, int vie, boolean cheval) {
        super(nom, vie);
        Acheval=cheval;
        nb_guerrier+=1;
    }
    
    public void finalize() {
        nb_guerrier-=1;
    }
}
