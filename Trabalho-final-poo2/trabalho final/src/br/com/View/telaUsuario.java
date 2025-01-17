/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.View;

import br.com.DAO.conexaoDAO;
import br.com.DAO.usuarioDAO;
import br.com.DTO.usuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class telaUsuario extends javax.swing.JInternalFrame {

    usuarioDTO udto = new usuarioDTO();
        usuarioDAO udao = new usuarioDAO();
     Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form telaUsuario
     */
    public telaUsuario() {
        initComponents();
        
        conexao = conexaoDAO.conector();
        
        ImageIcon pesquisar = new ImageIcon("src/img/search.png");
        btnPesquisar.setIcon(pesquisar);
        
        ImageIcon incluir = new ImageIcon("src/img/person_add.png");
        btnIncluir.setIcon(incluir);
        
        ImageIcon excluir = new ImageIcon("src/img/delete_.png");
        btnExcluir.setIcon(excluir);
        
        ImageIcon editar = new ImageIcon("src/img/edit.png");
        btnEditar.setIcon(editar);
        
        ImageIcon limpar = new ImageIcon("src/img/limpar.png");
        btnLimpar.setIcon(limpar);
    
       
        
        
    
    }
    
   
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIDusuario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmailUsuario = new javax.swing.JTextField();
        txtNomeDeUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();

        jLabel7.setFont(new java.awt.Font("Artifakt Element Black", 0, 24)); // NOI18N
        jLabel7.setText("Tela Cliente");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(520, 530));

        jLabel1.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel1.setText("Nome de usuário");

        jLabel2.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel4.setText("E-mail");

        jLabel5.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel5.setText("Senha");

        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Artifakt Element Black", 0, 24)); // NOI18N
        jLabel8.setText("Tela Usuário");

        jLabel6.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel6.setText("Pesquisar");

        jLabel9.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel9.setText("Incluir");

        jLabel10.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel10.setText("Excluir");

        jLabel11.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel11.setText("Editar");

        jLabel12.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel12.setText("Limpar");

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Usuários"
            }
        ));
        tabelaUsuarios.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaUsuariosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tabelaUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel11)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel12))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(txtNome)
                            .addComponent(txtEmailUsuario)
                            .addComponent(txtIDusuario)
                            .addComponent(txtNomeDeUsuario)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(78, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel2))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIDusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addComponent(txtNomeDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        
      int idUsuario = Integer.parseInt(txtIDusuario.getText());
      
      usuarioDTO udto = new usuarioDTO();
      udto.setIdUsuario(idUsuario);
      
      usuarioDAO udao = new usuarioDAO();
      udao.limpar();
      
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        //chamar método pesquisar
          int idUsuario = Integer.parseInt(txtIDusuario.getText());
        String nomeUsuario = txtNome.getText();
        String loginUsuario = txtNomeDeUsuario.getText();
        String emailUsuario = txtEmailUsuario.getText();
        String senhaUsuario = txtSenha.getText();
        
        usuarioDTO udto = new usuarioDTO();
        
        
        //transferência de dados para usuarioDTO
        udto.setIdUsuario(idUsuario);
        udto.setNomeUsuario(nomeUsuario);
        udto.setEmailUsuario(emailUsuario);
        udto.setLoginUsuario(loginUsuario);
        udto.setSenhaUsuario(senhaUsuario);
        
        //criação do obj da classe DAO para inserir o usuario
        usuarioDAO udao = new usuarioDAO();
            udao.pesquisar(udto);
           
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        
        
        String idText = txtIDusuario.getText();
        String nomeUsuario = txtNome.getText();
        String loginUsuario = txtNomeDeUsuario.getText();
        String emailUsuario = txtEmailUsuario.getText();
        String senhaUsuario = txtSenha.getText();
        
        if( idText.isEmpty() || nomeUsuario.isEmpty() || loginUsuario.isEmpty() || emailUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser obrigatórios", "erro", JOptionPane.ERROR_MESSAGE);
            return;
        
        }
        int idUsuario = Integer.parseInt(idText);
        
        usuarioDTO udto = new usuarioDTO();
        
        
        //transferência de dados para usuarioDTO
        udto.setIdUsuario(idUsuario);
        udto.setNomeUsuario(nomeUsuario);
        udto.setEmailUsuario(emailUsuario);
        udto.setLoginUsuario(loginUsuario);
        udto.setSenhaUsuario(senhaUsuario);
        
        //criação do obj da classe DAO para inserir o usuario
        usuarioDAO udao = new usuarioDAO();
            udao.IncluirUsuario(udto);
          
        
         
                
        
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        int idUsuario = Integer.parseInt(txtIDusuario.getText());
        String nomeUsuario = txtNome.getText();
        String loginUsuario = txtNomeDeUsuario.getText();
        String emailUsuario = txtEmailUsuario.getText();
        String senhaUsuario = txtSenha.getText();
        
        usuarioDTO udto = new usuarioDTO();
        
        
        //transferência de dados para usuarioDTO
        udto.setIdUsuario(idUsuario);
        udto.setNomeUsuario(nomeUsuario);
        udto.setEmailUsuario(emailUsuario);
        udto.setLoginUsuario(loginUsuario);
        udto.setSenhaUsuario(senhaUsuario);
        
        //criação do obj da classe DAO para inserir o usuario
        usuarioDAO udao = new usuarioDAO();
            udao.editar(udto);
           
        
        
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int idUsuario = Integer.parseInt(txtIDusuario.getText());
        usuarioDTO udto = new usuarioDTO();
        udto.setIdUsuario(idUsuario);
        usuarioDAO udao = new usuarioDAO();
        udao.deletar(udto);
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaUsuariosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaUsuariosAncestorAdded
       
        usuarioDAO udao = new usuarioDAO();
        udao.preenchertabela();
        
    }//GEN-LAST:event_tabelaUsuariosAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTable tabelaUsuarios;
    public static javax.swing.JTextField txtEmailUsuario;
    public static javax.swing.JTextField txtIDusuario;
    public static javax.swing.JTextField txtNome;
    public static javax.swing.JTextField txtNomeDeUsuario;
    public static javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
