package br.com.vx.system.courses.dominio;

/*
 * Todo bootcamp vai ter conteudos, curso e mentoria são conteudos por isso criamos
 * essa classe mãe para utilizar como classe mãe das classes curso e mentoria
 * */

// classe abstract nao pode ser instanciada
public abstract class Conteudo {
	
	/*Aqui estamos criando uma constante, então eu quero dizer que todo conteudo 
	 * será criado com um XP padrão*/
	
	/*
	 * static -> vou poder acessar esse xp padrão fora da minha classe conteudo
	 * */	
	protected static final double XP_PADRAO = 10;
	
	
	private String titulo;
	private String descricao;

	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
