package br.com.DAO;

import br.com.DTO.agendaDTO;
import br.com.View.telaAgenda;
import static br.com.View.telaAgenda.tabelaAgenda;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class agendaDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void agendar(agendaDTO adto) {
        String sql = "insert into agendas(idAgendamento, nomeCliente, conteudo, datas, hora) values (?, ?, ?, ?, ?)";
        conexao = new conexaoDAO().conector();

        try {
            java.util.Date dataHoje = new java.util.Date();
            if (adto.getData().before(dataHoje)) {
                JOptionPane.showMessageDialog(null, "Não é permitido agendar para uma data anterior à data atual!!!");
                return;
            }

            pst = conexao.prepareStatement(sql);
            pst.setInt(1, adto.getIDclienteAgenda());
            pst.setString(2, adto.getCliente());
            pst.setString(3, adto.getConteudo());
//            pst.setDate(4, (Date) adto.getData());
            java.sql.Date sqlDate = new java.sql.Date(adto.getData().getTime());
            pst.setDate(4, sqlDate);

            pst.setString(5, adto.getHora());

            int add = pst.executeUpdate();
            if (add > 0) {

                pst.close();
                JOptionPane.showMessageDialog(null, "Agendado com sucesso!!!");
                limpar();
                preencherTabela();

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "inserir agendamento" + e);
        }

    }

    public void pesquisar(agendaDTO adto) {
        String sql = "select*from agendas where idAgendamento = ?";
        conexao = conexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, adto.getIDclienteAgenda());
            rs = pst.executeQuery();

            if (rs.next()) {
                telaAgenda.txtNomeCliente.setText(rs.getString(2));
                telaAgenda.txtAreaConteudo.setText(rs.getString(3));
                telaAgenda.txtData.setText(rs.getString(4));
                telaAgenda.txtHora.setText(rs.getString(5));
            } else {
                JOptionPane.showMessageDialog(null, "Este agendamento não existe!!!");
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "método pesquisar" + e);

        }

    }

    public void excluir(agendaDTO adto) {

        String sql = "delete from agendas where idAgendamento = ?";
        conexao = new conexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, adto.getIDclienteAgenda());

            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "Agendamento deletado com sucesso!");
                limpar();
                preencherTabela();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método deletar agendamento" + e);
        }

    }

    public void editar(agendaDTO adto) {
        String sql = "update agendas set nomeCliente = ?, conteudo = ?, datas = ?, hora = ? where idAgendamento = ?";
        conexao = conexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(5, adto.getIDclienteAgenda());
            pst.setString(1, adto.getCliente());
            pst.setString(2, adto.getConteudo());
            java.sql.Date sqlDate = new java.sql.Date(adto.getData().getTime());
            pst.setDate(3, sqlDate);
            pst.setString(4, adto.getHora());

            int add = pst.executeUpdate();
            if (add > 0) {
                pst.close();
                JOptionPane.showMessageDialog(null, "Agendamento editado com sucesso!!!");
                limpar();
                preencherTabela();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método editar " + e);
        }
    }

    public void limpar() {
        telaAgenda.txtAreaConteudo.setText(null);
        telaAgenda.txtData.setText(null);
        telaAgenda.txtHora.setText(null);
        telaAgenda.txtIdAgendamento.setText(null);
        telaAgenda.txtNomeCliente.setText(null);
    }

    public void preencherTabela() {
        String sql = "select * from agendas";
        conexao = conexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            
            DefaultTableModel model = (DefaultTableModel) telaAgenda.tabelaAgenda.getModel();
            model.setRowCount(0); // limpa a tabela antes de adicionar novos dados

       
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("idAgendamento"),
                    rs.getString("nomeCliente"),
                    rs.getString("conteudo"),
                    rs.getDate("datas"),
                    rs.getString("hora")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela: " + e);
        }
    }

}
