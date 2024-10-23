package br.com.DAO;

import br.com.DTO.clienteDTO;
import br.com.View.telaCliente;
import br.com.View.telaUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class clienteDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void incluirClientes(clienteDTO cdto) {

        String sql = "insert into clientes (id, nome, endereco, telefone, email, cpf_cnpj) values (?,?,?,?,?,?)";

        conexao = new conexaoDAO().conector();

        try {

            pst = conexao.prepareStatement(sql);
            pst.setInt(1, cdto.getIdClientes());
            pst.setString(2, cdto.getNomeClientes());
            pst.setString(3, cdto.getEnderecoClientes());
            pst.setString(4, cdto.getTelefoneClientes());
            pst.setString(5, cdto.getEmailClientes());
            pst.setString(6, cdto.getCpf_cnpjClientes());

            int add = pst.executeUpdate();
            if (add > 0) {
                pst.close();
                JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");
                limpar();
                preenchertabela();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "inserir clientes" + e);
        }

    }

    public void pesquisar(clienteDTO cdto) {

        String sql = "select*from clientes where id=?";
        conexao = conexaoDAO.conector();

        try {

            pst = conexao.prepareStatement(sql);
            pst.setInt(1, cdto.getIdClientes());
            rs = pst.executeQuery();

            if (rs.next()) {
                telaCliente.txtNome.setText(rs.getString(2));
                telaCliente.txtEndereco.setText(rs.getString(3));
                telaCliente.txtTelefone.setText(rs.getString(4));
                telaCliente.txtEmail.setText(rs.getString(5));
                telaCliente.txtCPFcnpj.setText(rs.getString(6));
                conexao.close();
            } else {
                JOptionPane.showMessageDialog(null, "Este cliente não existe!!!");
            limpar();

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "método pesquisar" + e);
        }

    }

    public void editarClientes(clienteDTO cdto) {

        String sql = "update clientes set nome = ?, endereco = ?, telefone = ?, email = ?, cpf_cnpj = ? where id =?";
        conexao = conexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(6, cdto.getIdClientes());
            pst.setString(1, cdto.getNomeClientes());
            pst.setString(2, cdto.getEnderecoClientes());
            pst.setString(3, cdto.getTelefoneClientes());
            pst.setString(4, cdto.getEmailClientes());
            pst.setString(5, cdto.getCpf_cnpjClientes());

            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "Cliente editado com sucesso!");
            limpar();
            preenchertabela();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método editar clientes" + e);
        }
    }

    public void deletarCliente(clienteDTO cdto) {
        String sql = "delete from clientes where id = ?";
        conexao = new conexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, cdto.getIdClientes());

            int add = pst.executeUpdate();
            if (add > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "Cliente foi deletado com sucesso!");
            limpar();
            preenchertabela();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método delete clientes" + e);
        }

    }
    
    public void limpar(){
    telaCliente.txtID.setText(null);
    telaCliente.txtEmail.setText(null);
    telaCliente.txtEndereco.setText(null);
    telaCliente.txtCPFcnpj.setText(null);
    telaCliente.txtTelefone.setText(null);
    telaCliente.txtNome.setText(null);
    }
    
    public void preenchertabela(){
    String sql = "select nome from clientes";
     conexao = new conexaoDAO().conector();
     
        try {
            pst = conexao.prepareStatement(sql);
        rs = pst.executeQuery();
        
        DefaultTableModel model = (DefaultTableModel) telaCliente.tabelaClientes.getModel();
        model.setRowCount(0);  // Limpa a tabela antes de adicionar novos dados
        
     
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("nome") 
            });
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no preenchemento na tabela: " + e);
        }
    
    }
    
    
}
