package atividade12;

public class Tarefa09 {
public static void main(String[] args) {

    int lado1 = 4;
    int lado2 = 8;
    int lado3 = 12;
    boolean isTriangulo = verificarTriangulo(lado1, lado2, lado3);
    System.out.println("Os números " + lado1 + ", " + lado2 + ", " + lado3 + " podem formar um triângulo? " + isTriangulo);
}

public static boolean verificarTriangulo(int lado1, int lado2, int lado3) {
    return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
}

}