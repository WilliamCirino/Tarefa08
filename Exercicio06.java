package tarefa08;

import java.util.Scanner;

/* 6) Elaborar um programa que apresente como resultado o valor de uma potência de uma base qualquer elevada a um expoente qualquer, ou seja, 
de BE, em que B é o valor da base e E o valor do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do 
portuguol (^).*/
public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 0;
		int soma = 0;
		int numero = 0;

		while (numero >= 0) {
			System.out.println("Digite um número");

			numero = sc.nextInt();

			if (numero > 0) {
				contador++;
				soma += numero;
			}

		}

		int media = soma / contador;

		System.out.println("Total de valores lidos: " + contador);
		System.out.println("Total da soma: " + soma);
		System.out.println("Total da média: " + media);
		sc.close();
	}
}
