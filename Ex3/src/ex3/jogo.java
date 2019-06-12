package ex3;
public class jogo extends javax.swing.JFrame {


    public jogo()
    {
        initComponents();
        setLocationRelativeTo(null);
    }

 
    public static int randInt(int min, int max) 
    {   
        java.util.Random rand = new java.util.Random(); 
        int randomNum = rand.nextInt((max - min) + 1) + min; 
        return randomNum; 
    }    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ped = new javax.swing.JRadioButton();
        pap = new javax.swing.JRadioButton();
        tes = new javax.swing.JRadioButton();
        caixa = new javax.swing.JLabel();
        jogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Pedra, papel ou tesoura?");

        buttonGroup1.add(ped);
        ped.setText("Pedra");
        ped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedActionPerformed(evt);
            }
        });

        buttonGroup1.add(pap);
        pap.setText("Papel");
        pap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papActionPerformed(evt);
            }
        });

        buttonGroup1.add(tes);
        tes.setText("Tesoura");
        tes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tesActionPerformed(evt);
            }
        });

        caixa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        caixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jogar.setText("Jogar");
        jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tes)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pap)
                                .addGap(40, 40, 40)
                                .addComponent(jogar))
                            .addComponent(ped)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(caixa, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(ped)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pap)
                    .addComponent(jogar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tes)
                .addGap(18, 18, 18)
                .addComponent(caixa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pedActionPerformed

    private void papActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_papActionPerformed

    private void tesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tesActionPerformed

    private void jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarActionPerformed
        if (ped.isSelected())
        {
            int computador = randInt(0, 2);
            switch (computador)
            {
                case 1:
                    caixa.setText("O computador jogou papel! Você perdeu :(");
                    break;
                case 2:
                    caixa.setText("O computador jogou tesoura! Você ganhou :D");
                    break;
                case 0:
                    caixa.setText("O computador jogou pedra! Empate :|");
                    break;
            }
        }
        
        if (pap.isSelected())
        {
            int computador = randInt(0, 2);
            switch (computador)
            {
                case 1:
                    caixa.setText("O computador jogou papel! Empate :|");
                    break;
                case 2:
                    caixa.setText("O computador jogou tesoura! Você perdeu :(");
                    break;
                case 0:
                    caixa.setText("O computador jogou pedra! Você ganhou :D");
                    break;
            }
        }
        
        if (tes.isSelected())
        {
            int computador = randInt(0, 2);
            switch (computador)
            {
                case 1:
                    caixa.setText("O computador jogou papel! Você ganhou :D");
                    break;
                case 2:
                    caixa.setText("O computador jogou tesoura! Empate :|");
                    break;
                case 0:
                    caixa.setText("O computador jogou pedra! Você perdeu :(");
                    break;
            }
        }
    }//GEN-LAST:event_jogarActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel caixa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jogar;
    private javax.swing.JRadioButton pap;
    private javax.swing.JRadioButton ped;
    private javax.swing.JRadioButton tes;
    // End of variables declaration//GEN-END:variables
}
