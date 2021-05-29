package br.edu.iftm.classeabstrata.animais;

public class PatinhoDeBorracha extends Animal{

    public PatinhoDeBorracha() {
        super("Patinho de Borracha", 2);        
    }

    @Override
    public void andar() {
        System.out.println("O patinho não anda sem ajuda de outro animal");
        
    }
    
}
