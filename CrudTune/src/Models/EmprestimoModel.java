package MODELS;

import java.sql.Date;

public class EmprestimoModel {

    private int id_emprestimo;

    private Date data_emprestimo;

    private String valor_emprestimo;

    private Date prazo_emprestimo;

    private int id_livro;
    
    private String titulo;

    public EmprestimoModel() {
    }

    public EmprestimoModel(int id_emprestimo, Date data_emprestimo, String valor_emprestimo, Date prazo_emprestimo, int id_livro, String titulo) {
        this.id_emprestimo = id_emprestimo;
        this.data_emprestimo = data_emprestimo;
        this.valor_emprestimo = valor_emprestimo;
        this.prazo_emprestimo = prazo_emprestimo;
        this.id_livro = id_livro;
        this.titulo = titulo;
    }

    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public Date getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(Date data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public String getValor_emprestimo() {
        return valor_emprestimo;
    }

    public void setValor_emprestimo(String valor_emprestimo) {
        this.valor_emprestimo = valor_emprestimo;
    }

    public Date getPrazo_emprestimo() {
        return prazo_emprestimo;
    }

    public void setPrazo_emprestimo(Date prazo_emprestimo) {
        this.prazo_emprestimo = prazo_emprestimo;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   

}
