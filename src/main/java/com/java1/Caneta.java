package com.java1;

public class Caneta extends Produto{
    private String cor;
    private boolean tinta;
    public Caneta(String nome,int idProduto, double preco, int quantidade, String cor, boolean tinta) {
        super(idProduto, preco, quantidade,nome);
        this.cor = cor;
        this.tinta = tinta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTinta() {
        return tinta;
    }

    public void setTinta(boolean tinta) {
        this.tinta = tinta;
    }

    @Override
    public void rabsicar() {
        if(this.tinta){
            System.out.println("Rabiscando");
        }
        else{
            System.out.println("Sem tinta");
        }
    }

    @Override
    public void removerQTD(int num) {
        if(getQuantidade() >= num){
        setQuantidade(getQuantidade()-num);
        } else {
            System.out.println("Quantidade insuficiente.");
        }
    }


    @Override
    public void adicionarQTD(int num) {
        setQuantidade(getQuantidade()+num);
    }
}
