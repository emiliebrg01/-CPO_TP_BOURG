/*
 * Emilie Bourg
 * 25/10/2023
 * TDC
 * 
 */
package lightoff_.bourg._version_console;

/**
 *
 * @author Emilie
 */
public class LightOff_Bourg_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GrilleDeCellules grille1 = new GrilleDeCellules (10, 10);
        /*grille1.activerLigneDeCellules(5);
        grille1.activerColonneDeCellules(6);
        grille1.activerDiagonaleDescendante();
        grille1.activerDiagonaleMontante();*/
        System.out.println(grille1.cellulesToutesEteintes());
        grille1.melangerMatriceAleatoirement(2);
        System.out.println(grille1);
        System.out.println(grille1.cellulesToutesEteintes());
    }
}
