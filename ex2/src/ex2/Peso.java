package ex2;
import javax.swing.JOptionPane;

public class Peso extends javax.swing.JFrame {

   
    public Peso() 
    {
        initComponents();
        setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        caixa = new javax.swing.JTextField();
        botao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mercurio = new javax.swing.JRadioButton();
        venus = new javax.swing.JRadioButton();
        marte = new javax.swing.JRadioButton();
        jupiter = new javax.swing.JRadioButton();
        saturno = new javax.swing.JRadioButton();
        urano = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Peso na terra(kg):");

        caixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaActionPerformed(evt);
            }
        });

        botao.setText("Calcular peso");
        botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecione o Planeta:");

        buttonGroup1.add(mercurio);
        mercurio.setText("Mercúrio");
        mercurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mercurioActionPerformed(evt);
            }
        });

        buttonGroup1.add(venus);
        venus.setText("Vênus");
        venus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venusActionPerformed(evt);
            }
        });

        buttonGroup1.add(marte);
        marte.setText("Marte");
        marte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jupiter);
        jupiter.setText("Júpiter");
        jupiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupiterActionPerformed(evt);
            }
        });

        buttonGroup1.add(saturno);
        saturno.setText("Saturno");
        saturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturnoActionPerformed(evt);
            }
        });

        buttonGroup1.add(urano);
        urano.setText("Urano");
        urano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uranoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caixa))
                        .addGap(18, 18, 18)
                        .addComponent(botao))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(venus)
                    .addComponent(mercurio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marte)
                    .addComponent(jupiter))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urano)
                    .addComponent(saturno))
                .addGap(0, 51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao))
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mercurio)
                    .addComponent(marte)
                    .addComponent(saturno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(venus)
                    .addComponent(jupiter)
                    .addComponent(urano))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaActionPerformed
        
    }//GEN-LAST:event_caixaActionPerformed

    private void mercurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mercurioActionPerformed

      
    }//GEN-LAST:event_mercurioActionPerformed

    private void marteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marteActionPerformed

    }//GEN-LAST:event_marteActionPerformed

    private void venusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venusActionPerformed

    }//GEN-LAST:event_venusActionPerformed

    private void jupiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupiterActionPerformed

    }//GEN-LAST:event_jupiterActionPerformed

    private void saturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturnoActionPerformed
    
    }//GEN-LAST:event_saturnoActionPerformed

    private void uranoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uranoActionPerformed
   
    }//GEN-LAST:event_uranoActionPerformed

    
    private void botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoActionPerformed
    float c1; //caixa que recebe o valor do usuario
    c1 = Float.parseFloat(caixa.getText());
    if(mercurio.isSelected())
    {
      int result;
  
     c1 = Integer.parseInt(caixa.getText());
     result = (int) (c1*0.37);
     JOptionPane.showMessageDialog(null,"Seu peso em Mercúrio é: " + result + " kg ");
    }else
    if(venus.isSelected())
    {
     int result;
  
     c1 = Integer.parseInt(caixa.getText());
     result = (int) (c1*0.88);
     JOptionPane.showMessageDialog(null,"Seu peso em Vênus é: " + result + " kg ");
    }else
    if(marte.isSelected())
    {
     int result;
  
     c1 = Integer.parseInt(caixa.getText());
     result = (int) (c1*0.38);
     JOptionPane.showMessageDialog(null,"Seu peso em Marte é: " + result + " kg ");
    }else
    if(jupiter.isSelected())
    {
      int result;
  
      c1 = Integer.parseInt(caixa.getText());
     result = (int) (c1*2.64);
     JOptionPane.showMessageDialog(null,"Seu peso em Júpiter é: " + result + " kg ");
    }else
    if(saturno.isSelected())
    {
     int result;
  
      c1 = Integer.parseInt(caixa.getText());
     result = (int) (c1*1.15);
     JOptionPane.showMessageDialog(null,"Seu peso em Saturno é: " + result + " kg ");
    }else
    if(urano.isSelected())
    {
     int result;
  
     c1 = Integer.parseInt(caixa.getText());
     result = (int) (c1*1.17);
     JOptionPane.showMessageDialog(null,"Seu peso em Urano é: " + result + " kg ");
    }
    }//GEN-LAST:event_botaoActionPerformed

    public static void main(String args[]) 
    {
      
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new Peso().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField caixa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jupiter;
    private javax.swing.JRadioButton marte;
    private javax.swing.JRadioButton mercurio;
    private javax.swing.JRadioButton saturno;
    private javax.swing.JRadioButton urano;
    private javax.swing.JRadioButton venus;
    // End of variables declaration//GEN-END:variables
}
