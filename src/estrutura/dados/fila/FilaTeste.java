package estrutura.dados.fila;

public class FilaTeste {
	
	public static void main(String[] args) {
		Fila fila = new Fila();
		int elemento;
		 
		fila.inserir(123);
		fila.inserir(13);
		fila.inserir(93);
		fila.inserir(43);
		fila.inserir(198);
		fila.inserir(155);
		fila.inserir(177);
		fila.inserir(663);
		fila.inserir(53);
		fila.inserir(169);

		while (!fila.isEmpty()) {
			elemento = fila.retirar();
			System.out.println(elemento);
		}
		
	}
}
