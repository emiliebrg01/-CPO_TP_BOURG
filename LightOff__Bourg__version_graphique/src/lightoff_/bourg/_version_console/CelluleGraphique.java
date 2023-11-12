/*
 * Emilie Bourg
 * 12/11/2023
 * TDC
 * class CelluleGraphique, permer d'afficher une cellules graphique qui sera 
 * ensuite dans la grille
 */
package lightoff_.bourg._version_console;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Argument de la cellule et création de celle-ci
 * @author Emilie
 */
public class CelluleGraphique extends JButton{
    CelluleLumineuse celluleLumineuseAssociee;
    int largeur;
    int longueur;
    
    /**
     * Initialise la celulle graphique avec paramètres
     * @param larg largeur de la cellule
     * @param longu longueur de l cellule
     * @param cellasso associer eteint ou allumé à la bonne cellule associée
     */
    public CelluleGraphique(int larg, int longu, CelluleLumineuse cellasso){
        largeur=larg;
        longueur=longu;
        celluleLumineuseAssociee=cellasso;
    }
    
    // Methode gérant l'image de la cellule 
    @Override 
    protected void paintComponent(Graphics g) { 
        Image imageADessiner = null;
        if (celluleLumineuseAssociee.estEteint() == true) { 
            imageADessiner = new ImageIcon("allumee.png").getImage();
        } else { 
            imageADessiner = new ImageIcon("eteinte.png").getImage();
        }
        // Dessin de l'image dans le composant
        if (imageADessiner != null) { 
            g.drawImage(imageADessiner, 0, 0, this);
        }
    }
}
