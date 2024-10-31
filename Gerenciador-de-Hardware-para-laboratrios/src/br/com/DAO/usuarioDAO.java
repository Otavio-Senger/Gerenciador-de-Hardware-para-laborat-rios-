package br.com.DAO;

import br.com.DTO.UsuarioDTO;
import br.com.VIEW.telaPrincipalVIEW;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class usuarioDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void logar(UsuarioDTO udto) {

        String sql = "select * from usuarios where nome_usu = ? and senha_usu = ?";
        conexao = new conexaoDAO().conector();
        try {
            //preparar a consulta no banco, em função do que foi inserido nas caixas de texto
            pst = conexao.prepareStatement(sql);
            pst.setString(1, udto.getNome_usu());
            pst.setString(2, udto.getSenha_usu());

            //executar a query
            rs = pst.executeQuery();
            if (rs.next()) {
                telaPrincipalVIEW principal = new telaPrincipalVIEW();
                principal.setVisible(true);//mudamos a visualização da tela 
                telaPrincipalVIEW.lblNome.setText(rs.getString(2));
            }else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos!!!");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tela de login" + e);
        }
        
    }
        
    
}
