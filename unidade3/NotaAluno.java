package unidade3;

public class NotaAluno {

	
	double valor;
	
	<T extends Number>NotaAluno(T obj){//construtor generico
		valor = obj.doubleValue();
	}
	
	<T extends Number>double retornarValor(T obj) {//metodo generico
		return obj.doubleValue();
	}
	
}
