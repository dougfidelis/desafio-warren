import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Desafio3 {
	
	
	/*
	 * PROGRAMA NÃO FINALIZADO 
	 * 
	 */

	public static void main(String[] args) {

		int n = 0;
		ArrayList<Integer> lista = new ArrayList<>();
		ArrayList<Integer> principal = new ArrayList<>();
		int sair = 1;
		int num = -1;

		Scanner scanner = new Scanner(System.in);

		
		System.out.printf("Informe o número principal: ");
		n = scanner.nextInt();
		while (sair != 0) {
			System.out.println("");
			System.out.printf("Informe um número de 1 a " + n + " para adicionar ao vetor, ou 0 para encerrar.");
			num = scanner.nextInt();

			if (num != 0 && num <= n && !lista.contains(num)) {
				lista.add(num);
			} else if (lista.contains(num)) {
				System.out.println("Número repetido");
			} else if (num == 0) {
				sair = num;
			} else {
				System.out.println("Número inválido");
			}
		}

		Collections.sort(lista, Collections.reverseOrder());

		System.out.println("Melhores combinações alcançadas nesta versão do programa:");
		System.out.println("");

		int soma = 0;
		int resto = 0;
		for (int i = 0; i < lista.size(); i++) {
			ArrayList<Integer> combinacao = new ArrayList<>();
			soma = lista.get(i);
			resto = n - soma;
			combinacao.add(soma);

			if (lista.contains(resto)) {
				combinacao.add(resto);
			}

			int somaCobinacao = 0;
			for (int j = 0; j < combinacao.size(); j++) {
				somaCobinacao += combinacao.get(j);
			}
			if (somaCobinacao == n) {
				System.out.println(combinacao);
				System.out.println("");
			}
		}
		

	}
}
