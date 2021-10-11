package unidade4.br.com.acwilliam.interfacemap;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LojaVirtual {
	
	static Map<Cliente, List<Curso>>pagamentos = new HashMap<>();
	
	static void listarCursos(List<Curso> lista) {
		lista.forEach(p -> System.out.println(p.getCdCurso()+"<=>"+p.getNome()));
	}
	
	public static void main(String[] args) {
		
		//Criar cursos que estão disponiveis no site para vendas
		Curso java8 = new Curso(1, "Java 8", 2000, Paths.get("/java8"));
		Curso spring = new Curso(2, "Curso Spring", 1000, Paths.get("/cursospring"));
		Curso Kafka = new Curso(3, "Curso Kafka", 2300, Paths.get("/kafka"));
		Curso Oracle = new Curso(4, "Curso Oracle", 3423, Paths.get("/oracle"));
		
		
		//Cadastrar o cliente
		Cliente william = new Cliente("123.456.789-00", "William Carvalho", "acwilliammsn@gmail.com");
		
		
		
		
		//Criar a lista de cursos do cliente
		List<Curso> cursosDoWilliam = new LinkedList<>();
		
		
		//Checkout dos cursos escolhidos
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		
		while(opcao != 5) {
			System.out.println("Qual curso deja adquirir: [1=Java 8],[2 = Spring],[3=Kafka],[4=Oracle],[5=Finalizar compra]");
			opcao = sc.nextInt();
			
			if(opcao ==1) 
				cursosDoWilliam.add(java8);
			else if(opcao==2) 
				cursosDoWilliam.add(spring);
			else if(opcao==3) 
				cursosDoWilliam.add(Kafka);
			else if(opcao==4) 
				cursosDoWilliam.add(Oracle);
			else
				opcao=5;
		}
		sc.close();
		pagamentos.put(william, cursosDoWilliam);
	//	System.out.println(pagamentos);
		listarCursos(cursosDoWilliam);
		
		
		
	}

}
