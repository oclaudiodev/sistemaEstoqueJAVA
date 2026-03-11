package com.java1;

public abstract class Produto {
    private int idProduto;
    private double preco;
    private int quantidade;
    private String nome;

    public Produto(int idProduto, double preco, int quantidade,String nome) {
        this.nome = nome;
        this.idProduto = idProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public abstract void rabsicar();

    public abstract void removerQTD(int num);

    public abstract void adicionarQTD(int num);
}
