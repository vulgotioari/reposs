
package br.com.DTO;

import java.util.Date;
import javax.swing.table.DefaultTableModel;


public class agendaDTO {
    private int IDclienteAgenda;
    private String cliente;
    private String conteudo;
    private Date data;
    private String hora;
   

    
    
    
    

    public int getIDclienteAgenda() {
        return IDclienteAgenda;
    }

    public void setIDclienteAgenda(int IDclienteAgenda) {
        this.IDclienteAgenda = IDclienteAgenda;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    
}
