package br.edu.iftm.classefinal.classes;

public final class Matematica {

    public double somar(double... valores){
        double resultado = 0;        
        for (double valor : valores) {
            resultado += valor;
        }
        return resultado;
    }
    
    public int somar(int... valores){
        int resultado = 0;
        for (int valor : valores) {
            resultado += valor;
        }
        return resultado;
    }
    //assinatura de metodo - nome e os parametros

    //multiplicar, int, int
    public int multiplicar(int valorA, int valorB){
        System.out.println("Multiplicação de inteiros");
        return valorA*valorB;
    }

    //mutiplicar, float, int
    public float multiplicar(float valorC, int valorD){
        return 0F;
    }

    //multiplicar, int, float
    public float multiplicar(int valorC, float valorD){
        return 0F;
    }

    //multiplicar, float, float 
    public float multiplicar(float valorA, float valorB){
        System.out.println("Multiplicação de floats");
        return valorA*valorB;
    }

    //multiplicar, double, double
    public double multiplicar(double valorA, double valorB){
        System.out.println("Multiplicação de doubles");
        return valorA*valorB;
    }
}
