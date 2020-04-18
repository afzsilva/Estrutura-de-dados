package estrutura.dados.pilhas;
/**
 * Caracteristica da pilha: 
 * 
 * LIFO - Last In, First Out
 * Ultimo elemento que entra, primeiro que sai.
 * 
 * @author afzs
 *
 */
public class Pilha {

	private int valores[];
	private int topo;

	Pilha() {
		valores = new int[10]; // inicializa o limite de elementos na pilha
		topo = -1; // inicia o topo da pilha com uma posição invalida
	}

	/**
	 * Remove o elemento no topo da pilha	 * 
	 * @param elemento int
	 */
	public void push(int elemento) {
		topo += 1;
		valores[topo] = elemento;

	}

	/** 
	 * @return true se a pilha estiver vazia
	 */
	public boolean isEmpty() {
		return topo == -1;
	}

	/** 
	 * @return true se a pilha estiver cheia
	 */
	public boolean isFull() {
		return topo == valores.length - 1;
	}

	/**
	 * Remove um elemento do topo da pilha	 * 
	 * @return int
	 */
	public int pop() {
		int elemento = valores[topo];
		topo--;
		return elemento;
	}

}
