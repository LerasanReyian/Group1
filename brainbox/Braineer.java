/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package brainbox;

import static brainbox.Login.uname;

/**
 *
 * @author User
 */
public class Braineer extends javax.swing.JFrame {

    private String username;

    public Braineer(String username) {
        this.username = username; // Store the username
        initComponents();
        welcomeUser();
    }

    private Braineer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void welcomeUser() {
        // Display a welcome message with the username
        gret.setText("Welcome, " + uname + "!");
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
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        toQuiz = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Review = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        boards = new javax.swing.JLabel();
        gret = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main.setkEndColor(new java.awt.Color(206, 92, 165));
        main.setkStartColor(new java.awt.Color(240, 122, 46));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Logout");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 60, 30));

        toQuiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toQuiz.setText("Take Quiz");
        toQuiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toQuizMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(toQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(toQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        main.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        Review.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Review.setText("Review Quiz");
        Review.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReviewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Review, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Review, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        main.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        boards.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boards.setText("Leaderboards");
        boards.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boardsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boards, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boards, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        main.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, 40));

        gret.setFont(new java.awt.Font("Verdana", 1, 44)); // NOI18N
        gret.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gret.setText("dawdaw");
        main.add(gret, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 490, -1));

        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReviewMouseClicked
        ReviewQuiz ri = new ReviewQuiz();
        ri.pack();
        ri.setVisible(true);
        ri.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ReviewMouseClicked

    private void boardsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boardsMouseClicked
        LeaderBoards li = new LeaderBoards();
        li.pack();
        li.setVisible(true);
        li.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_boardsMouseClicked

    private void toQuizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toQuizMouseClicked
        ChooseDifficulty ti = new ChooseDifficulty();
        ti.pack();
        ti.setVisible(true);
        ti.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_toQuizMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        Login ne = new Login();
        ne.pack();
        ne.setVisible(true);
        ne.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Braineer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Review;
    private javax.swing.JLabel boards;
    private javax.swing.JLabel gret;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private keeptoo.KGradientPanel main;
    private javax.swing.JLabel toQuiz;
    // End of variables declaration//GEN-END:variables
}
