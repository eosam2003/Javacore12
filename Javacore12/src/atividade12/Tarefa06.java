package atividade12;

public class Tarefa06 {
public static void main(String[] args) {

    String numvogal = "Ola Flamingo";
    int contar = contarVogais(numvogal);
    System.out.println("Número de vogais na string: " + contar);
}

public static int contarVogais(String str) {
    int contar = 0;
    String vogais = "aeiouAEIOU";
    for (int i = 0; i < str.length(); i++) {
        if (vogais.indexOf(str.charAt(i)) != -1) {
            contar++;
}}
    return contar;
}}