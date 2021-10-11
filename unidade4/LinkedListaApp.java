package unidade4;

import java.util.LinkedList;

public class LinkedListaApp {
	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<>();
		lista.add("Vermelho");
		lista.add("Verde");
		lista.add("Verde");
		lista.add("Amarelo");
		System.out.println(lista);
		lista.removeFirst();
		System.out.println(lista);
		lista.removeLast();
		System.out.println(lista);
	}
}
