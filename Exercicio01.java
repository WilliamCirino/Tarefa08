package tarefa08;
//1) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número para obter sua tabuada");

		int numero = sc.nextInt();

		for (int contador = 0; contador < 11; contador++) {
			System.out.println(numero+"x"+contador+"="+numero * contador);
		}
		sc.close();
	}
}