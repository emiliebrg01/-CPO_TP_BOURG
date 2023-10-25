/*
 * Emilie Bourg
 * 25/10/2023
 * TDC
 * 
 */
package lightoff_.bourg._version_console;

/**
 *
 * @author Emilie
 */
public class LightOff_Bourg_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CelluleLumineuse la1 = new CelluleLumineuse ();
        CelluleLumineuse la2 = new CelluleLumineuse ();
        CelluleLumineuse la3 = new CelluleLumineuse ();
        
        la2.activerCellule();
        
        System.out.println(la1+" "+la2+" "+la3);
        GrilleDeCellules grille1 = new GrilleDeCellules (10, 10);
        grille1.activerLigneDeCellules(5);
        System.out.println(grille1);
    
    }
}
