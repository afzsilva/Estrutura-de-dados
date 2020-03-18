package estrutura.dados.pilhas;

public class Conversor {

	public static void main(String[] args) {
		// ENTRADA
		int numero = 172;

		Pilha pilha = new Pilha(); // pilha para armazenar os resultados
		int resto = 0;

		// ARMAZENA RESULTADOS NA PILHA
		while (numero != 0) {
			resto = numero % 2; // pega o resto da divisão
			pilha.push(resto); // Coloca o resto na pilha
			numero = numero / 2; // faz a divisão para iniciar um novo ciclo

		}

		// MOSTRA OS RESULTADOS ARMAZENADOS NA PILHA
		while (!pilha.isEmpty()) {
			resto = pilha.pop();
			System.out.print(resto);
		}

	}
}
