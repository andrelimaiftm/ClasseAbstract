package br.edu.iftm.classeabstrata.testes;

import br.edu.iftm.classeabstrata.animais.Cachorro;
import br.edu.iftm.classeabstrata.animais.Cavalo;

public class AnimalTeste {
    public static void main(String[] args) {
        // Animal animal = new Animal("cachorro", 4);
        Cachorro cachorro = new Cachorro();
        cachorro.andar();
        System.out.println(cachorro);
        cachorro.fazerBarulho();

        Cavalo cavalo = new Cavalo();
        cavalo.andar();
        cavalo.andar();
        System.out.println(cavalo);
        cavalo.fazerBarulho();
        System.out.println(cavalo);
    }
}
