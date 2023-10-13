/*
 * Emilie Bourg
 * TDC
 * 13/10/2023
 * Manipuler et lier différents objets entre eux, exemple avec des voitures 
 */
package tp2_relation_1_bourg;

/**
 *
 * @author Emilie
 */
public class Personne {
    String nom;
    String prenom;
    
    public Personne(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }
    @Override 
    public String toString () {
        return nom+" "+prenom; 
    }
}
