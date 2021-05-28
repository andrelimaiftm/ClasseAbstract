package br.edu.iftm.classeabstrata.animais;

public class Cavalo extends Animal{

    public Cavalo() {
        super("Cavalo", 4);
        
    }

    @Override
    public void andar() {
        this.alterarPosicao(+10, 0);
        System.out.println(getNome()+ " andou 10 posições em x.");
        
    }

    @Override
    public void fazerBarulho(){
        super.fazerBarulho();
        System.out.println("Hiin in in .... Hiiiiin in in");
        super.alterarPosicao(0, +1);
    }
    
}
