package atividade12;

public class Tarefa05 {
public static void main(String[] args) {

	String str = "Palmeira Campeão Paulista";
	String reversedStr = reverseString(str);
	System.out.println("String original: " + str);
	System.out.println("String invertida: " + reversedStr);
}

public static String reverseString(String str) {
	return new StringBuilder(str).reverse().toString();
}
}