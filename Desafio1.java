public class Desafio1 {

	public static void main(String[] args) {

		// Faz a contagem dos numeros válidos
		int contador = 0;

		// Faz a verificação de cada número de 0 a 1 milhão.
		for (int i = 0; i < 1000000; i++) {

			int n = i;
			int reversoN = 0;
			int soma = 0;

			// Gera reverso(n)
			while (n > 0) {
				reversoN = reversoN * 10 + n % 10;
				n /= 10;
			}
			/*
			 * Filtragem de numeros terminados em zero (só faz a soma se n não terminar em
			 * zero)
			 */
			String num = String.valueOf(i);
			if (!num.endsWith("0")) {
				soma = i + reversoN;
			}
			/*
			 * Filtragem da soma. Se todos números da soma forem ímpares o contador
			 * incrementa, e o sistema impime os resultados
			 */
			char[] charSoma = String.valueOf(soma).toCharArray();
			boolean impar = false;
			for (int j = 0; j < charSoma.length; j++) {
				impar = charSoma[j] % 2 != 0;
				if (impar == false) {
					break;
				}
			}
			if (impar) {
				contador++;
				System.out.println(i + " + " + reversoN + " = " + soma);
			}
		}
		System.out.println(contador);
	}
}
