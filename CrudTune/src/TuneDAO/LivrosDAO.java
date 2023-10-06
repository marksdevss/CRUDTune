package TUNEDAO;

import MODELS.LivrosModel;
import Conexao.ConexaoTuneee;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LivrosDAO {

    public void CreateLivros(LivrosModel livros) {

        String sql = "INSERT INTO livro (titulo, autor, genero, secao, subsecao) VALUES(?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = Conexao.ConexaoTuneee.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, livros.getTitulo());
            preparedStatement.setString(2, livros.getAutor());
            preparedStatement.setString(3, livros.getGenero());
            preparedStatement.setString(4, livros.getSecao());
            preparedStatement.setString(5, livros.getSubsecao());

            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public List<LivrosModel> ShowLivros() {

        String sql = "SELECT * FROM livro";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<LivrosModel> livros = new ArrayList<>();
        //classe que vai recuperar os dados do banco.
        ResultSet resultSet = null;

        try {

            connection = Conexao.ConexaoTuneee.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                LivrosModel livross = new LivrosModel();

                livross.setId_livro(resultSet.getInt("id_livro"));
                livross.setAutor(resultSet.getString("autor"));
                livross.setTitulo(resultSet.getString("titulo"));
                livross.setGenero(resultSet.getString("genero"));
                livross.setSecao(resultSet.getString("secao"));
                livross.setSubsecao(resultSet.getString("subsecao"));

                livros.add(livross);
            }

        } catch (Exception e) {

            e.printStackTrace();

        }
        return livros;
    }

    public void UpdateLivros(LivrosModel livros) {

        String sql = "UPDATE  livro SET titulo=?, autor=?,genero=? WHERE id_livro=?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = Conexao.ConexaoTuneee.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, livros.getId_livro());
            preparedStatement.setString(2, livros.getTitulo());
            preparedStatement.setString(3, livros.getAutor());
            preparedStatement.setString(4, livros.getGenero());
            preparedStatement.setString(5, livros.getSecao());
            preparedStatement.setString(6, livros.getSubsecao());

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, " livro atualizado com sucesso");

        } catch (Exception exception) {

            System.out.println("Erro: " + exception);
        }
    }

    public void DeleteClientes(int id_livro) {

        String sql = "DELETE FROM livro WHERE id_livro = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = Conexao.ConexaoTuneee.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id_livro);

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "livro deletado com sucesso");

        } catch (Exception exception) {

            JOptionPane.showMessageDialog(null, exception);

        }

    }
}
