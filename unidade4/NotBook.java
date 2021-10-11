package unidade4;

import java.util.ArrayList;

public class NotBook {
	
	static ArrayList<String> anotacoes;
	
	public static void main(String[] args) {
		
		anotacoes = new ArrayList<>();
		anotacoes.add("Comprar pao");
		anotacoes.add("Vender carro");
		anotacoes.add("Encontro as 11h30");
		
		double t1 = System.currentTimeMillis();
		
		for(int i = 3; i<1003; i++) {
			anotacoes.add("Texto_" + i);
			
			double t2 = System.currentTimeMillis();
			System.out.println((t2-t1)/1000);
			System.out.println(anotacoes);
			
		}

	}

}
