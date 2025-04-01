package com.example.motorista;

class Usuario3 {

    final static int QUANTIDADE_DE_CONEXOES = 2;
    static boolean verificaUsuarioLogado(){
        return true;
    }
}

public class Testa {

    public static void main(String[] args) {
        String s = "ALO MUNDO";
        System.out.println(s.substring(4,6));

        boolean retorno = Usuario3.verificaUsuarioLogado();
        int qtd = Usuario3.QUANTIDADE_DE_CONEXOES;
        System.out.println(retorno);
        System.out.println(qtd);
    }
}
