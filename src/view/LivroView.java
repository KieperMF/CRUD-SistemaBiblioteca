/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.LivroDAO;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.LivroModel;
import model.SecaoModel;
import model.SubsecaoModel;

/**
 *
 * @author kiepe
 */
public class LivroView extends javax.swing.JFrame {

    /**
     * Creates new form LivroView
     */
    public LivroView() {
        initComponents();
        DadosComboboxSecao();
        DadosComboboxSubsecao();
        ResgatarInnerJoin();
        txtIdLivro.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        cbxSecao = new javax.swing.JComboBox<>();
        cbxSubsecao = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaLivro = new javax.swing.JTable();
        txtIdLivro = new javax.swing.JTextField();
        btnDeletar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Titulo:");

        jLabel2.setText("Autor:");

        jLabel3.setText("Seção:");

        jLabel4.setText("Subseção:");

        cbxSecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        cbxSubsecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        TabelaLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Livro", "Titulo", "Autor", "Seção", "Subseção", "Data Cadastro"
            }
        ));
        TabelaLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaLivroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaLivro);

        txtIdLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdLivroKeyTyped(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxSubsecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                            .addComponent(txtTitulo))
                                        .addGap(118, 118, 118)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnDeletar)
                                            .addComponent(btnAtualizar)
                                            .addComponent(btnCadastrar))))))
                        .addContainerGap(365, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtIdLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnAtualizar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxSubsecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastrarLivro();
        ResgatarInnerJoin();
        Limpar();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtIdLivroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdLivroKeyTyped
       String id = "";
       if(!id.contains(evt.getKeyChar()+"")){
        evt.consume();
    }
    }//GEN-LAST:event_txtIdLivroKeyTyped

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
       DeletarLivro();
       ResgatarInnerJoin();
       Limpar();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        AtualizarLivro();
        ResgatarInnerJoin();
        Limpar();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void TabelaLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaLivroMouseClicked
        Setar();
    }//GEN-LAST:event_TabelaLivroMouseClicked

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
            java.util.logging.Logger.getLogger(LivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LivroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaLivro;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JComboBox<String> cbxSecao;
    private javax.swing.JComboBox<String> cbxSubsecao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtIdLivro;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    public void CadastrarLivro() {
        LivroDAO livro = new LivroDAO();
        String titulo = txtTitulo.getText();
        String autor = txtAutor.getText();
        int secaoId = cbxSecao.getSelectedIndex();
        int subsecaoId = cbxSubsecao.getSelectedIndex();

        LivroModel add = new LivroModel(titulo, autor, secaoId, subsecaoId);
        livro.CadastrarLivro(add);
    }

    ArrayList<Integer> id_secao = new ArrayList<Integer>();
    ArrayList<Integer> id_subsecao = new ArrayList<Integer>();

    public void DadosComboboxSecao() {
        try {
            LivroDAO dao = new LivroDAO();

            for (SecaoModel secao : dao.Secoes()) {
                id_secao.add(secao.getId());
                cbxSecao.addItem(secao.getSecao());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro combobox Seção:" + e);
        }
    }

    public void Limpar() {
        txtIdLivro.setText("");
        txtTitulo.setText("");
        txtAutor.setText("");
        cbxSecao.setSelectedIndex(0);
        cbxSubsecao.setSelectedIndex(0);
    }
   

    public void DadosComboboxSubsecao() {
        try {
            LivroDAO obj = new LivroDAO();

            for (SubsecaoModel sub : obj.Subsecao()) {
                id_subsecao.add(sub.getId());
                cbxSubsecao.addItem(sub.getSubsecao());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro combobox Subsecao:" + e);
        }
    }

    public void ResgatarInnerJoin() {
        try {
            LivroDAO dao = new LivroDAO();
            ResultSet rs = dao.InnerJoin();
            DefaultTableModel model = (DefaultTableModel) TabelaLivro.getModel();
            model.setNumRows(0);
            LivroModel livro = new LivroModel();
            SecaoModel secao = new SecaoModel();
            SubsecaoModel sub = new SubsecaoModel();

            while (rs.next()) {
                livro.setId(rs.getInt("livroId"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                secao.setSecao(rs.getString("secao"));
                sub.setSubsecao(rs.getString("subsecao"));
                livro.setData(rs.getString("dataCadastro"));

                model.addRow(new Object[]{
                    livro.getId(),
                    livro.getTitulo(),
                    livro.getAutor(),
                    secao.getSecao(),
                    sub.getSubsecao(),
                    livro.getData(),
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void Setar(){
        int setar = TabelaLivro.getSelectedRow();
        
        txtIdLivro.setText(TabelaLivro.getModel().getValueAt(setar, 0).toString());
        txtTitulo.setText(TabelaLivro.getModel().getValueAt(setar, 1).toString());
        txtAutor.setText(TabelaLivro.getModel().getValueAt(setar, 2).toString());
    }
    
    public void DeletarLivro(){
        int id = Integer.parseInt(txtIdLivro.getText());
        LivroDAO dao = new LivroDAO();
        dao.DeletarLivro(id);
    }
    
    public void AtualizarLivro(){
        String titulo = txtTitulo.getText();
        String autor = txtAutor.getText(); 
        int secao = cbxSecao.getSelectedIndex();
        int sub = cbxSubsecao.getSelectedIndex();
        int id = Integer.parseInt(txtIdLivro.getText());
        LivroModel up = new LivroModel(id,titulo,autor,secao,sub);
        LivroDAO dao = new LivroDAO();
        dao.AtualizarLivro(up);
    }
}
