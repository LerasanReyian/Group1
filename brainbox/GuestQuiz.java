/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package brainbox;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collectors;

public class GuestQuiz extends javax.swing.JFrame {

    private static final String filepath = "C:\\Users\\User\\Documents\\NetBeansProjects\\brainBox\\src\\brainbox\\DataBase\\Bash.json";
    private JSONArray quizData; // Loaded quiz data
    private List<JSONObject> questions; // Shuffled questions
    private int currentIndex = 0; // Current question index
    private int score = 0; // User score
    private Timer timer;
    private int timeRemaining; // Time remaining in seconds

    public GuestQuiz() {
        initComponents();
        loadQuizData();
        startQuiz();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        timeLabel = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        question = new javax.swing.JLabel();
        identify = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        give = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(206, 92, 165));
        kGradientPanel1.setkStartColor(new java.awt.Color(240, 122, 46));

        timeLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setText("TimeLeft:");

        kGradientPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Question", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        kGradientPanel3.setkEndColor(new java.awt.Color(206, 92, 165));
        kGradientPanel3.setkStartColor(new java.awt.Color(240, 122, 46));

        question.setBackground(new java.awt.Color(255, 255, 255));
        question.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        question.setForeground(new java.awt.Color(255, 255, 255));
        question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question.setText("jLabel2");

        identify.setText("Type Here...");
        identify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                identifyMouseClicked(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(0, 211, Short.MAX_VALUE)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                                .addComponent(identify, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(207, 207, 207))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                                .addComponent(submit)
                                .addGap(251, 251, 251))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                        .addComponent(question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(identify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(submit)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        give.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        give.setForeground(new java.awt.Color(255, 255, 255));
        give.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        give.setText("Powered by: NitroCookie");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(give, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timeLabel)
                .addGap(410, 410, 410))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(give, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void identifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identifyMouseClicked
        identify.setText("");
    }//GEN-LAST:event_identifyMouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        submitAnswer();
    }//GEN-LAST:event_submitActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
        Mainmenu ni = new Mainmenu();
        ni.pack();
        ni.setVisible(true);
        ni.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel1MouseClicked
    private void loadQuizData() {
        try (FileReader reader = new FileReader(filepath)) {
            JSONParser parser = new JSONParser();
            JSONObject jsonData = (JSONObject) parser.parse(reader);
            quizData = (JSONArray) jsonData.get("quiz");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading quiz data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void startQuiz() {
        // Filter only finalized quizzes
        questions = (List<JSONObject>) quizData.stream()
                .filter(obj -> obj instanceof JSONObject)
                .map(obj -> (JSONObject) obj)
                .collect(Collectors.toList());

        // Shuffle questions and set the timer
        Collections.shuffle(questions);
        startTimer(300); // 300 seconds = 5 minutes
        displayQuestion();
    }

    private void displayQuestion() {
        if (currentIndex < questions.size()) {
            JSONObject currentQuestion = questions.get(currentIndex);
            question.setText((String) currentQuestion.get("question"));
        } else {
            endQuiz();
        }
    }

    private void submitAnswer() {
        if (currentIndex < questions.size()) {
            JSONObject currentQuestion = questions.get(currentIndex);
            String correctAnswer = ((String) currentQuestion.get("answer")).trim().toLowerCase();
            String userAnswer = identify.getText().trim().toLowerCase();

            if (correctAnswer.equals(userAnswer)) {
                score += Integer.parseInt(currentQuestion.get("points").toString());
            }
            currentIndex++;
            displayQuestion();
        } else {
            endQuiz();
        }
    }

    private void startTimer(int durationInSeconds) {
        timeRemaining = durationInSeconds;
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (timeRemaining > 0) {
                    int minutes = timeRemaining / 60;
                    int seconds = timeRemaining % 60;
                    timeLabel.setText(String.format("Time Left: %02d:%02d", minutes, seconds));
                    timeRemaining--;
                } else {
                    timer.cancel();
                    endQuiz();
                }
            }
        }, 0, 1000);
    }

    private void endQuiz() {
        timer.cancel();
        JOptionPane.showMessageDialog(this, "Time's up! Your score: " + score, "Quiz Completed", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new GuestQuiz().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel give;
    private javax.swing.JTextField identify;
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel question;
    private javax.swing.JButton submit;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
