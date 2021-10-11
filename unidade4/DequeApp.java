package unidade4;

import java.util.*;

public class DequeApp {

	public static void main(String[] args) {
	
		Deque<String> lista = new ArrayDeque<>();
		lista.add("Vermelho");
		lista.add("Verde");
		lista.add("Verde");
		lista.add("Amarelo");
		System.out.println(lista);
		lista.removeFirst();
		System.out.println(lista);
		lista.removeLast();
		System.out.println(lista.peekFirst());
		System.out.println(lista.peekLast());
	}

}
