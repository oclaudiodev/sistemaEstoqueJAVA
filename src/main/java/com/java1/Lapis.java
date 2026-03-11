package com.java1;

public class Lapis extends Produto{
    private float ponta;
    private boolean temPonta;

    public Lapis(String nome,int idProduto, double preco, int quantidade, float ponta, boolean temPonta) {
        super(idProduto, preco, quantidade, nome);
        this.ponta = ponta;
        this.temPonta = temPonta;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean getTemPonta() {
        return temPonta;
    }

    public void setTemPonta(boolean temPonta) {
        this.temPonta = temPonta;
    }


    @Override
    public void rabsicar() {
        if(this.temPonta){
            System.out.println("Rabiscando");
        }
        else{
            System.out.println("Sem ponta");
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
