/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;

/**
 *
 * @author Oliver Pedroso
 */
public class Calculadora extends javax.swing.JFrame {
    
    Historico telaHistorico = new Historico();
    public String resultado = "";
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);//tela fica centralizada
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jtfNumero2 = new javax.swing.JTextField();
        jtfResultado = new javax.swing.JTextField();
        jrbSomar = new javax.swing.JRadioButton();
        jrbSubtrair = new javax.swing.JRadioButton();
        jrbMultiplicacao = new javax.swing.JRadioButton();
        jrbDivisao = new javax.swing.JRadioButton();
        jlNumero1 = new javax.swing.JLabel();
        jlNumero2 = new javax.swing.JLabel();
        jtfNumero1 = new javax.swing.JTextField();
        jlResultado = new javax.swing.JLabel();
        jbExibeHistorico = new javax.swing.JButton();
        jbCalcular = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculadora"));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jtfNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumero2ActionPerformed(evt);
            }
        });

        jtfResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfResultadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbSomar);
        jrbSomar.setSelected(true);
        jrbSomar.setText("Soma");

        buttonGroup1.add(jrbSubtrair);
        jrbSubtrair.setText("Subtrair");

        buttonGroup1.add(jrbMultiplicacao);
        jrbMultiplicacao.setText("Multiplica????o");

        buttonGroup1.add(jrbDivisao);
        jrbDivisao.setText("Divis??o");

        jlNumero1.setText("N??mero 1");

        jlNumero2.setText("N??mero 2");

        jtfNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumero1ActionPerformed(evt);
            }
        });

        jlResultado.setText("Resultado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNumero1)
                            .addComponent(jlResultado)
                            .addComponent(jtfNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNumero2)
                            .addComponent(jtfNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbSubtrair)
                            .addComponent(jrbSomar)
                            .addComponent(jrbMultiplicacao)
                            .addComponent(jrbDivisao))
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlNumero1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbSomar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNumero2)
                            .addComponent(jrbSubtrair))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbMultiplicacao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlResultado)
                        .addGap(5, 5, 5))
                    .addComponent(jrbDivisao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jbExibeHistorico.setText("Exibir Historico");
        jbExibeHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExibeHistoricoActionPerformed(evt);
            }
        });

        jbCalcular.setBackground(new java.awt.Color(204, 255, 204));
        jbCalcular.setText("Calcular");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jbCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jbExibeHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jbExibeHistorico)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumero2ActionPerformed

    private void jtfResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfResultadoActionPerformed

    private void jtfNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumero1ActionPerformed

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
        String nr01 = jtfNumero1.getText();
        String nr02 = jtfNumero2.getText();
        float num1Convertido = Float.parseFloat(nr01);
        float num2Convertido = Float.parseFloat(nr02);
        String historico = "";
        
        if (jrbSomar.isSelected() == true) {
            resultado = (num1Convertido + num2Convertido) + "";
            historico = num1Convertido + " + " + num2Convertido + " = " + resultado;
        }
        if (jrbSubtrair.isSelected() == true) {
            resultado = (num1Convertido - num2Convertido) + "";
            historico = num1Convertido + " - " + num2Convertido + " = " + resultado;
        }
        if (jrbMultiplicacao.isSelected() == true) {
            resultado = (num1Convertido * num2Convertido) + "";
            historico = num1Convertido + " * " + num2Convertido + " = " + resultado;
        }
        if (jrbDivisao.isSelected() == true) {
            resultado = (num1Convertido / num2Convertido) + "";
            historico = num1Convertido + " / " + num2Convertido + " = " + resultado;
        }
        /*if (jtfNumero1 == null) {
            JOptionPane.showMessageDialog(this, "O numero 1 deve ser preenchido.");
        } 
        if (jtfResultado == null) {
            JOptionPane.showMessageDialog(this, "O numero 2 deve ser preenchido.");
        }*/
        
        jtfResultado.setText(resultado);
        telaHistorico.exibirHistorico(historico);
    }//GEN-LAST:event_jbCalcularActionPerformed
    
    private void jbExibeHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExibeHistoricoActionPerformed
       telaHistorico.setVisible(true);
    }//GEN-LAST:event_jbExibeHistoricoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JButton jbExibeHistorico;
    private javax.swing.JLabel jlNumero1;
    private javax.swing.JLabel jlNumero2;
    private javax.swing.JLabel jlResultado;
    private javax.swing.JRadioButton jrbDivisao;
    private javax.swing.JRadioButton jrbMultiplicacao;
    private javax.swing.JRadioButton jrbSomar;
    private javax.swing.JRadioButton jrbSubtrair;
    private javax.swing.JTextField jtfNumero1;
    private javax.swing.JTextField jtfNumero2;
    private javax.swing.JTextField jtfResultado;
    // End of variables declaration//GEN-END:variables
}
