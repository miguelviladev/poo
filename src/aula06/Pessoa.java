package aula06;
import aula05.Data;

public class Pessoa {
    private String nome;
    private int cartao_cidadao;
    private Data data_nascimento;

    Pessoa(String nome, int cartao_cidadao, Data data_nascimento) {
        this.setNome(nome);
        this.setCartaoCidadao(cartao_cidadao);
        this.setDataNascimento(data_nascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCartaoCidadao() {
        return cartao_cidadao;
    }

    public void setCartaoCidadao(int cartao_cidadao) {
        this.cartao_cidadao = cartao_cidadao;
    }

    public Data getDataNascimento() {
        return data_nascimento;
    }

    public void setDataNascimento(Data data_nascimento) {
        if (data_nascimento.isDataValida()) {
            this.data_nascimento = data_nascimento;
        } else {
            throw new IllegalArgumentException("Data inválida");
        }
    }

    @Override
    public String toString() {
        return this.getNome() + "; CC: " + this.getCartaoCidadao() + "; Data de Nascimento: " + this.getDataNascimento().getData();
    }
}