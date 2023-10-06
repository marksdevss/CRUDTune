package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoTuneee {

    private static final String DATABASEURL = "jdbc:mysql://localhost:3306/bd_tune";
    private static final String USER = "root";

    private static final String PASSWORD = "";

    public static Connection conexaoMySQL() throws Exception {

        return DriverManager.getConnection(DATABASEURL, USER, PASSWORD);

    }

    public static void main(String[] args) throws Exception {

        Connection connection = conexaoMySQL();

        if (connection != null) {
            System.out.println("Conectado com sucesso");

            connection.close();
        }
    }

}
