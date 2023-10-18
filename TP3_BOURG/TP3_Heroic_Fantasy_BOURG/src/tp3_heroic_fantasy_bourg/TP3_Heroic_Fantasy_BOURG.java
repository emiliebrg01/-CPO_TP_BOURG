/*
 * Emilie Bourg
 * TDC
 * 18/10/2023
 * Création des différents objets
 */
package tp3_heroic_fantasy_bourg;

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
        
        ArrayList<Arme> listarm = new ArrayList<Arme>();
        listarm.add(exca);
        listarm.add(duran);
        listarm.add(chene);
        listarm.add(charm);
        
        System.out.println(listarm.toString());
    }
        
    
}
