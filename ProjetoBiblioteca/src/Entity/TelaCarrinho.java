/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Menu.TelaMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 82328535
 */
public class TelaCarrinho extends javax.swing.JFrame {

    /**
     * Creates new form TelaCarrinho
     */
    public TelaCarrinho() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        iDTextField = new javax.swing.JTextField();
        nomeTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        carrinhoTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(580, 465));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 370, 110, 40);

        jButton2.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButton2.setText("Finalizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(380, 370, 110, 40);

        jButton3.setText("Adicionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(180, 100, 77, 23);

        jButton4.setText("Adicionar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(210, 140, 80, 23);

        iDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iDTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(iDTextField);
        iDTextField.setBounds(70, 100, 90, 20);

        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nomeTextField);
        nomeTextField.setBounds(70, 140, 130, 20);

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Locação");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 20, 190, 60);

        carrinhoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Genero", "Autor", "Editora", "valor"
            }
        ));
        jScrollPane2.setViewportView(carrinhoTable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 210, 500, 50);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 100, 10, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 140, 27, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/biblioteca.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-6, 4, 570, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iDTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
       TelaMenu telaDeVoltar = new TelaMenu();
       telaDeVoltar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                        try {
            consultaAcervoNome(nomeTextField.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Não foi possível buscar os dados do banco.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                try {
            consultaAcervoId(iDTextField.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Não foi possível buscar os dados do banco.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       JOptionPane.showMessageDialog (null, "Pedido de locação finalizado");
       this.dispose();
       TelaMenu telaDeVoltar = new TelaMenu();
       telaDeVoltar.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
private void consultaAcervoId(String id) throws Exception{
       // Cria um objeto para representar a tabela que incluímos na tela
       DefaultTableModel model = (DefaultTableModel)carrinhoTable.getModel();
       model.setRowCount(0);
       
       String sql = "SELECT * FROM tab_acervo WHERE id = ?";
       try (Connection conn = ConexaoDB.obtemConexao();
           PreparedStatement ps = conn.prepareStatement(sql)){
           ps.setString(1, id);
           ResultSet rs = ps.executeQuery();
           
           // Enquanto existir uma linha no result grid, representado por rs, essa linha será
           // adicionada na tabela, representada por model.
           while(rs.next()){
               model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6)}); 
           }
       }
    }
private void consultaAcervoNome(String nome) throws Exception{
       // Cria um objeto para representar a tabela que incluímos na tela
       DefaultTableModel model = (DefaultTableModel)carrinhoTable.getModel();
       model.setRowCount(0);
       
       String sql = "SELECT * FROM tab_acervo WHERE nome = ?";
       try (Connection conn = ConexaoDB.obtemConexao();
           PreparedStatement ps = conn.prepareStatement(sql)){
           ps.setString(1, nome);
           ResultSet rs = ps.executeQuery();
           
           // Enquanto existir uma linha no result grid, representado por rs, essa linha será
           // adicionada na tabela, representada por model.
           while(rs.next()){
               model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6)}); 
           }
       }
    }

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
            java.util.logging.Logger.getLogger(TelaCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCarrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable carrinhoTable;
    private javax.swing.JTextField iDTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomeTextField;
    // End of variables declaration//GEN-END:variables
}
