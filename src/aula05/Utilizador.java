package aula05;

public class Utilizador {
    private String nome, curso; private int n_mec;

    Utilizador(String nome, int n_mec, String curso) {
        this.setNome(nome);
        this.setNumMec(n_mec);
        this.setCurso(curso);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNumMec(int n_mec) {
        this.n_mec = n_mec;
    }

    public int getNumMec() {
        return this.n_mec;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return this.curso;
    }

    public String toString() {
        return "Aluno: " + this.getNumMec() + "; " + this.getNome() + "; " + this.getCurso();
    }
}
