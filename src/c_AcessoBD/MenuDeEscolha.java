/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_AcessoBD;

/**
 *
 * @author danie
 */
public class MenuDeEscolha extends javax.swing.JFrame {

    /**
     * Creates new form MenuDeEscolha
     */
    public MenuDeEscolha() {
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

        jLabel1 = new javax.swing.JLabel();
        btnInserirProduto = new javax.swing.JButton();
        btnConsultarProduto = new javax.swing.JButton();
        btnRelatorioProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(300, 200));
        setMinimumSize(new java.awt.Dimension(300, 200));
        setPreferredSize(new java.awt.Dimension(300, 200));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel1.setText("Qual é a sua Escolha?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 250, 30);

        btnInserirProduto.setText("Inserir Novo Produto");
        btnInserirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserirProduto);
        btnInserirProduto.setBounds(10, 60, 250, 30);

        btnConsultarProduto.setText("Consultar Produto por ID");
        btnConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarProduto);
        btnConsultarProduto.setBounds(10, 90, 250, 30);

        btnRelatorioProduto.setText("Ver Todos os Produtos");
        btnRelatorioProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRelatorioProduto);
        btnRelatorioProduto.setBounds(10, 120, 250, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirProdutoActionPerformed
        new C01_InserirProduto().setVisible(true);
    }//GEN-LAST:event_btnInserirProdutoActionPerformed

    private void btnConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProdutoActionPerformed
        new C02_ConsultarProduto().setVisible(true);
    }//GEN-LAST:event_btnConsultarProdutoActionPerformed

    private void btnRelatorioProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioProdutoActionPerformed
        new C03_RelatorioProduto().setVisible(true);
    }//GEN-LAST:event_btnRelatorioProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDeEscolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDeEscolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDeEscolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDeEscolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDeEscolha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarProduto;
    private javax.swing.JButton btnInserirProduto;
    private javax.swing.JButton btnRelatorioProduto;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}