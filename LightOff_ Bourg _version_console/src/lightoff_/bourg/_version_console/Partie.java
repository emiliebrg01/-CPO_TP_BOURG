/*
 * Emilie Bourg
 * 27/10/2023
 * TDC
 * Class partie, permet d'initialiser et lancer une partie de jeu
 */
package lightoff_.bourg._version_console;

import java.util.Scanner;

/**
 * class initialisant la partie et utilisant une boucles pour jouer
 * @author Emilie
 */
public class Partie {
   GrilleDeCellules grille;
   int nbcoups;
   
    /**
     * Crée la partie: construie la grille avec ligne et colonne voulues 
     * et initialise le nombre de coups
     * @param nbligne
     * @param nbcolonne
     */
    public Partie(int nbligne, int nbcolonne){
       grille=new GrilleDeCellules(nbligne,nbcolonne);
       nbcoups=0;
   }
   
    /**
     * Initialise la partie en mélangeant la grille de départ
     */
    public void initialiserPartie(){
       grille.melangerMatriceAleatoirement(5);
       while(grille.cellulesToutesEteintes()==true){
           grille.melangerMatriceAleatoirement(5);
       }
       System.out.println(grille);
   }
   
    /**
     * Boucle permettant de jouer, permet de faire son coups et 
     * incrémente son nombre, affiche bravo et le nombre de coup lorsque la 
     * partie est finie
     */
    public void lancerPartie(){
       initialiserPartie();
       while (grille.cellulesToutesEteintes()==false){
           coupjoué();
           nbcoups+=1;
           System.out.println(grille);
       }
       System.out.println("Bravo! Vous avez gagné en "+nbcoups+" coups");
   }
   
    /**
     * Permet de jouer le coups que l'on souhaite en fonction des caractères 
     * entrés.
     */
    public void coupjoué (){
       String coup;
       Scanner sc = new Scanner(System.in);
       System.out.println("Veuillez entrer votre coup; \nLa ligne ou la colonne"
               + " avec <<c>> ou <<l>>"
               + "\n<<d1>> pour la diagonale descendante"
               + "\n<<d2>> pour la diagonale montante");
       coup=sc.nextLine();
       if (coup.equals("d1")){
           grille.activerDiagonaleDescendante();
       } else if (coup.equals("d2")){
           grille.activerDiagonaleMontante();
       } else if (coup.equals("l")){
           int ligne;
           System.out.println("Veuillez entrez le chiffre de la ligne choisie");
           ligne=sc.nextInt();
           grille.activerLigneDeCellules(ligne);
       } else if (coup.equals("c")){
           int colonne;
           System.out.println("Veuillez entrez le chiffre de la colonne choisie");
           colonne=sc.nextInt();
           grille.activerColonneDeCellules(colonne);
       }
   }
}
