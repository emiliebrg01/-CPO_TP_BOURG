/*
 * Emilie Bourg
 * 06/11/2023
 * TDC
 * Class GrillesDeCellules représentant une grille de cellule avec ses 
 * attributs et ses méthodes
 */
package lightoff_.bourg._version_console;
import java.util.Random;

/**
 * Cette class permet d'afficher une grille de cellules 
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

    /**
     * Eteint toutes les cellules de la grille
     */
    public void eteindreToutesLesCellules(){
        for (int i = 0; i<nbLignes;i++){
            for(int j = 0; j<nbColonnes;j++){
                matriceCellules[i][j].eteindreCellule();
            }       
        }
    }

    /**
     * Permet de vérifier si toutes les cellules sont éteintes
     * @return true si elles sont toutes éteintes et false sinon
     */
    public boolean cellulesToutesEteintes(){ 
        boolean rep=true;
        for (int i = 0; i<nbLignes;i++){
            for(int j = 0; j<nbColonnes;j++){
                if (matriceCellules[i][j].estEteint()==false){
                    rep=false;
                }
            }
        }
        return rep;
    }
    
    /**
     * Active toutes les cellules d'une ligne entrée en paramètre
     * (change leur état)
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne){
        for (int i=0;i<nbColonnes;i++){
            matriceCellules[idLigne-1][i].activerCellule();
        }
    }
    
    /**
     * Active toutes les cellules d'une colonne entrée en paramètre
     * (change leur état)
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne){
        for (int i=0; i<nbLignes; i++){
            matriceCellules[i][idColonne-1].activerCellule();
        }
    }
    
    /**
     * Active toutes les cellules de la diagonale descendante
     * (change leur état)
     */
    public void activerDiagonaleDescendante(){
        for (int i=0; i<nbLignes;i++){
            matriceCellules[i][i].activerCellule();
        }
    }
    
    /**
     * Active toutes les cellules de la diagonale montante
     * (change leur état)
     */
    public void activerDiagonaleMontante(){
        for (int i=0;i<nbLignes;i++){
            matriceCellules[i][nbLignes-1-i].activerCellule();
        }
    }
    
    /**
     * Active aléatoirement toutes les cellules d'une ligne, d'une colonne
     * ou d'une diagonale
     */
    public void activerLigneColonneOuDiagonaleAleatoire(){
        Random alea = new Random();
        int unnombreligne=alea.nextInt(nbLignes)+1;
        int unnombrecolo=alea.nextInt(nbColonnes)+1;
        int choix = alea.nextInt(4);
        if (choix==0){
            activerLigneDeCellules(unnombreligne);
        } else if(choix==1){
            activerColonneDeCellules(unnombrecolo);
        } else if(choix==2){
            activerDiagonaleDescendante();
        } else if (choix==3){
            activerDiagonaleMontante();
        }
    }
    
    /**
     * Utilise la méthode pour activer aléatoirement une ligne, une colonne
     * ou une diagonale pour mélanger la grlle de jeu, elle utilise cette 
     * méthode le nombre de fois entré en paramètre 
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours){
        eteindreToutesLesCellules();
        for (int i=0;i<nbTours;i++){
            activerLigneColonneOuDiagonaleAleatoire();
            
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
