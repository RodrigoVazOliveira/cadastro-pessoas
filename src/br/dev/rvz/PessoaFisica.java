package br.dev.rvz;

/**
 * modelo de cadastro de pessoa física no sistema
 * @version v0.0
 * @author Rodrigo.vaz
 * */
public class PessoaFisica extends Pessoa{

    private String cpf;
    private int idade;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String telefone, String cpf, int idade) {
        super(nome, telefone);
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", idade=" + idade +
                '}';
    }
}
