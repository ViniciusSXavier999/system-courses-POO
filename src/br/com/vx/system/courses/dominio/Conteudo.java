package br.com.vx.system.courses.dominio;

/*
 * Todo bootcamp vai ter conteudos, curso e mentoria s�o conteudos por isso criamos
 * essa classe m�e para utilizar como classe m�e das classes curso e mentoria
 * */

// classe abstract nao pode ser instanciada
public abstract class Conteudo {
	
	/*Aqui estamos criando uma constante, ent�o eu quero dizer que todo conteudo 
	 * ser� criado com um XP padr�o*/
	
	/*
	 * static -> vou poder acessar esse xp padr�o fora da minha classe conteudo
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
