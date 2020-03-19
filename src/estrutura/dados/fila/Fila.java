package estrutura.dados.fila;
/**
 * Caracteristica da fila:
 * firs in, first out  
 * Primeiro elemento que entra na fila primeiro elemento que saida da fila
 * @author afzs
 *
 */
public class Fila {
	
	private int[] valores;
	private int inicio;
	private int fim;
	private int total;
	
	public Fila() {		
		valores = new int[10];
		inicio = 0;
		fim = 0;
		total = 0;
	}
	
	public void inserir(int elemento) {
		valores[fim] = elemento;
		fim += 1;
				
		if(fim == valores.length) {
			fim = 0;
		}
		
		total++;
	}
	
	public int retirar() {
		int elemento = valores[inicio];
		inicio+=1;
		inicio = (inicio + 1) % valores.length;//Forma menos verbosa de implementação		
		total--;
		return elemento;
	}
	
	
	public boolean isEmpty() {
		return total == 0;
	}
	
	public boolean isFull() {
		return fim == valores.length;
	}
	
	
	
	

}
