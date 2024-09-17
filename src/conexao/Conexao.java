package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    // conexao estatica assim que inicia ja vai para memoria
    private static final String URL = "jdbc:mysql://localhost:3306/dbJava";
    private static final String USER = "root";
    private static final String PASS = "root";

    private static Connection conn;

    public static Connection getConexao() {
        // uso do try catch para tratamento de erro
        try {
            // nunca foi criada
            if (conn == null) {
                // criando conexao
                conn = DriverManager.getConnection(URL, USER, PASS);
                return conn;
                // retorna
            }else{
                // se ja estiver criado retorna
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

}
