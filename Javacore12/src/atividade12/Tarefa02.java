package atividade12;
public class Tarefa02 {
public static void main(String[] args) {

int num = 7;
System.out.println("O fatorial de " + num + " é: " + fatorial(num));
}

public static float fatorial(int num) {
	float result = 1;
	for (int i = 2; i <= num; i++) {
		result *= i;
	}
	return result;
}
}
