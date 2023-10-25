/*
 * Emilie Bourg
 * 25/10/2023
 * TDC
 * Class GrillesDeCellules représentant une cellule avec ses attributs et ses
 * méthodes
 */
package lightoff_.bourg._version_console;

/**
 *
 * @author Emilie
 */
public class GrilleDeCellules {
    CelluleLumineuse[][] grille;
    int nbLignes;
    int nbColonnes;
    
public GrilleDeCellules (int ligne, int colo){
    nbLignes=ligne;
    nbColonnes=colo;
    grille=new CelluleLumineuse[nbLignes][nbColonnes];
    for (int i=0; i<nbLignes; i++){
        for (int j=0;j<nbColonnes;j++){
            grille[i][j]= 
        }
    }
}
}
