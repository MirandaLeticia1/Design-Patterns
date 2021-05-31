package com.main;

import model.Arquivo;
import builder.ArquivoPermissaoBuilder;
import factory.PermissaoFactory;
import factory.ProgramaFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo().getInstance();
        Scanner scanner = new Scanner(System.in);
        ProgramaFactory programaFactory = new ProgramaFactory();
        PermissaoFactory permissaoFactory = new PermissaoFactory();

        System.out.println("Selecione um programa para abrir.");
        System.out.println("(1) Para abrir o programa de texto.");
        System.out.println("(2) Para abrir o programa de apresentação.");
        System.out.println("(3) Para abrir o programa de planilha.");
        int programaId = scanner.nextInt();
        programaFactory.selecionaPrograma(programaId);

        System.out.println("Insita um nome para o arquivo.");
        String nome = scanner.next();
        arquivo.setNome(nome);

        System.out.println("Insira um caminho para o arquivo.");
        String caminho = scanner.next();
        arquivo.setCaminho(caminho);

        System.out.println("Selecione se o arquivo terá permissao para leitura.");
        System.out.println("(1) Tem permissao ");
        System.out.println("(0) Não tem permissao ");
        int leitura = scanner.nextInt();
        boolean isLeitura = leitura == 1 ? true : false;

        System.out.println("Selecione se o arquivo terá permissao para escrita.");
        System.out.println("(1) Tem permissao ");
        System.out.println("(0) Não tem permissao ");
        int escrita = scanner.nextInt();
        boolean isEscrita = escrita == 1 ? true : false;

        System.out.println("Selecione se o arquivo terá permissao para criar copia.");
        System.out.println("(1) Tem permissao ");
        System.out.println("(0) Não tem permissao ");
        int copia = scanner.nextInt();
        boolean isCopia = copia == 1 ? true : false;

        System.out.println("Selecione se o arquivo terá permissao para impressao.");
        System.out.println("(1) Tem permissao ");
        System.out.println("(0) Não tem permissao ");
        int impressao = scanner.nextInt();
        boolean isImpressao = impressao == 1 ? true : false;

        var arquivoPermissaoBuilder = new ArquivoPermissaoBuilder(isLeitura, isEscrita, isCopia, isImpressao);

        String permissoes = permissaoFactory.setPermissaoArquivo();

        System.out.println("Abrindo arquivo...");
        System.out.println(arquivo.getPrograma().manipularArquivo() + permissoes);
    }
}
