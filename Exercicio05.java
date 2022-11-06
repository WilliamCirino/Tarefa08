package tarefa08;

public class Exercicio05 {

	public static void main(String[] args) {
		int num = 0, soma = 0, fatorial = 0;

		while (num < 16) {

			fatorial = num * (num - 1);

			soma = fatorial + soma;

			num += 1;

		}
		System.out.println(soma);
	}
}