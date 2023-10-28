/*
 * Emilie Bourg
 * 27/10/2023
 * TDC
 * Lance la partie à l'aide des différentes class
 */
package lightoff_.bourg._version_console;

/**
 *
 * @author Emilie
 */
public class LightOff_Bourg_version_console {

    /**
     * Lance la partie avec une grille de taille désirée
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Partie jeu = new Partie(10,10);
        jeu.lancerPartie();
    }
}
