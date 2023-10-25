/*
 * Emilie Bourg
 * 25/10/2023
 * TDC
 * Class CelluleLumineuse représentant une cellule avec ses attributs et ses
 * méthodes
 */
package lightoff_.bourg._version_console;

/**
 * Cette classe permet d'afficher d'une cellule 
 * ainsi que de gérer son état (allumée ou éteinte)
 * @author Emilie
 */
public class CelluleLumineuse {
    private boolean etat;
    
    /**
     * Constructeur d'une cellule,
     * initialise toutes les cellules à éteint 
     * au moment de leur création
     */
    public CelluleLumineuse(){
        etat=false;
    }
    
    /**
     * Bascule etat de la cellule:
     * etat true devient false et
     * etat false devient true
     */
    public void activerCellule(){
        etat=!etat;
    }
    
    /**
     * Eteint la cellule, met son etat à false
     */
    public void eteindreCellule(){
        etat=false;
        }
    
    /**
     * Permet de savoir si la cellule est éteinte
     * @return true si elle est éteinte et
     * false si elle est allumée
     */
    public boolean estEteint(){
        return !etat;
    }
    
    /**
     * Permet de connaitre l'etat de la cellule 
     * (allumée ou éteinte)
     * @return true pour allumée et
     * false pour éteinte
     */
    public boolean getEtat(){
        return etat;
    }
    
    /**
     * Permet d'afficher les cellules en fonction 
     * de leur état
     * @return "X" si la cellule est allumée
     * et "O" si elle est éteinte
     */
    @Override 
    public String toString () {
        if (etat==true){
            return "X";
        } else {
            return "O";
        }
    }
}
