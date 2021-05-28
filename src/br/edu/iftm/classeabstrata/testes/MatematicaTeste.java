package br.edu.iftm.classeabstrata.testes;

import br.edu.iftm.classefinal.classes.Matematica;
import br.edu.iftm.classefinal.classes.calculo2;

public class MatematicaTeste {
    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        calculo2 calculo2 = new calculo2();
        System.out.println(matematica.somar(10, 20, 5, 0, -1));
        System.out.println(calculo2.somar(10, 20, 5, 0, -3));
    }
}
