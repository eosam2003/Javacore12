package atividade12;
public class Tarefa07 {
public static void main(String[] args) {


int ano = 2024;
boolean isBissexto = verificarAnoBissexto(ano);
System.out.println("O ano " + ano + " é bissexto? " + isBissexto);
}

public static boolean verificarAnoBissexto(int ano) {
		if (ano % 4 != 0) {
			return false;
		} else if (ano % 100 != 0) {
			return true;
		} else if (ano % 400 != 0) {
			return false;
		} else {
			return true;
}}}