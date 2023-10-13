/*
 * Emilie Bourg
 * TDC
 * 13/10/2023
 * 
 */
package tp2_manip_bourg;

/**
 *
 * @author Emilie
 */
public class TP2_manip_Bourg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ; 
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        System.out.println(assiette3.nbCalories);
        assiette2.nbCalories = 700;
        System.out.println(assiette3.nbCalories);
        /** les assiettes 2 et 3 référence bien le même objet**/
        System.out.println(assiette2);
        System.out.println(assiette1);
        assiette2 = assiette1;
        assiette1 = assiette3; /*comme les assiettes 3 et 2 sont les mêmes*/
        System.out.println(assiette2);
        System.out.println(assiette1);
        
        /*
        Moussaka assiette666 = assiette1 ; 
        Moussaka assiette667 = new Tartiflette() ;
        Ces deux lignes sont incorrectes, il est indiqué que le type est 
        incompatible.
        une référence objet qui annonce référencer un type d’objet ne peut donc
        pas en référencer un autre qui n’a aucun rapport.
        */
        
        Moussaka Tableau_moussaka []=new Moussaka [10];
        for (int i=0; i<Tableau_moussaka.length;i++){
            Tableau_moussaka[i]= new Moussaka(i*100);
            System.out.println(Tableau_moussaka[i]);
        }
        /* Dernière question: Oui logiquement ça parait possible*/
    }
    
}
