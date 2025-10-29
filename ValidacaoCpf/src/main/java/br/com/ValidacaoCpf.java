package br.com;

public class ValidacaoCpf {

    private String cpf;
    private int dig1, dig2;

    public int getDig1() {
        return dig1;
    }

    public int getDig2() {
        return dig2;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean quantCasas(String cpf) {
        cpf = cpf.replaceAll("\\D", "");
        if (cpf.length() != 11) return false;
        if (cpf.chars().distinct().count() == 1) return false;
        this.cpf = cpf;
        return true;
    }

    private int verificadorPrimDig(String cpf) {
        int soma = 0;
        int peso = 10;

        for (int i = 0; i < 9; i++) {
            int num = Character.getNumericValue(cpf.charAt(i));
            soma += num * peso--;
        }

        int resto = soma % 11;
        dig1 = (resto < 2) ? 0 : 11 - resto;
        return dig1;
    }

    private int verificadorSegDig(String cpf) {
        int primeiroDig = verificadorPrimDig(cpf);
        int soma = 0;
        int peso = 11;

        for (int i = 0; i < 9; i++) {
            int num = Character.getNumericValue(cpf.charAt(i));
            soma += num * peso--;
        }

        soma += primeiroDig * 2;

        int resto = soma % 11;
        dig2 = (resto < 2) ? 0 : 11 - resto;
        return dig2;
    }

    public boolean validarCpf(String cpf) {
        if (!quantCasas(cpf)) return false;

        int d1 = verificadorPrimDig(cpf);
        int d2 = verificadorSegDig(cpf);

        String cpfCalculado = cpf.substring(0, 9) + d1 + d2;

        return cpf.equals(cpfCalculado);
    }
}
