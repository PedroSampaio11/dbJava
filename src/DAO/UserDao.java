package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import entity.User;

public class UserDao {
    public void cadastrarUser(User user){
         String sql = "INSERT INTO user (email_user, senha_user) VALUES (?, ?)";

         PreparedStatement ps = null;

         try {
            ps = Conexao.getConexao() .prepareStatement(sql);
            ps.setString(1, user.getEmail_user());
            ps.setString(2, user.getSenha_user());
            
            ps.execute();
            ps.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }
}
