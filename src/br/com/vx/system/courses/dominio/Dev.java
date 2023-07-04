package br.com.vx.system.courses.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
	
	private String nome;
	
	/*NÃO ESTOU UTILIZANDO ARRAYLIST PORQUE NÃO QUERO REPETIR CONTEUDOS*/
	
	/*estou usando o linkedhashset porque eu quero que os conteudos apareça de 
	 * maneira organizada*/
	private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();

	/*tambem quero que apareça na ordem na medida que eu vou completando os cursos*/
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	/*Isso quer dizer que quando eu chamar esse método eu vou passar um bootcamp para
	 * me inscrever*/
	public void inscreverBootcamp(Bootcamp bootcamp) {
		
	}
	
	/*a medida que eu for progredindo no bootcamp eu vou ter conteudos concluidos.*/
	public void progredir() {
		
	}
	
	public void calcularTotalXp() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscritos() {
		return conteudoInscritos;
	}

	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.conteudoInscritos = conteudoInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudoInscritos, conteudosConcluidos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoInscritos, other.conteudoInscritos)
				&& Objects.equals(conteudosConcluidos, other.conteudosConcluidos) && Objects.equals(nome, other.nome);
	}
	
	
}
