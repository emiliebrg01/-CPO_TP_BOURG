/*
 * Emilie Bourg
 * 25/10/2023
 * TDC
 * Class GrillesDeCellules représentant une cellule avec ses attributs et ses
 * méthodes
 */
package lightoff_.bourg._version_console;

/**
 * Cette classe permet d'afficher une grille de cellules 
 * lumineuses d'un nombre de lignes et colonnes choisies
 * @author Emilie
 */
public class GrilleDeCellules {
    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;
    
    /**
     * Permet de créer la grille avec le nombre de
     * colonnes et de lignes voulues et ajoute 
     * une cellule lumineuse dans chaque case 
     * @param ligne nombre de lignes voulues
     * @param colo nombre de colonnes voulues
     */
    public GrilleDeCellules (int ligne, int colo){
    nbLignes=ligne;
    nbColonnes=colo;
    matriceCellules=new CelluleLumineuse[nbLignes][nbColonnes];
    for (int i=0; i<nbLignes; i++){
        for (int j=0;j<nbColonnes;j++){
            matriceCellules[i][j]= new CelluleLumineuse();
        }
    }
}
    public void activerLigneDeCellules(int idLigne){
        for (int i=0;i<nbColonnes;i++){
            matriceCellules[idLigne-1][i].activerCellule();
        }
    }

    /**
     * Affiche la grille cotenant les cellules lumineuses
     * allumée ou non avec les numéros des lignes et colonnes
     * @return la grille correctement ajencée
     */
    @Override 
    public String toString () {
        String result="   |";
        String separe="\n----";
        for (int s=0;s<nbColonnes;s++){
            separe+="----";
        }
        for (int k=1; k<=nbColonnes; k++){
            result+=" "+k+" |";
        }
        result+=separe;
        for (int i = 0; i<nbLignes;i++){
            result+="\n "+(i+1)+" |";
            for(int j = 0; j<nbColonnes;j++){
                result+=" "+matriceCellules[i][j]+" |";
            }
            result+=separe;
        }
        return result;
    }

}
