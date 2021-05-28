package br.edu.iftm.classeabstrata.animais;

public class Cachorro extends Animal {

    public Cachorro() {
        super("Cachorro", 4);        
    }

    @Override
    public void andar() {
        //andre +2 na posição x
        this.alterarPosicao(+2, 0);
        System.out.println(getNome()+ " andou 2 posições em x.");
    }

    @Override
    public void fazerBarulho(){
        super.fazerBarulho();
        System.out.println("Auuuuuu ...... Auuuuuu");
    }
    
}
