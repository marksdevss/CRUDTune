package TUNEDAO;

import Conexao.ConexaoTuneee;

import MODELS.ClientesModel;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public void CreateClientes(ClientesModel clientes) {

        String sql = "INSERT INTO clientes (nome_cliente,cpf, email, telefone) VALUES(?,?,?,?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConexaoTuneee.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, clientes.getNome_cliente());
            preparedStatement.setString(2, clientes.getCpf());
            preparedStatement.setString(3, clientes.getEmail());
            preparedStatement.setString(4, clientes.getTelefone());

            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public List<ClientesModel> ShowClientes() {

        String sql = "SELECT * FROM clientes";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<ClientesModel> clientes = new ArrayList<>();
        //classe que vai recuperar os dados do banco.
        ResultSet resultSet = null;

        try {

            connection = ConexaoTuneee.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                ClientesModel clientess = new ClientesModel();

                clientess.setId_clientes(resultSet.getInt("id_clientes"));
                clientess.setCpf(resultSet.getString("cpf"));
                clientess.setNome_cliente(resultSet.getString("nome_cliente"));
                clientess.setEmail(resultSet.getString("email"));
                clientess.setTelefone(resultSet.getString("telefone"));

                clientes.add(clientess);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return clientes;
    }

    public void UpdateCliente(ClientesModel clientesModel) {

        String sql = "UPDATE  clientes SET nome_cliente=?, cpf=?, email= ?, telefone=? WHERE id_clientes=?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConexaoTuneee.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, clientesModel.getId_clientes());
            preparedStatement.setString(2, clientesModel.getNome_cliente());
            preparedStatement.setString(3, clientesModel.getCpf());
            preparedStatement.setString(4, clientesModel.getEmail());
            preparedStatement.setString(5, clientesModel.getTelefone());

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "dados do cliente atualizados com sucesso");

        } catch (Exception exception) {

            System.out.println("Erro: " + exception);
        }

    }

    public void DeleteClientes() {

        String sql = "DELETE FROM clientes WHERE id_clientes = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConexaoTuneee.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "cliente deletado com sucesso");

        } catch (Exception e) {

            System.out.println("erro: " + e);
        }
    }

}
