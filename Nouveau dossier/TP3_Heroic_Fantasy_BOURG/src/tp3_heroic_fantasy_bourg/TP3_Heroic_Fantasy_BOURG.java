/*
 * Emilie Bourg
 * TDC
 * 23/10/2023
 * Création des différents objets
 */
package tp3_heroic_fantasy_bourg;

import Personnage.Personnage;
import Personnage.Magicien;
import Personnage.Guerrier;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author Emilie
 */
public class TP3_Heroic_Fantasy_BOURG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee exca = new Epee("Excalibur",7,5);
        Epee duran = new Epee("Durandal",4,7);
        Baton chene = new Baton("Chêne",4,5);
        Baton charm = new Baton("Charme", 5, 6);
        
        Magicien ganda = new Magicien("Gandalf",65,true);
        Magicien garci = new Magicien("Garcimore",44,false);
        Guerrier conan = new Guerrier("Conan", 78,false);
        Guerrier lanni= new Guerrier("Lannister", 45, true);
        
        ArrayList<Personnage>listperso = new ArrayList<Personnage>();
        listperso.add(ganda);
        listperso.add(garci);
        listperso.add(conan);
        listperso.add(lanni);
        System.out.println(listperso.toString());
        
        ArrayList<Arme> listarm = new ArrayList<Arme>();
        listarm.add(exca);
        listarm.add(duran);
        listarm.add(chene);
        listarm.add(charm);
        
        System.out.println(listarm.toString());
    }
        
    public static void ajout (ArrayList<Arme> listarm, Arme nouvelle_arme){    
    if (listarm.size()<4){
        listarm.add(nouvelle_arme);
    } else {
        System.out.println("La liste est pleine, impossible de rajouter!");
    }
  }
}
    
