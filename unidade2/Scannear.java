package unidade2;

import java.util.Scanner;

public class Scannear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double n1 = sc.nextDouble();
		System.out.println("Digite a segunda nota");
		double n2 = sc.nextDouble();
		System.out.println("Digite a terceira nota");
		double n3 = sc.nextDouble();
		System.out.println("Digite a Quarta nota");
		double n4 = sc.nextDouble();
		
		double media = (n1+n2+n3+n4) / 4;
		
		System.out.println(String.format("A media � %.2f", media));
		

	}

}
