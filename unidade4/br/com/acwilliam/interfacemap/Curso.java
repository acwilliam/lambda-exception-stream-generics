package unidade4.br.com.acwilliam.interfacemap;

import java.nio.file.Path;

public class Curso {
	Integer cdCurso;
	String nome;
	float valor;
	Path url;
	
	public Curso(Integer cdCurso, String nome, float valor, Path url) {
		super();
		this.cdCurso = cdCurso;
		this.nome = nome;
		this.valor = valor;
		this.url = url;
	}

	public Integer getCdCurso() {
		return cdCurso;
	}

	public void setCdCurso(Integer cdCurso) {
		this.cdCurso = cdCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Path getUrl() {
		return url;
	}

	public void setUrl(Path url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", valor=" + valor + "]";
	}


	
	
	
	
}
