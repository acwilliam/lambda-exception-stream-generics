package unidade4;

import java.util.HashSet;

public class HashSetApp {

	public static void main(String[] args) {
		//uma lista do tipo HashSet devolve resultados unicos da lista
		HashSet<String> lista = new HashSet<>();
		lista.add("Vermelho");
		lista.add("Verde");
		lista.add("Verde");
		lista.add("Amarelo");
		System.out.println(lista);

	}

}
