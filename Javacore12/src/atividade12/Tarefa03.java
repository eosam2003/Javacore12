package atividade12;
import java.util.Scanner;

public class Tarefa03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String id = scanner.next();

        boolean resultado = isPalindrome(id);
        System.out.println("O nome é um palíndromo? " + resultado);

        scanner.close();
    }

    public static boolean isPalindrome(String id) {
        int i = 0, j = id.length() - 1;

        while (i < j) {
            if (id.charAt(i) != id.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}