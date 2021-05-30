package br.edu.iftm.classeabstrata.testes;

import br.edu.iftm.classefinal.classes.Matematica;

public class MatematicaTeste {
   public static void main(String[] args) {
       Matematica matematica = new Matematica();
       Matematica calculo2 =  new Matematica();
       System.out.println(matematica.somar(10, 20, 5, 0, -1));
       System.out.println(calculo2.somar(10, 20, 5, 0, -3));

       System.out.println(matematica.somar(1.5, 10, 30.9, 0.21));

       int valorA = 10;
       int valorB = 5;   
       System.out.println(matematica.multiplicar(valorA, valorB));

       float valorC = 15;
       float valorD = 30;
       System.out.println(matematica.multiplicar(valorC, valorD));

       double valorE = 15;
       double valorF = 30;
       System.out.println(matematica.multiplicar(valorE, valorF));

   } 
}
