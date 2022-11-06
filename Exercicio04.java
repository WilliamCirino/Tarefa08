package tarefa08;
/* 4) Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar se o número é ímpar, efetuar dentro da 
malha a verificação lógica desta condição com a instrução se, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo 
passo.*/

public class Exercicio04 {

	public static void main(String[] args) {
		for (int contador = 0; contador <= 20; contador++) {
			if (contador % 2 != 0) {
				System.out.println(contador);
			}
		}

	}

}
