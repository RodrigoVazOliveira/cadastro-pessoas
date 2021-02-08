package br.dev.rvz;


/**
 * responsavel pela sistematização do front end do sistema
 * mostrando opções para o usuário e direcionando a decisão
 * @author Rodrigo.vaz
 * @version v0.0
 * */
public class SystemMain {

    private ListaPessoa lista;
    private boolean run;
    private int option;

    public SystemMain() {
        lista = new ListaPessoa();
        run = true;
        IO.output("Bem vindo ao sistema de cadastro de pessoas");
        while (run) {
            mainMenu();
            optionsSelects();
        }
    }

    public void mainMenu() {
        IO.output("1. Adicionar pessoa fisica.\n2.Adicionar Pessoa Jurídica.\n3.Pessquiar pelo nome da pessoa.\n4. Encerrar aplicação.");
        option = IO.input().nextInt();
    }

    public void adicionarPessoaFisica() {
        IO.output("Por favor, digite nome, telefone, CPF e idade:");
        PessoaFisica pessoaFisica = new PessoaFisica(
                IO.input().nextLine(),
                IO.input().nextLine(),
                IO.input().nextLine(),
                IO.input().nextInt()
        );
        lista.adicionarPessoa(pessoaFisica);
    }

    public void adicionarPessoaJuridica() {
        IO.output("Por favor, digite nome, telefone, telefone de contato, cnpj e nome fantasia:");
        PessoaJuridica pessoaJuridica = new PessoaJuridica(
                IO.input().nextLine(),
                IO.input().nextLine(),
                IO.input().nextLine(),
                IO.input().nextLine(),
                IO.input().nextLine()
        );
        lista.adicionarPessoa(pessoaJuridica);
    }

    public void pesquisarPessoaPorNome() {
        IO.output("Digite o nome a ser pesquisado");
        String nome = IO.input().nextLine();
        try {
            Pessoa pessoa = lista.pesquisarPessoa(nome);
            IO.output(pessoa.toString());
        } catch (RuntimeException e) {
            IO.output("Não encontrei uma pessoa com esse nome");
        }
    }


    /**
     * metodo repsonsavel pelas opções disponiveis no sisteam
     * direcioanndo para outros metodos responsánveis pela funcionalidade
     */
    public void optionsSelects() {
        if (option == 1) {
            adicionarPessoaFisica();
        } else if (option == 2) {
            adicionarPessoaJuridica();
        } else if (option == 3) {
            pesquisarPessoaPorNome();
        } else if (option == 4) {
            run = false;
        } else {
            IO.output("opção inválida");
        }
    }
}
