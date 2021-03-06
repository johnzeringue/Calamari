/*
 * Copyright 2006-2016 CIRDLES.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cirdles.calamari.userInterface;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
import org.cirdles.calamari.Calamari;

/**
 *
 * @author James F. Bowring <bowring at gmail.com>
 */
public class AboutBox extends javax.swing.JDialog {

    private final static JDialog INSTANCE = new AboutBox(null, true);

    /**
     * Creates new form AboutBox
     *
     * @param parent
     * @param modal
     */
    private AboutBox(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initInstance();
        
    }

    private void initInstance() {
        setSizeAndCenter(400, 300);
        versionLabel.setText(Calamari.VERSION);
        buildDateLabel.setText(Calamari.RELEASE_DATE);
    }

    public static JDialog getInstance() {
        return INSTANCE;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        calamariLabel = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();
        buildDateLabel = new javax.swing.JLabel();
        visitGitHubButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calamariLabel.setBackground(new java.awt.Color(255, 51, 0));
        calamariLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        calamariLabel.setForeground(new java.awt.Color(255, 255, 255));
        calamariLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calamariLabel.setText("Calamari");
        calamariLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calamariLabel.setOpaque(true);
        jLayeredPane1.add(calamariLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 175, -1));

        versionLabel.setBackground(new java.awt.Color(255, 51, 0));
        versionLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        versionLabel.setForeground(new java.awt.Color(255, 255, 255));
        versionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        versionLabel.setText("Calamari");
        versionLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        versionLabel.setOpaque(true);
        jLayeredPane1.add(versionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 175, -1));

        buildDateLabel.setBackground(new java.awt.Color(255, 51, 0));
        buildDateLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        buildDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        buildDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buildDateLabel.setText("Calamari");
        buildDateLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buildDateLabel.setOpaque(true);
        jLayeredPane1.add(buildDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 175, -1));

        visitGitHubButton.setText("Visit us on GitHub");
        visitGitHubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitGitHubButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(visitGitHubButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 175, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visitGitHubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitGitHubButtonActionPerformed
        BrowserControl.showURI("https://github.com/bowring/Calamari");
    }//GEN-LAST:event_visitGitHubButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Metal look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Metal is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Motif".equals(info.getName())) { //Nimbus (original), Motif, Metal
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(org.cirdles.calamari.userInterface.CalamariUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AboutBox dialog = new AboutBox(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    /**
     *
     * @param preferredWidth
     * @param preferredHeight
     */
    private void setSizeAndCenter(int preferredWidth, int preferredHeight) {
        super.setSize(preferredWidth, preferredHeight);
        super.setPreferredSize(new Dimension(preferredWidth, preferredHeight));

        //Get the screen size
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        //Calculate the frame location
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;

        //Set the new frame location centered
        setLocation(x, y);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buildDateLabel;
    private javax.swing.JLabel calamariLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel versionLabel;
    private javax.swing.JButton visitGitHubButton;
    // End of variables declaration//GEN-END:variables
}
