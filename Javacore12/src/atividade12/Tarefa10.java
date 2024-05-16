package atividade12;
public class Tarefa10 {
public static void main(String[] args) {
    float valor1 = 3.0f;
    float valor2 = 4.0f;
    float valor3 = 5.0f;
    float peso1 = 2.0f;
    float peso2 = 3.0f;
    float peso3 = 5.0f;
    float mediaPonderada = calcularMediaPonderada(valor1, valor2, valor3, peso1, peso2, peso3);
    System.out.println("A média ponderada é: " + mediaPonderada);
}

public static float calcularMediaPonderada(float valor1, float valor2, float valor3, float peso1, float peso2, float peso3) {
	float somaPesos = peso1 + peso2 + peso3;
	float somaValoresPonderados = valor1 * peso1 + valor2 * peso2 + valor3 * peso3;
    return somaValoresPonderados / somaPesos;
}
}
