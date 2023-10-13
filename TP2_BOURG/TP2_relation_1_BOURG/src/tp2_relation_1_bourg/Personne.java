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
    int nbVoitures ; 
    Voiture [] liste_voitures ;
    
    public Personne(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
        liste_voitures = new Voiture [3];
        nbVoitures = 0;
    }
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if(voiture_a_ajouter.Proprietaire!=null || nbVoitures==3){
            return false;
        } else if (nbVoitures==0){
            liste_voitures[0]=voiture_a_ajouter;
            nbVoitures+=1;
            voiture_a_ajouter.Proprietaire = this;
            return true;
        } else {
            liste_voitures[nbVoitures-1]=voiture_a_ajouter;
            nbVoitures+=1;
            voiture_a_ajouter.Proprietaire = this;
            return true;
        }
    }
    
    @Override 
    public String toString () {
        return nom+" "+prenom; 
    }
}
