package br.com.DAO;

import br.com.DTO.maquinaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class maquinaDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;


public void cadastrar(maquinaDTO maqdto){
    
    String sql = "insert into equipamentos (id_eq, status_equipamento, id_lab) values (?, ?, ?)";
    
    conexao = new conexaoDAO().conector();
    
    try {
         pst = conexao.prepareStatement(sql);
         pst.setInt(1, maqdto.getId_eq());
         pst.setString(2, maqdto.getStatus());
        pst.setObject(3, maqdto.getid_lab());
//        pst.setInt(3, maqdto.getId_labo());
        
        
           int add = pst.executeUpdate();
            if (add > 0) {
                pst.close();
                JOptionPane.showMessageDialog(null, "Máquina inserido com sucesso!");
            }
    } catch (Exception e) {
        
                    JOptionPane.showMessageDialog(null, "inserir maquina" + e);

        
    }

}

}


