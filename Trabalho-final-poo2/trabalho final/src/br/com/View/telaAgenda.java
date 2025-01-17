/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.View;

import br.com.DAO.agendaDAO;
import br.com.DTO.agendaDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno.saolucas
 */
public class telaAgenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form telaAgenda
     */
    public telaAgenda() {
        initComponents();
        ImageIcon pesquisar = new ImageIcon("src/img/search.png");
        btnPesquisar.setIcon(pesquisar);

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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaConteudo = new javax.swing.JTextArea();
        btnAgendar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAgenda = new javax.swing.JTable();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtIdAgendamento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        txtAreaConteudo.setColumns(20);
        txtAreaConteudo.setRows(5);
        jScrollPane1.setViewportView(txtAreaConteudo);

        btnAgendar.setBackground(new java.awt.Color(0, 51, 153));
        btnAgendar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnAgendar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgendar.setText("Agende");
        btnAgendar.setBorder(null);
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        tabelaAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Cliente", "Conteúdo", "Data", "Hora"
            }
        ));
        tabelaAgenda.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaAgendaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tabelaAgenda);

        jLabel1.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel1.setText("Nome do cliente");

        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        txtData.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel2.setText("Hora");

        jLabel3.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel3.setText("Data");

        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Artifakt Element", 0, 11)); // NOI18N
        jLabel4.setText("ID do agendamento ");

        jLabel8.setFont(new java.awt.Font("Artifakt Element Black", 0, 24)); // NOI18N
        jLabel8.setText("Agenda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtHora)
                    .addComponent(txtData)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(txtNomeCliente)
                    .addComponent(txtIdAgendamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgendar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgendar)
                        .addGap(33, 33, 33)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed

        String txtidCliente = txtIdAgendamento.getText();
        String nomeCliente = txtNomeCliente.getText();
        String conteudo = txtAreaConteudo.getText();
        String hora = txtHora.getText();
        String dataString = txtData.getText();

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;

        if (txtidCliente.isEmpty() || conteudo.isEmpty() || nomeCliente.isEmpty() || hora.isEmpty() || dataString.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser obrigatórios", "erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int IDagendamento = Integer.parseInt(txtidCliente);

        try {
            data = formatador.parse(dataString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data inválida. Formato esperado: dd-MM-yyyy", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        agendaDTO adto = new agendaDTO();

        adto.setIDclienteAgenda(IDagendamento);
        adto.setConteudo(conteudo);
        adto.setCliente(nomeCliente);
        adto.setData(data);
        adto.setHora(hora);

        agendaDAO adao = new agendaDAO();
        adao.agendar(adto);


    }//GEN-LAST:event_btnAgendarActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        int idAgendamento = Integer.parseInt(txtIdAgendamento.getText());
        String nomeCliente = txtNomeCliente.getText();
        String conteudo = txtAreaConteudo.getText();
        String hora = txtHora.getText();
        String dataString = txtData.getText();

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try {
            data = formatador.parse(dataString);
        } catch (ParseException ex) {
            Logger.getLogger(telaAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }

        agendaDTO adto = new agendaDTO();

        adto.setIDclienteAgenda(idAgendamento);
        adto.setConteudo(conteudo);
        adto.setCliente(nomeCliente);
        adto.setData(data);
        adto.setHora(hora);

        agendaDAO adao = new agendaDAO();
        adao.pesquisar(adto);


    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int idAgendamento = Integer.parseInt(txtIdAgendamento.getText());
        agendaDTO adto = new agendaDTO();

        adto.setIDclienteAgenda(idAgendamento);
        agendaDAO adao = new agendaDAO();
        adao.excluir(adto);


    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        int idAgendamento = Integer.parseInt(txtIdAgendamento.getText());
        String nomeCliente = txtNomeCliente.getText();
        String conteudo = txtAreaConteudo.getText();
        String hora = txtHora.getText();
        String dataString = txtData.getText();

        SimpleDateFormat formatador = new SimpleDateFormat("dd/mm/yyyy");
        Date data = null;
        try {
            data = formatador.parse(dataString);
        } catch (ParseException ex) {
            Logger.getLogger(telaAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }

        agendaDTO adto = new agendaDTO();

        adto.setIDclienteAgenda(idAgendamento);
        adto.setConteudo(conteudo);
        adto.setCliente(nomeCliente);
        adto.setData(data);
        adto.setHora(hora);

        agendaDAO adao = new agendaDAO();
        adao.editar(adto);


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        int idAgendamento = Integer.parseInt(txtIdAgendamento.getText());

        agendaDTO adto = new agendaDTO();
        adto.setIDclienteAgenda(idAgendamento);

        agendaDAO adao = new agendaDAO();
        adao.limpar();

    }//GEN-LAST:event_btnLimparActionPerformed

    private void tabelaAgendaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaAgendaAncestorAdded
       
        agendaDAO adao = new agendaDAO();
        adao.preencherTabela();
        
    }//GEN-LAST:event_tabelaAgendaAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tabelaAgenda;
    public static javax.swing.JTextArea txtAreaConteudo;
    public static javax.swing.JTextField txtData;
    public static javax.swing.JTextField txtHora;
    public static javax.swing.JTextField txtIdAgendamento;
    public static javax.swing.JTextField txtNomeCliente;
    // End of variables declaration//GEN-END:variables
}
