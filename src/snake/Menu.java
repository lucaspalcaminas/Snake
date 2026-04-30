/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package snake;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.Timer;

/**
 *
 * @author lucpaland
 */
public class Menu extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu.class.getName());
    public int selectSpeed= 200;
    private int selectSize = 25;
    private InitGame initGamer;
    private Timer timer;
    private Menu menu;
    
    /**
     * Creates new form Menu
     */
    public Menu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); 
        
        
    }
    public void getMenu(){
        menuSelected();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Slow = new javax.swing.JButton();
        NewGame = new javax.swing.JButton();
        NormalVelocity = new javax.swing.JButton();
        Fast = new javax.swing.JButton();
        NormalSize = new javax.swing.JButton();
        Big = new javax.swing.JButton();
        Small = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu");

        Slow.setBackground(new java.awt.Color(37, 40, 46));
        Slow.setForeground(new java.awt.Color(37, 211, 102));
        Slow.setText("Slow");
        Slow.addActionListener(this::SlowActionPerformed);

        NewGame.setBackground(new java.awt.Color(255, 255, 0));
        NewGame.setText("New game");
        NewGame.addActionListener(this::NewGameActionPerformed);

        NormalVelocity.setBackground(new java.awt.Color(37, 40, 46));
        NormalVelocity.setForeground(new java.awt.Color(37, 211, 102));
        NormalVelocity.setText("Normal");
        NormalVelocity.addActionListener(this::NormalVelocityActionPerformed);

        Fast.setBackground(new java.awt.Color(37, 40, 46));
        Fast.setForeground(new java.awt.Color(37, 211, 102));
        Fast.setText("Fast");
        Fast.addActionListener(this::FastActionPerformed);

        NormalSize.setBackground(new java.awt.Color(37, 40, 46));
        NormalSize.setForeground(new java.awt.Color(37, 211, 102));
        NormalSize.setText("Normal");
        NormalSize.addActionListener(this::NormalSizeActionPerformed);

        Big.setBackground(new java.awt.Color(37, 40, 46));
        Big.setForeground(new java.awt.Color(37, 211, 102));
        Big.setText("Big");
        Big.addActionListener(this::BigActionPerformed);

        Small.setBackground(new java.awt.Color(37, 40, 46));
        Small.setForeground(new java.awt.Color(37, 211, 102));
        Small.setText("Small");
        Small.addActionListener(this::SmallActionPerformed);

        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Añadir Paredes?");
        jRadioButton1.addActionListener(this::jRadioButton1ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(137, 137, 137))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NormalVelocity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Slow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Big, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NormalSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Small, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addComponent(NewGame)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Slow)
                    .addComponent(Small))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NormalVelocity)
                    .addComponent(NewGame)
                    .addComponent(NormalSize))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fast)
                    .addComponent(Big))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SlowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlowActionPerformed
        slowButtonSelected();
        selectSpeed = 250;
    }//GEN-LAST:event_SlowActionPerformed

    private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameActionPerformed
        if (initGamer != null) {
        // 1. Si el que va a iniciar el juego es el Board, le pasamos los parámetros
            if (initGamer instanceof Board) {
                Board board = (Board) initGamer;
                board.setSpeed(this.selectSpeed);   // Aplica 150, 200 o 250
                board.setSquareSize(this.selectSize); // Aplica 15, 25 o 40
            }
            this.dispose(); 
            initGamer.initGame();
    }
    }//GEN-LAST:event_NewGameActionPerformed

    private void NormalVelocityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormalVelocityActionPerformed
        normalButtonSelected();
        selectSpeed = 200;
    }//GEN-LAST:event_NormalVelocityActionPerformed

    private void FastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FastActionPerformed
        fastButtonSelected();
        selectSpeed = 150;
    }//GEN-LAST:event_FastActionPerformed

    private void SmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SmallActionPerformed
        smallButtonSelected();
        selectSize = 16;
        
    }//GEN-LAST:event_SmallActionPerformed

    private void BigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BigActionPerformed
        BigButtonSelected();
        selectSize = 40;
    }//GEN-LAST:event_BigActionPerformed

    private void NormalSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NormalSizeActionPerformed
        normalButtonSelectedSize();
        selectSize = 25;
    }//GEN-LAST:event_NormalSizeActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (initGamer != null) {
        // Como sabemos que initGamer es en realidad el Board, 
        // le decimos a Java que lo trate como tal (esto es el cast)
        Board board = (Board) initGamer; 
        
        // Ahora ya puedes usar board.enableWalls sin errores
        // Usamos .isSelected() para que si lo marcas sea true y si lo desmarcas false
        board.enableWalls(jRadioButton1.isSelected()); 
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Menu dialog = new Menu(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Big;
    private javax.swing.JButton Fast;
    private javax.swing.JButton NewGame;
    private javax.swing.JButton NormalSize;
    private javax.swing.JButton NormalVelocity;
    private javax.swing.JButton Slow;
    private javax.swing.JButton Small;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
    
    
    public void slowButtonSelected() {
        Slow.setBackground(new Color(37, 211, 102));
        Slow.setForeground(new Color(37,40,46));
        
        NormalVelocity.setBackground(new Color(37, 40, 46));
        NormalVelocity.setForeground(new Color(37,211,102));
        
        Fast.setBackground(new Color(37, 40, 46));
        Fast.setForeground(new Color(37,211,102));
    }
    
    public void normalButtonSelected() {
        Slow.setBackground(new Color(37, 40, 46));
        Slow.setForeground(new Color(37,211,102));
        
        NormalVelocity.setBackground(new Color(37, 211, 102));
        NormalVelocity.setForeground(new Color(37, 40, 46));
        
        Fast.setBackground(new Color(37, 40, 46));
        Fast.setForeground(new Color(37,211,102));
    }
    
    public void fastButtonSelected() {
        Slow.setBackground(new Color(37, 40, 46));
        Slow.setForeground(new Color(37,211,102));
        
        NormalVelocity.setBackground(new Color(37, 40, 46));
        NormalVelocity.setForeground(new Color(37,211,102));
        
        Fast.setBackground(new Color(37,211,102));
        Fast.setForeground(new Color(37, 40, 46));
    }
    
    public void smallButtonSelected() {
        Small.setBackground(new Color(37, 211, 102));
        Small.setForeground(new Color(37,40,46));
        
        NormalSize.setBackground(new Color(37, 40, 46));
        NormalSize.setForeground(new Color(37,211,102));
        
        Big.setBackground(new Color(37, 40, 46));
        Big.setForeground(new Color(37,211,102));
    }
    
    public void normalButtonSelectedSize() {
        Small.setBackground(new Color(37, 40, 46));
        Small.setForeground(new Color(37,211,102));
        
        NormalSize.setBackground(new Color(37, 211, 102));
        NormalSize.setForeground(new Color(37, 40, 46));
        
        Big.setBackground(new Color(37, 40, 46));
        Big.setForeground(new Color(37,211,102));
    }
    
    public void BigButtonSelected() {
        Small.setBackground(new Color(37, 40, 46));
        Small.setForeground(new Color(37,211,102));
        
        NormalSize.setBackground(new Color(37, 40, 46));
        NormalSize.setForeground(new Color(37,211,102));
        
        Big.setBackground(new Color(37,211,102));
        Big.setForeground(new Color(37, 40, 46));
    }
    
    public void menuSelected() {
        setModal(true);
        setVisible(true);
    }
    public void setInitGamer(InitGame initGamer) {
        this.initGamer = initGamer;
    }

}
