package br.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ValidacaoCpf validacpf = new ValidacaoCpf();

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        if (validacpf.validarCpf(cpf)) {
            System.out.println("CPF válido!");
            System.out.println("1º dígito verificador: " + validacpf.getDig1());
            System.out.println("2º dígito verificador: " + validacpf.getDig2());
        } else {
            System.out.println("CPF inválido!");
        }
    }
}
