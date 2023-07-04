package br.com.vx.system.courses.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	
	// nome do bootcamp
	private String nome;
	
	private String descricao;
	
	// aqui estou dizendo a data atual do bootcamp quando eu instanciar ele ja vai criar essa data.
	private final LocalDate dataInicial = LocalDate.now();
	
	/*A data final vai ser a minha data inicial mais 45 dias*/
	private final LocalDate dataFinal = dataInicial.plusDays(45);
	
	/*Aqui estou dizendo que não havera devs repetidos no meu bootcamp, por isso
	 * estou utilizando a interface set */
	private Set<Dev> devsInscritos = new LinkedHashSet<>();
	
	// iniciei um linked a partir do tipo set
	/*Aqui vão ser os cursos e mentoria que faz parte desse bootcamp*/
	private Set<Conteudo> conteudos = new LinkedHashSet<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}

	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInicial, descricao, devsInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicial, other.dataInicial) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devsInscritos, other.devsInscritos) && Objects.equals(nome, other.nome);
	}
	

	
}
