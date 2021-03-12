/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_AcessoBD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class C02_ConsultarProduto extends javax.swing.JFrame {

    /**
     * Creates new form C02_ConsultarProduto
     */
    public C02_ConsultarProduto() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        descricao = new javax.swing.JLabel();
        idEscolhido = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        outputNome = new javax.swing.JTextField();
        outputPreco = new javax.swing.JTextField();
        outputFabricante = new javax.swing.JTextField();
        outputMaterial = new javax.swing.JTextField();
        outputTamanho = new javax.swing.JTextField();
        outputTipoUso = new javax.swing.JTextField();
        outputCor = new javax.swing.JTextField();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        descricao.setText("Meta ID Aqui:");
        getContentPane().add(descricao);
        descricao.setBounds(10, 10, 70, 14);
        getContentPane().add(idEscolhido);
        idEscolhido.setBounds(80, 10, 70, 20);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(160, 10, 110, 23);

        jLabel2.setText("Cor:");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 160, 80, 20);

        jLabel3.setText("Nome:");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 40, 80, 20);

        jLabel4.setText("Preço:");
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 60, 80, 20);

        jLabel5.setText("Fabricante:");
        jLabel5.setToolTipText("");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 80, 80, 20);

        jLabel6.setText("Material:");
        jLabel6.setToolTipText("");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 100, 80, 20);

        jLabel7.setText("Tamanho:");
        jLabel7.setToolTipText("");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 120, 80, 20);

        jLabel8.setText("Tipo de Uso:");
        jLabel8.setToolTipText("");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 140, 80, 20);

        outputNome.setEditable(false);
        outputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputNomeActionPerformed(evt);
            }
        });
        getContentPane().add(outputNome);
        outputNome.setBounds(80, 40, 210, 20);

        outputPreco.setEditable(false);
        getContentPane().add(outputPreco);
        outputPreco.setBounds(80, 60, 210, 20);

        outputFabricante.setEditable(false);
        getContentPane().add(outputFabricante);
        outputFabricante.setBounds(80, 80, 210, 20);

        outputMaterial.setEditable(false);
        getContentPane().add(outputMaterial);
        outputMaterial.setBounds(80, 100, 210, 20);

        outputTamanho.setEditable(false);
        getContentPane().add(outputTamanho);
        outputTamanho.setBounds(80, 120, 210, 20);

        outputTipoUso.setEditable(false);
        getContentPane().add(outputTipoUso);
        outputTipoUso.setBounds(80, 140, 210, 20);

        outputCor.setEditable(false);
        outputCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputCorActionPerformed(evt);
            }
        });
        getContentPane().add(outputCor);
        outputCor.setBounds(80, 160, 210, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void outputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputNomeActionPerformed

    private void outputCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputCorActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            Connection ligacao = FuncoesBaseDeDados.ligacao();
            String id = idEscolhido.getText();
            ResultSet linhaBola = FuncoesBaseDeDados.obterBola(ligacao, id);
            outputNome.setText(linhaBola.getString(2));
            outputPreco.setText(linhaBola.getString(3));
            outputFabricante.setText(linhaBola.getString(4));
            outputMaterial.setText(linhaBola.getString(5));
            outputTamanho.setText(linhaBola.getString(6));
            outputTipoUso.setText(linhaBola.getString(7));
            outputCor.setText(linhaBola.getString(8));
            descricao.setText("Meta ID Aqui:");
        } catch (SQLException ex) {
            Logger.getLogger(C02_ConsultarProduto.class.getName()).log(Level.SEVERE, null, ex);
            descricao.setText("Erro");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(C01_InserirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C01_InserirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C01_InserirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C01_InserirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C02_ConsultarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel descricao;
    private javax.swing.JTextField idEscolhido;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField outputCor;
    private javax.swing.JTextField outputFabricante;
    private javax.swing.JTextField outputMaterial;
    private javax.swing.JTextField outputNome;
    private javax.swing.JTextField outputPreco;
    private javax.swing.JTextField outputTamanho;
    private javax.swing.JTextField outputTipoUso;
    // End of variables declaration//GEN-END:variables
}