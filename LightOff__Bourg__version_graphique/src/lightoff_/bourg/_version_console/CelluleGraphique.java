/*
 * Emilie Bourg
 * 06/11/2023
 * TDC
 * class CelluleGraphique, permer d'afficher une cellules qui sera ensuite dans
 * la grille
 */
package lightoff_.bourg._version_console;

import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Emilie
 */
public class CelluleGraphique extends JButton{
    CelluleLumineuse celluleLumineuseAssociee;
    int largeur;
    int longueur;
    
    public CelluleGraphique(int larg, int longu, CelluleLumineuse cellasso){
        largeur=larg;
        longueur=longu;
        celluleLumineuseAssociee=cellasso;
    }
    
    // Methode gérant le dessin de la cellule
    @Override 
    protected void paintComponent(Graphics g) { 
        super.paintComponent(g);
        this.setText(celluleLumineuseAssociee.toString());
    }
}
