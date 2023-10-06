package TUNEDAO;

import Conexao.ConexaoTuneee;
import MODELS.EmprestimoModel;

import java.sql.Date;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoDAO {

    public void CreateEmprestimo(EmprestimoModel emprestimo) {

        String sql = "INSERT INTO emprestimo (data_emprestimo, valor_emprestimo,prazo_emprestimo, id_livro, titulo) VALUES(?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = Conexao.ConexaoTuneee.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setDate(0, emprestimo.getData_emprestimo());
            preparedStatement.setDate(1, emprestimo.getPrazo_emprestimo());
            preparedStatement.setString(2, emprestimo.getValor_emprestimo());
            preparedStatement.setInt(3, emprestimo.getId_livro());
            preparedStatement.setString(4, emprestimo.getTitulo());

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "emprestimo feito com sucesso");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public List<EmprestimoModel> ShowEmprestimo() {

        String sql = "SELECT * FROM emprestimo";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<EmprestimoModel> emprestimoss = new ArrayList<>();
        //classe que vai recuperar os dados do banco.
        ResultSet resultSet = null;

        try {

            connection = ConexaoTuneee.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                EmprestimoModel emprestimoModel = new EmprestimoModel();

                emprestimoModel.setId_emprestimo(resultSet.getInt("id_emprestimo"));
                emprestimoModel.setData_emprestimo(resultSet.getDate("data_emprestimo"));
                emprestimoModel.setValor_emprestimo(resultSet.getString("valor_emprestimo"));
                emprestimoModel.setPrazo_emprestimo(resultSet.getDate("prazo_emprestimo"));
                emprestimoModel.setId_livro(resultSet.getInt("id_livro"));
                emprestimoModel.setTitulo(resultSet.getString("titulo"));
                emprestimoss.add(emprestimoModel);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return emprestimoss;
    }

    public void UpdateEmprestimo(EmprestimoModel emprestimo) {

        String sql = "UPDATE  emprestimo SET data_emprestimo=?, valor_emprestimo=?, prazo_emprestimo=?  WHERE id_emprestimo=?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConexaoTuneee.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, emprestimo.getId_emprestimo());

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, " dados do emprestimo atualizados com sucesso");

        } catch (Exception exception) {

            System.out.println("Erro: " + exception);
        }
    }

    public void DeleteEmprestimo(int id) {

        String sql = "DELETE FROM emprestimo WHERE id_emprestimo = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConexaoTuneee.conexaoMySQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,id);

            preparedStatement.execute();

            JOptionPane.showMessageDialog(null, "Emprestimo deletado com sucesso");

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

}
