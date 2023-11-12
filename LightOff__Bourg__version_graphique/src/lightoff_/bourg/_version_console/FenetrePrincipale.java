/*
 * Emilie Bourg
 * 12/11/2023
 * TDC
 * Fenetre principale, permer d'afficher une fenetre contenant la grille de jeu
 */
package lightoff_.bourg._version_console;

import FenetreVictoire.FenetreVictoire;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 * Argument de la grille et création de celle-ci
 * @author Emilie
 */
public class FenetrePrincipale extends javax.swing.JFrame {
    private Timer timer;
    GrilleDeCellules grille;
    int nbcoups;
    int i;


    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents(); 
        nombrecoups.setVisible(false);
    }
    
    /**
     * Arrange la fenetre avec parametres
     * @param nb_case nombre de case sur une lignes ou une colonne
     * @param taille_grille en pixel
     * @param petit_espace pour espacer les boutons de la grille
     * @param taille_cellule en pixel
     * @param dern_diag pixel pour placer la diagonale
     */
    public void créer_grille(int nb_case, int taille_grille, int petit_espace, int taille_cellule, int dern_diag){
        int nbLignes = nb_case;
        int nbColonnes = nb_case;
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(taille_grille, taille_grille, nbColonnes*taille_cellule, nbLignes*taille_cellule));
        this.pack();
        this.revalidate();
        grille=new GrilleDeCellules(nbLignes,nbColonnes);
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        
        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
            getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(petit_espace, taille_grille, 1 * taille_cellule, nbLignes * taille_cellule));
        this.pack();
        this.revalidate();
        
        PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, nbColonnes));
            getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(taille_grille, petit_espace, nbColonnes * taille_cellule, 1 * taille_cellule));
        this.pack();
        this.revalidate();
        
        diagonaledescendante.setLayout(new GridLayout(1,1));
        getContentPane().add(diagonaledescendante, new org.netbeans.lib.awtextra.AbsoluteConstraints(petit_espace, petit_espace, 1 * taille_cellule, 1 * taille_cellule));
        this.pack();
        this.revalidate();
        
        diagonalemontante.setLayout(new GridLayout(1,1));
        int position;
        position = nbColonnes*dern_diag;
        getContentPane().add(diagonalemontante, new org.netbeans.lib.awtextra.AbsoluteConstraints(petit_espace, position, 1 * taille_cellule, 1 * taille_cellule));
        this.pack();
        this.revalidate();
        
        // création du panneau de boutons verticaux (pour les lignes)
        for ( i = 0; i < nbLignes; i++) { 
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() { 
                    final int j = i;
                    @Override 
                    public void actionPerformed(ActionEvent e) { 
                        grille.activerLigneDeCellules(j+1);
                        repaint(); 
                        finjeu();
                    } }; 
            bouton_ligne.addActionListener(ecouteurClick); 
            PanneauBoutonsVerticaux.add(bouton_ligne);

        }
        // création du panneau de boutons horizontaux (pour les colonnes)
        for ( i = 0; i < nbLignes; i++) { 
            JButton bouton_colonne = new JButton();
            ActionListener ecouteClick = new ActionListener() { 
                    final int j = i;
                    @Override 
                    public void actionPerformed(ActionEvent e) { 
                        grille.activerColonneDeCellules(j+1);
                        repaint(); 
                        finjeu();
                    } }; 
            bouton_colonne.addActionListener(ecouteClick); 
            PanneauBoutonsHorizontaux.add(bouton_colonne);

        }
        // création du bouton de la diagonale descendante
        JButton bouton_diagdesc = new JButton();
        ActionListener clique_bout = new ActionListener() { 
                    final int j = i;
                    @Override 
                    public void actionPerformed(ActionEvent e) { 
                        grille.activerDiagonaleDescendante();
                        repaint(); 
                        finjeu();
                    } }; 
            bouton_diagdesc.addActionListener(clique_bout); 
            diagonaledescendante.add(bouton_diagdesc);

            
        // création du bouton de la diagonale montante
        JButton bouton_diagmont = new JButton();
        ActionListener clique = new ActionListener() { 
            final int j = i;
            @Override 
            public void actionPerformed(ActionEvent e) { 
                grille.activerDiagonaleMontante();
                repaint(); 
                finjeu();
                } }; 
        bouton_diagmont.addActionListener(clique); 
        diagonalemontante.add(bouton_diagmont);

        
        // Crée la grille à partir des cellules graphiques
        for (int i=0; i < nbLignes; i++) { 
            for (int j=0; j < nbColonnes; j++ ) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(36, 36, grille.matriceCellules[i][j]);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
    }
    
    /**
     * Initialise une partie de jeu, mélange la grille et affiche le 
     * nombre de coups joués
     */
    public void initialiserPartie(){
        grille.melangerMatriceAleatoirement(80);
        while(grille.cellulesToutesEteintes()==true){
            grille.melangerMatriceAleatoirement(5);
        }
        nombrecoups.setVisible(true);
        nombrecoups.setText("Nombre de coups: "+nbcoups);
    } 
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        nombrecoups = new javax.swing.JLabel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        diagonaledescendante = new javax.swing.JPanel();
        diagonalemontante = new javax.swing.JPanel();
        facile = new javax.swing.JButton();
        moyen = new javax.swing.JButton();
        difficile = new javax.swing.JButton();
        debut_text = new javax.swing.JLabel();
        temps = new javax.swing.JPanel();
        case_diff = new javax.swing.JLabel();
        case_fac = new javax.swing.JLabel();
        case_moy = new javax.swing.JLabel();
        diff_plus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(2000, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 510, 450));

        nombrecoups.setText("Nombre de coups :");
        getContentPane().add(nombrecoups, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, -1, 30));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 70, 440));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 510, 50));

        javax.swing.GroupLayout diagonaledescendanteLayout = new javax.swing.GroupLayout(diagonaledescendante);
        diagonaledescendante.setLayout(diagonaledescendanteLayout);
        diagonaledescendanteLayout.setHorizontalGroup(
            diagonaledescendanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        diagonaledescendanteLayout.setVerticalGroup(
            diagonaledescendanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(diagonaledescendante, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, 40));

        javax.swing.GroupLayout diagonalemontanteLayout = new javax.swing.GroupLayout(diagonalemontante);
        diagonalemontante.setLayout(diagonalemontanteLayout);
        diagonalemontanteLayout.setHorizontalGroup(
            diagonalemontanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        diagonalemontanteLayout.setVerticalGroup(
            diagonalemontanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(diagonalemontante, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, 40));

        facile.setText("Niveau Facile");
        facile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facileActionPerformed(evt);
            }
        });
        getContentPane().add(facile, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 130, -1));

        moyen.setText("Niveau Moyen");
        moyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moyenActionPerformed(evt);
            }
        });
        getContentPane().add(moyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 130, -1));

        difficile.setText("Niveau Difficile");
        difficile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficileActionPerformed(evt);
            }
        });
        getContentPane().add(difficile, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 130, -1));

        debut_text.setText("Veuillez choisir la difficulté:");
        getContentPane().add(debut_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, -1, -1));

        javax.swing.GroupLayout tempsLayout = new javax.swing.GroupLayout(temps);
        temps.setLayout(tempsLayout);
        tempsLayout.setHorizontalGroup(
            tempsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        tempsLayout.setVerticalGroup(
            tempsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(temps, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, -1, -1));

        case_diff.setText("20 lignes/ 20 colonnes");
        getContentPane().add(case_diff, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, -1));

        case_fac.setText("10 lignes/ 10 colonnes");
        getContentPane().add(case_fac, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, -1, -1));

        case_moy.setText("15 lignes/ 15 colonnes");
        getContentPane().add(case_moy, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

        diff_plus.setText("+ Changement toutes les 5 sec");
        getContentPane().add(diff_plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facileActionPerformed
        créer_grille(10, 80, 20, 40, 50);
        initialiserPartie();
        debut_text.setVisible(false);
        facile.setVisible(false);
        moyen.setVisible(false);
        difficile.setVisible(false);
        case_fac.setVisible(false);
        case_moy.setVisible(false);
        case_diff.setVisible(false);
        diff_plus.setVisible(false);
    }//GEN-LAST:event_facileActionPerformed

    private void moyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moyenActionPerformed
        créer_grille(15, 72, 18, 36, 42);
        initialiserPartie();
        debut_text.setVisible(false);
        facile.setVisible(false);
        moyen.setVisible(false);
        difficile.setVisible(false);
        case_fac.setVisible(false);
        case_moy.setVisible(false);
        case_diff.setVisible(false);
        diff_plus.setVisible(false);
    }//GEN-LAST:event_moyenActionPerformed

    private void difficileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficileActionPerformed
        créer_grille(20, 60, 15, 30, 34);
        initialiserPartie();
        debut_text.setVisible(false);
        facile.setVisible(false);
        moyen.setVisible(false);
        difficile.setVisible(false);
        case_fac.setVisible(false);
        case_moy.setVisible(false);
        case_diff.setVisible(false);
        diff_plus.setVisible(false);
        
        temps.setLayout(new GridLayout(1,1));
        getContentPane().add(temps, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 100, 100));
        this.pack();
        this.revalidate();
        
        // Créer un ActionListener pour la tâche à effectuer toutes les 10 secondes
        ActionListener changement = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            SwingUtilities.invokeLater(() -> {
                grille.melangeMatrice(5);
                repaint(); 
            });
        }
    };
        // Créer un Timer avec un délai de 10 secondes
        timer = new Timer(10000, changement);
        timer.start();
    }//GEN-LAST:event_difficileActionPerformed

    private void finjeu(){
        nbcoups+=1;
        nombrecoups.setText("Nombre de coups: "+nbcoups);
        if (grille.cellulesToutesEteintes()==true){
            dispose();
            FenetreVictoire f = new FenetreVictoire();
            f.setVisible(true);
            timer.stop();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JLabel case_diff;
    private javax.swing.JLabel case_fac;
    private javax.swing.JLabel case_moy;
    private javax.swing.JLabel debut_text;
    private javax.swing.JPanel diagonaledescendante;
    private javax.swing.JPanel diagonalemontante;
    private javax.swing.JLabel diff_plus;
    private javax.swing.JButton difficile;
    private javax.swing.JButton facile;
    private javax.swing.JButton moyen;
    private javax.swing.JLabel nombrecoups;
    private javax.swing.JPanel temps;
    // End of variables declaration//GEN-END:variables
}
