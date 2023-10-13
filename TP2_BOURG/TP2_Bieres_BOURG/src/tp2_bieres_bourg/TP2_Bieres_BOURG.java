/*
 * Emilie Bourg
 * TDC
 * 
 * 10 octobre 2023
 */
package tp2_bieres_bourg;

/**
 *
 * @author Emilie
 */
public class TP2_Bieres_BOURG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson") ;
        uneBiere.lireEtiquette();
        
        BouteilleBiere unesecondBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        unesecondBiere.lireEtiquette();
        
        System.out.println(uneBiere.Décapsuler());
        System.out.println(unesecondBiere.Décapsuler());
    }
    
}
