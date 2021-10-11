package unidade2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerApp {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scEntrada = new Scanner(new FileReader("C:/Users/William Carvalho/Documents/numeros.txt"));
		double soma =0;
		String valor;
		
		while(scEntrada.hasNext()) {
			valor = scEntrada.next();
			soma = soma + Double.parseDouble(valor);
		}
		JOptionPane.showMessageDialog(null, "A soma dos valores encontrados" + soma);

	}

}
