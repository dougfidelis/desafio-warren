import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {

		int limite = 0, normal = 0, atrasado = 0, aluno = 1, opcao = 0;

		Scanner scanner = new Scanner(System.in);
		
		//Início do programa - Solicita o número mínimo de alunos pontuais.
		System.out.printf("Informe o limite mínimo de alunos pontuais: ");
		limite = scanner.nextInt();
		System.out.println("");
		
		//Solicita a condição de chegada do aluno ou o encerramento da chamada através da opção (3).
		while (opcao != 1) {			
			System.out.printf("Informe a condição de chegada do "+aluno+"°"+" aluno: \n (1) - Na hora certa ou adiantado. \n (2) - Atrasado. \n (3) - Encerrar chamada. \n");
			switch (scanner.nextInt()) {
			case 1:
				normal++;
				aluno++;
				break;
			case 2:
				atrasado++;
				aluno++;
				break;
			case 3:
				System.out.println("Chamada encerrada!");
				opcao++;
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
			/* Verifica se o limite mínimo foi alcançado antes do usuário encerrar a chamada.
			 * Quando o limite mínimo é alcançado, o sistema encerra a chamada. 
			 */
			if(normal >= limite) {
				System.out.println("Limite mínimo alcançado!");
				opcao++;
			}
			System.out.println("");
		}
		scanner.close();
		//Verifica se a aula será normal ou cancelada, e imprime os dados.
		if (normal >= limite) {
			System.out.println("Aula normal!");
		} else {
			System.out.println("Aula cancelada!");
		}
		System.out.println("");
		System.out.println("Liminte mínimo: "+ limite);
		System.out.println("Total de alunos: "+(normal+atrasado));
		System.out.println("Pontuais: "+ normal);
		System.out.println("Atrasados: "+ atrasado);
		System.out.println("");

	}

}
