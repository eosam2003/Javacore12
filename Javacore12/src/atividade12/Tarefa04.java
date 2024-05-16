package atividade12;
import java.util.List;
public class Tarefa04 {
	
    public static void main(String[] args) {
        List<Float> numeros = List.of(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f);
        float media = calcularMedia(numeros);
        System.out.println("A média é: " + media);
    }

    public static float calcularMedia(List<Float> numeros) {
        float soma = 0.0f;
        for (Float numero : numeros) {
            soma += numero;
        }
        return soma / numeros.size();
    }
}