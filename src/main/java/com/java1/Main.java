package com.java1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Estoque estoque = new Estoque();

        int opcao;

        do {

            System.out.println("\n===== SISTEMA DE ESTOQUE =====");
            System.out.println("1 - Adicionar Lápis");
            System.out.println("2 - Adicionar Caneta");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Entrada de estoque");
            System.out.println("6 - Saída de estoque");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch(opcao){
                case 0:
                    estoque.listarProdutos();
                    break;

                case 1:

                    System.out.println("Produto:");
                    sc.nextLine();
                    String nomeLapis = sc.nextLine();

                    System.out.println("ID:");
                    int idLapis = sc.nextInt();

                    System.out.println("Preço:");
                    double precoLapis = sc.nextDouble();

                    System.out.println("Quantidade:");
                    int qtdLapis = sc.nextInt();

                    Lapis lapis = new Lapis(nomeLapis,idLapis,precoLapis,qtdLapis,1.0f,true);
                    estoque.adcionarProduto(lapis);

                    break;

                case 2:

                    System.out.println("Produto:");
                    sc.nextLine();
                    String nomeCaneta = sc.nextLine();

                    System.out.println("ID:");
                    int idCaneta = sc.nextInt();

                    System.out.println("Preço:");
                    double precoCaneta = sc.nextDouble();

                    System.out.println("Quantidade:");
                    int qtdCaneta = sc.nextInt();

                    System.out.println("Cor:");
                    sc.nextLine();
                    String cor = sc.nextLine();

                    Caneta caneta = new Caneta(nomeCaneta,idCaneta,precoCaneta,qtdCaneta,cor,true);
                    estoque.adcionarProduto(caneta);

                    break;

                case 3:

                    estoque.listarProdutos();

                    break;

                case 4:

                    System.out.println("Digite o ID do produto:");
                    int idRemover = sc.nextInt();

                    Produto pRemover = estoque.buscarProduto(idRemover);

                    if(pRemover != null){
                        estoque.removerProduto(pRemover);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }

                    break;

                case 5:

                    System.out.println("ID do produto:");
                    int idEntrada = sc.nextInt();

                    Produto pEntrada = estoque.buscarProduto(idEntrada);

                    if(pEntrada != null){
                        System.out.println("Quantidade para adicionar:");
                        int qtd = sc.nextInt();
                        pEntrada.adicionarQTD(qtd);
                    }

                    break;

                case 6:

                    System.out.println("ID do produto:");
                    int idSaida = sc.nextInt();

                    Produto pSaida = estoque.buscarProduto(idSaida);

                    if(pSaida != null){
                        System.out.println("Quantidade para remover:");
                        int qtd = sc.nextInt();
                        pSaida.removerQTD(qtd);
                    }

                    break;

            }

        } while(opcao != 0);

        sc.close();
    }
}