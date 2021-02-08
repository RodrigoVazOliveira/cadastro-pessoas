package br.dev.rvz;

import java.util.Scanner;

/**
 * responsavel pela entrada e saída de dados para o usuário
 * @author Rodrigo.vaz
 * @version v0.0
 * */
public class IO {

    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static void output(String texto) {
        System.out.println(texto);
    }
}
