package br.edu.iftm.classeabstrata.testes;

import br.edu.iftm.classefinal.classes.Matematica;

public class MatematicaTeste {
   public static void main(String[] args) {
       Matematica matematica = new Matematica();
       Matematica calculo2 =  new Matematica();
       System.out.println(matematica.somar(10, 20, 5, 0, -1));
       System.out.println(calculo2.somar(10, 20, 5, 0, -3));
   } 
}
