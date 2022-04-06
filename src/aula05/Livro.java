package aula05;

public class Livro {
    private int id; private String titulo, tipo_emprestimo;

    Livro(int id, String titulo, String tipo_emprestimo) {
        this.setId(id);
        this.setTitulo(titulo);
        this.setTipoEmprestimo(tipo_emprestimo);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTipoEmprestimo(String tipo_emprestimo) {
        this.tipo_emprestimo = tipo_emprestimo;
    }

    public String getTipoEmprestimo() {
        return this.tipo_emprestimo;
    }
}
