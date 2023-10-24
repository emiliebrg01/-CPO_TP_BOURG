/*
 * Emilie Bourg
 * TDC
 * 24/10/2023
 * class personnage, attribut principaux des persos
 */
package Personnage;

import Armes.Arme;
import java.util.ArrayList;
import tp3_heroic_fantasy_bourg.etreVivant;

/**
 *
 * @author Emilie
 */
public abstract class Personnage implements etreVivant{
    String nom;
    int niveau_vie;
    Arme Arme_en_Main;
    ArrayList<Arme> inventaire;
    static int nb_perso=0;
    
    
    
    public Arme getArme_en_Main() {
        return Arme_en_Main;
    }    
    
    public Personnage(String nom, int vie){
        this.nom=nom;
        niveau_vie=vie;
        inventaire= new ArrayList<Arme>();
        Arme_en_Main=null;
        nb_perso+=1;
    }
    
    public void finalize() {
        nb_perso-=1;
    }
    
    public void ajouter_arme(Arme arme_aj) {
        if (inventaire.size()<4){
        inventaire.add(arme_aj);
    } else {
        System.out.println("La liste est pleine, impossible de rajouter!");}}
    
    public void seFatiguer(){
        niveau_vie-=10;}
    
    public boolean estVivant(){
        if(niveau_vie>0){
            return true;
        } else {
            return false;}}
    
    public void estAttaquéé(int points){
        niveau_vie -= points;
    }
    
    public void port_arme (Arme arme_cherch){
       for (int i=0; i<inventaire.size(); i++){
           if (arme_cherch == inventaire.get(i)){
               Arme_en_Main = inventaire.get(i);
               System.out.println("Arme prise en main");
           } 
       } if (Arme_en_Main==null){
           System.out.println("L'arme n'est pas dans l'inventaire");
       }
   }
    
     @Override 
    public String toString () {
        return "\nLe personnage "+nom+" a un niveau de vie de "+niveau_vie+" en main il a "+Arme_en_Main; 
    }
}
