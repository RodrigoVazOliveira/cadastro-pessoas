package br.dev.rvz;

/**
 * modelo de cadastro de pessoa jurídica
 * @version v0.0
 * @author Rodrigo.vaz
 * */
public class PessoaJuridica extends Pessoa {

    private String telefoneDeContato;
    private String cnpj;
    private String nomeFAntaisa;


    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, String telefone, String telefoneDeContato, String cnpj, String nomeFAntaisa) {
        super(nome, telefone);
        this.telefoneDeContato = telefoneDeContato;
        this.cnpj = cnpj;
        this.nomeFAntaisa = nomeFAntaisa;
    }

    public String getTelefoneDeContato() {
        return telefoneDeContato;
    }

    public void setTelefoneDeContato(String telefoneDeContato) {
        this.telefoneDeContato = telefoneDeContato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFAntaisa() {
        return nomeFAntaisa;
    }

    public void setNomeFAntaisa(String nomeFAntaisa) {
        this.nomeFAntaisa = nomeFAntaisa;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "telefoneDeContato='" + telefoneDeContato + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", nomeFAntaisa='" + nomeFAntaisa + '\'' +
                '}';
    }
}
