/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmproject;

/**
 *
 * @author Arddhana Zhafran
 */
public class Pilihan extends javax.swing.JFrame {

    /**
     * Creates new form Pilihan
     */
    public Pilihan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonTransfer = new javax.swing.JButton();
        jButtonTarik = new javax.swing.JButton();
        jButtonSetor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSaldo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        jButtonTransfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonTransferMouseReleased(evt);
            }
        });
        jPanel1.add(jButtonTransfer);
        jButtonTransfer.setBounds(560, 170, 73, 23);

        jButtonTarik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonTarikMouseReleased(evt);
            }
        });
        jButtonTarik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTarikActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTarik);
        jButtonTarik.setBounds(20, 160, 73, 23);

        jButtonSetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonSetorMouseReleased(evt);
            }
        });
        jPanel1.add(jButtonSetor);
        jButtonSetor.setBounds(20, 220, 73, 23);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SETORAN");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 210, 190, 33);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PENARIKAN TUNAI");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 160, 190, 33);

        jButtonSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonSaldoMouseReleased(evt);
            }
        });
        jButtonSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaldoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSaldo);
        jButtonSaldo.setBounds(570, 350, 73, 23);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TRANSFER");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(440, 160, 140, 33);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Batal");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(500, 350, 140, 33);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 674, 449);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTarikMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTarikMouseReleased
        new Tarik().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonTarikMouseReleased

    private void jButtonTarikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTarikActionPerformed
        
    }//GEN-LAST:event_jButtonTarikActionPerformed

    private void jButtonSetorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSetorMouseReleased
        new Setor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSetorMouseReleased

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jButtonSaldoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSaldoMouseReleased
        new Password().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSaldoMouseReleased

    private void jButtonSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSaldoActionPerformed

    private void jButtonTransferMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTransferMouseReleased
        new Transfer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonTransferMouseReleased

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
            java.util.logging.Logger.getLogger(Pilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pilihan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSaldo;
    private javax.swing.JButton jButtonSetor;
    private javax.swing.JButton jButtonTarik;
    private javax.swing.JButton jButtonTransfer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
