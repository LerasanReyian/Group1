/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package brainbox;

import static brainbox.Login.uname;
import static java.lang.reflect.Array.get;
import static java.nio.file.Paths.get;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import static javax.swing.UIManager.get;

/**
 *
 * @author User
 */
public class BrainMaster extends javax.swing.JFrame {

     // Store the username
    private int quizDuration; // Store quiz timer duration in minutes
    private String selectedDifficulty; // Difficulty for the quiz
    private String selectedCategory; // Category for the quiz

    public BrainMaster(String username) {
        initComponents();
        welcomeUser();
    }

    private void welcomeUser() {
        wel.setText("Welcome, " + uname + "!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        toCreate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        toBoard = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        access = new javax.swing.JLabel();
        wel = new javax.swing.JLabel();
        log = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main.setkEndColor(new java.awt.Color(206, 92, 165));
        main.setkStartColor(new java.awt.Color(240, 122, 46));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toCreate.setBackground(new java.awt.Color(204, 102, 0));
        toCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toCreate.setText("Create Quiz");
        toCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toCreateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(toCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(toCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        main.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 220, 40));

        toBoard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toBoard.setText("Leaderboards");
        toBoard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toBoardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(toBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(toBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        main.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 220, 40));

        access.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        access.setText("Account Access");
        access.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accessMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(access, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(access, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        main.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 220, 40));

        wel.setFont(new java.awt.Font("Verdana", 0, 44)); // NOI18N
        wel.setForeground(new java.awt.Color(255, 255, 255));
        wel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wel.setText("snsa");
        main.add(wel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 570, -1));

        log.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        log.setText("Logout");
        log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logMouseClicked(evt);
            }
        });
        main.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 100, 40));

        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toCreateMouseClicked
        this.dispose();
        createQuiz j = new createQuiz();
         j.pack();
         j.setVisible(true);
         j.setLocationRelativeTo(null);
    }//GEN-LAST:event_toCreateMouseClicked

    private void toBoardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toBoardMouseClicked
        LeaderBoards li = new LeaderBoards();
        li.pack();
        li.setVisible(true);
        li.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_toBoardMouseClicked

    private void accessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accessMouseClicked
        AccountAccess ac = new AccountAccess();
        ac.pack();
        ac.setVisible(true);
        ac.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_accessMouseClicked

    private void logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Login ni = new Login();
        ni.pack();
        ni.setVisible(true);
        ni.setLocationRelativeTo(null);
    }//GEN-LAST:event_logMouseClicked

   

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new BrainMaster("defaultUser").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel access;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel log;
    private keeptoo.KGradientPanel main;
    private javax.swing.JLabel toBoard;
    private javax.swing.JLabel toCreate;
    private javax.swing.JLabel wel;
    // End of variables declaration//GEN-END:variables
}
