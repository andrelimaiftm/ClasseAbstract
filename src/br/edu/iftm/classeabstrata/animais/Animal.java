package br.edu.iftm.classeabstrata.animais;

public abstract class Animal {

    private int quantidadeDePatas;
    private String nome;
    private int posicaoX;
    private int posicaoY;

    public Animal(String nome, int quantidadeDePatas){
        this.nome = nome;
        this.quantidadeDePatas = quantidadeDePatas;
        this.posicaoX = 0;
        this.posicaoY = 0;
    }

    public abstract void andar();

    protected void alteraposicao(int passoEmX, int passoEmY){
        this.posicaoX += passoEmX;
        this.posicaoY += passoEmY;
    }

    public void fazerBarulho(){
        System.out.println("O animal faz barulho:");
    }
    
    public final void morrer(){
        System.out.println("O animal morreu. ");
    }

    //metodos especiais getter e setter.
    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    public void setQuantidadeDePatas(int quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }
    
    public String toString(){
        String informacao = String.format("%s (X: %d, Y: %d).", 
            this.nome, this.posicaoX, this.getPosicaoY());
        return informacao;
    }
    
}
