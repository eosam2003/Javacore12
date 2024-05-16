package atividade12;
public class Tarefa01 {
public static void main(String[] args) {
int numero = 32;
	System.out.println("O número " + numero + " é primo? " + isPrime(numero));
}
public static boolean isPrime(int numero) {
	if (numero <= 1) {return false;}

	for (int i = 2; i < numero; i++) {
		if (numero % i == 0) {
			return false;
}}
	return true;
}}
