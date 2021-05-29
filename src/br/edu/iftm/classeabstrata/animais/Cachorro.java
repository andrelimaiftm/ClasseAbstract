package br.edu.iftm.classeabstrata.animais;

public class Cachorro extends Animal{

    public Cachorro() {
        super("Cachorro", 4);        
    }

    @Override
    public void andar() {
        //ande +2 posicao x
        this.alteraposicao(+2, 0);
        System.out.println(this.getNome()+" andou 2 posições em x.");
    }

    @Override
    public void fazerBarulho(){
        super.fazerBarulho();
        System.out.println("Auuuuuuuuu Auuuuuuuuuu");
    }
    
}
