/*
 * Emilie Bourg
 * 06/11/2023
 * TDC
 * Fenetre principale, permer d'afficher une fenetre contenant la grille de jeu
 */
package lightoff_.bourg._version_console;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Emilie
 */
public class FenetrePrincipale extends javax.swing.JFrame {
    GrilleDeCellules grille;
    int nbcoups;
    int i;

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        int nbLignes = 10;
        int nbColonnes = 10;
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, nbColonnes*40, nbLignes*40));
        this.pack();
        this.revalidate();
        grille=new GrilleDeCellules(nbLignes,nbColonnes);
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        
        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
            getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
        
        PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, nbColonnes));
            getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();
        
        diagonaledescendante.setLayout(new GridLayout(1,1));
        getContentPane().add(diagonaledescendante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1 * 40, 1 * 40));
        this.pack();
        this.revalidate();
        
        diagonalemontante.setLayout(new GridLayout(1,1));
        getContentPane().add(diagonalemontante, new org.netbeans.lib.awtextra.AbsoluteConstraints(nbColonnes+20, 20, 1 * 40, 1 * 40));
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
            ActionListener ecouteurClick = new ActionListener() { 
                    final int j = i;
                    @Override 
                    public void actionPerformed(ActionEvent e) { 
                        grille.activerColonneDeCellules(j+1);
                        repaint(); 
                        finjeu();
                    } }; 
            bouton_colonne.addActionListener(ecouteurClick); 
            PanneauBoutonsHorizontaux.add(bouton_colonne);
        }
        // création du bouton de la diagonale descendante
        JButton bouton_diagdesc = new JButton();
        ActionListener ecouteurClick = new ActionListener() { 
                    final int j = i;
                    @Override 
                    public void actionPerformed(ActionEvent e) { 
                        grille.activerDiagonaleDescendante();
                        repaint(); 
                        finjeu();
                    } }; 
            bouton_diagdesc.addActionListener(ecouteurClick); 
            diagonaledescendante.add(bouton_diagdesc);
            
        // création du bouton de la diagonale montante
        JButton bouton_diagmont = new JButton();
        
        
        for (int i=0; i < nbLignes; i++) { 
            for (int j=0; j < nbColonnes; j++ ) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(36, 36, grille.matriceCellules[i][j]);
                bouton_cellule.setForeground(new java.awt.Color(255, 0, 51));
                bouton_cellule.setBackground(new java.awt.Color(255, 255, 255));
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
        initialiserPartie();
    }
    
    public void initialiserPartie(){
       grille.melangerMatriceAleatoirement(10);
       while(grille.cellulesToutesEteintes()==true){
           grille.melangerMatriceAleatoirement(5);
       }
       victoire.setVisible(false);
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
        victoire = new javax.swing.JLabel();
        nombrecoups = new javax.swing.JLabel();
        But = new javax.swing.JLabel();
        eteinte = new javax.swing.JLabel();
        allumée = new javax.swing.JLabel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        diagonaledescendante = new javax.swing.JPanel();
        diagonalemontante = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(255, 0, 51));

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

        victoire.setText("Bravo! Vous avez gagné");
        getContentPane().add(victoire, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 130, 30));

        nombrecoups.setText("Nombre de coups :");
        getContentPane().add(nombrecoups, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, -1, 30));

        But.setText("But : allumer toutes les cases");
        getContentPane().add(But, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        eteinte.setText("Eteinte : X");
        getContentPane().add(eteinte, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, 20));

        allumée.setText("Allumée : O");
        getContentPane().add(allumée, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, 20));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finjeu(){
        nbcoups+=1;
        But.setVisible(false);
        allumée.setVisible(false);
        eteinte.setVisible(false);
        nombrecoups.setText("Nombre de coups: "+nbcoups);
        if (grille.cellulesToutesEteintes()==true){
            victoire.setVisible(true);  
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
    private javax.swing.JLabel But;
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JLabel allumée;
    private javax.swing.JPanel diagonaledescendante;
    private javax.swing.JPanel diagonalemontante;
    private javax.swing.JLabel eteinte;
    private javax.swing.JLabel nombrecoups;
    private javax.swing.JLabel victoire;
    // End of variables declaration//GEN-END:variables
}
