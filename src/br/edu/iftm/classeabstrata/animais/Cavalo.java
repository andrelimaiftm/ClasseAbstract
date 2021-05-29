package br.edu.iftm.classeabstrata.animais;

public class Cavalo extends Animal{

    public Cavalo() {
        super("Cavalo", 4);       
    }

    @Override
    public void andar() {
        this.alteraposicao(+10, 0);
        System.out.println(this.getNome()+" andou 2 posições em x.");
    }

    @Override
    public void fazerBarulho(){
        super.fazerBarulho();
        System.out.println("Hiin in in .... Hiiiiin in in");
        super.alteraposicao(0, +2);
    }        
}
