package atividade12;
public class Tarefa08 {
public static void main(String[] args) {

    int base = 15;
    int expoente = 3;
    int resultado = calcularPotencia(base, expoente);
    System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
}

public static int calcularPotencia(int base, int expoente) {
    int resultado = 1;
    for (int i = 0; i < expoente; i++) {
        resultado *= base;
    }
    return resultado;
}}