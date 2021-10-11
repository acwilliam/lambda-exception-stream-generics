package unidade1;

import java.util.Scanner;

public class Calculadora {

	public  void dividir(int n1,int n2) {
		 
			System.out.println(n1/n2);
	}
	
	public static void main(String[] args) throws ArithmeticException, DivisaoZeroException{
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		int n1 = entrada.nextInt();
		System.out.println("Digite o segundo valor");
		int n2 = entrada.nextInt();
		
		Calculadora calculadora = new Calculadora();
		try {
		calculadora.dividir(n1, n2);
		}catch(ArithmeticException e) {
			throw new DivisaoZeroException("Erro divisao por zero");
			
		}
	 
	}

}
