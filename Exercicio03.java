package tarefa08;

import java.util.Iterator;

public class Exercicio03 {

	public static void main(String[] args) {

		for (int contador = 0; contador <= 500; contador++) {
			if (contador % 2 == 0) {
				System.out.println(contador+contador);
			}
		}
	}
}