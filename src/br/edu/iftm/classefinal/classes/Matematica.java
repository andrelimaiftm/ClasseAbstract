package br.edu.iftm.classefinal.classes;

public final class Matematica {

    public int somar(int... valores){
        int resultado = 0;
        for (int valor : valores) {
            resultado += valor;
        }
        return resultado;
    }
    
}
