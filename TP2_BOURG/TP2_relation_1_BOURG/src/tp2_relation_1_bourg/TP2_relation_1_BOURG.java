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
public class TP2_relation_1_BOURG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 );
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ); 
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ); 
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ); 
        Personne bob = new Personne("Bobby", "Sixkiller"); 
        Personne reno = new Personne("Reno", "Raines"); 
        
        System.out.println("liste des voitures disponibles \n"+ uneClio + "\n" 
                + uneAutreClio + "\n" + une2008 + "\n" + uneMicra );
        
        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1 ; 
        uneClio.Proprietaire = bob ;
        bob.liste_voitures[1]= uneMicra;
        bob.nbVoitures = 2;
        uneMicra.Proprietaire = bob;
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0]+" et sa seconde voiture est "+bob.liste_voitures[1]);
        
        //reno.liste_voitures[0] = uneAutreClio ;
        //reno.nbVoitures = 1 ; 
        //uneAutreClio.Proprietaire = reno ;
        //reno.liste_voitures[1]= une2008;
        //reno.nbVoitures = 2;
        //une2008.Proprietaire = reno;
        //System.out.println("la premiere voiture de Reno est " + reno.liste_voitures[0]+" et sa seconde voiture est "+reno.liste_voitures[1]);
        System.out.println(bob.ajouter_voiture(uneClio));
        System.out.println(reno.ajouter_voiture(uneAutreClio));
    }
    
}
