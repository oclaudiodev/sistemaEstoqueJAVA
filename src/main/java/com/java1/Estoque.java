package com.java1;

public class Estoque {
    Produto[] produtos = new Produto[100];
    private int contador = 0;

    public void adcionarProduto(Produto p) {
        if(contador < produtos.length){
            produtos[contador] = p;
            contador++;
        }else{
            System.out.println("Aumente o tamanho do estoque para caber mais produtos");
        }
    }

    public void removerProduto(Produto p) {
        for(int i = 0; i < contador; i++) {

            if(produtos[i] == p) {

                for(int j = i; j < contador - 1; j++) {
                    produtos[j] = produtos[j + 1];
                }

                contador--;
                System.out.println("");
                System.out.println("Produto removido.");
                System.out.println("");
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    public void listarProdutos() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Produto: " + produtos[i].getNome());
            System.out.println("ID: " + produtos[i].getIdProduto());
            System.out.println("Preço: " + produtos[i].getPreco());
            System.out.println("Quantidade: " + produtos[i].getQuantidade());
            System.out.println("------------------");
        }
    }

    public Produto buscarProduto(int id){

        for(int i = 0; i < contador; i++){

            if(produtos[i].getIdProduto() == id){
                return produtos[i];
            }

        }
        return null;
    }
}
