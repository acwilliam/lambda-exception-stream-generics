package unidade3;

public class UsoGenerico {

	public static void main(String[] args) {
		
		ExemploGenericos<Integer> inteiroObj = new ExemploGenericos<Integer>(88);
		inteiroObj.showType();
		
		ExemploGenericos<String> stringObj = new ExemploGenericos<String>("William");
		stringObj.showType();

	}

}
