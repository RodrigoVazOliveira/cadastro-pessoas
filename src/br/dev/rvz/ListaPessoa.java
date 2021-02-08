package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

/**
 * armazenamento de lista de pessoa fisica e juridica
 * @version v0.0
 * @author Rodrigo.vaz
 * */
public class ListaPessoa {

    private List<Pessoa> lista;


    public ListaPessoa() {
        this.lista = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        lista.add(pessoa);
    }

    public Pessoa pesquisarPessoa(String nome) {
        for (Pessoa pessoa : lista) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                return pessoa;
            }
        }
        throw new RuntimeException("não existe usuário com esse nome");
    }

    public List<Pessoa> getLista() {
        return lista;
    }

    public void setLista(List<Pessoa> lista) {
        this.lista = lista;
    }
}
