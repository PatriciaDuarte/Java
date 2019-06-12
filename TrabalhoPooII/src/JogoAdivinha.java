import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class JogoAdivinha extends javax.swing.JFrame 
{
    public JogoAdivinha()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        copo1 = new javax.swing.JCheckBox();
        copo2 = new javax.swing.JCheckBox();
        copo3 = new javax.swing.JCheckBox();
        jogar = new javax.swing.JButton();
        Imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JOGO DOS COPOS");
        setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        setMaximizedBounds(new java.awt.Rectangle(400, 0, 400, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Onde está a bola:");

        copo1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        copo1.setForeground(new java.awt.Color(255, 0, 0));
        copo1.setText("Copo 1");
        copo1.setBorderPainted(true);
        copo1.setBorderPaintedFlat(true);
        copo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copo1ActionPerformed(evt);
            }
        });

        copo2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        copo2.setForeground(new java.awt.Color(255, 0, 0));
        copo2.setText("Copo 2");
        copo2.setBorderPainted(true);
        copo2.setBorderPaintedFlat(true);
        copo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copo2ActionPerformed(evt);
            }
        });

        copo3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        copo3.setForeground(new java.awt.Color(255, 0, 0));
        copo3.setText("Copo 3");
        copo3.setBorderPainted(true);
        copo3.setBorderPaintedFlat(true);
        copo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copo3ActionPerformed(evt);
            }
        });

        jogar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jogar.setText("Jogar");
        jogar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 255), java.awt.Color.white, new java.awt.Color(255, 0, 0)));
        jogar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jogar.setFocusCycleRoot(true);
        jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarActionPerformed(evt);
            }
        });

        Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogo de copos e bola.gif"))); // NOI18N
        Imagem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 10, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(copo1)
                                .addGap(28, 28, 28)
                                .addComponent(copo2)
                                .addGap(33, 33, 33)
                                .addComponent(copo3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Imagem)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copo1)
                    .addComponent(copo2)
                    .addComponent(copo3))
                .addGap(29, 29, 29)
                .addComponent(jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copo1ActionPerformed

        copo2.setSelected(false);
        copo3.setSelected(false);
    }//GEN-LAST:event_copo1ActionPerformed

    private void copo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copo2ActionPerformed

        copo1.setSelected(false);
        copo3.setSelected(false);
    }//GEN-LAST:event_copo2ActionPerformed

    private void copo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copo3ActionPerformed

        copo2.setSelected(false);
        copo1.setSelected(false);

    }//GEN-LAST:event_copo3ActionPerformed

    private void jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarActionPerformed
        Random random = new Random();
        int x = random.nextInt(3);

        if (copo1.isSelected()) {
            if (x == 0) {
                
                new Copo1().setVisible(true);
                } else {
                JOptionPane.showMessageDialog(null, "VOCÊ ERROU!!!", "JOGO DOS COPOS", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "A BOLA ESTÁ NO COPO " + (x + 1), "JOGO DOS COPOS", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (copo2.isSelected()) {
            if (x == 1) {
                
                new Copo2().setVisible(true);
                } else {
                JOptionPane.showMessageDialog(null, "VOCÊ ERROU!!!", "JOGO DOS COPOS", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "A BOLA ESTÁ NO COPO " + (x + 1), "JOGO DOS COPOS", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (copo3.isSelected()) {
            if (x == 2) {
                  
                new Copo3().setVisible(true);
                
                } else {
               JOptionPane.showMessageDialog(null, "VOCÊ ERROU!!!", "JOGO DOS COPOS", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "A BOLA ESTÁ NO COPO " + (x + 1), "JOGO DOS COPOS", JOptionPane.WARNING_MESSAGE);
            }
        }


    }//GEN-LAST:event_jogarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoAdivinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoAdivinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoAdivinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoAdivinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoAdivinha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagem;
    private javax.swing.JCheckBox copo1;
    private javax.swing.JCheckBox copo2;
    private javax.swing.JCheckBox copo3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jogar;
    // End of variables declaration//GEN-END:variables
}
