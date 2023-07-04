package br.com.vx.system.courses.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
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
	
	/*automaticamente quando um dev se inscrever no bootcamp, os conteudos desse bootcamp
	 * deve ir para o meu atributo conteudoInscritos*/
	public void inscreverBootcamp(Bootcamp bootcamp) {
		/*Estou pegando tudo que tem no meu bootcamp.getconteudos e adicionando no 
		 * conteudoInscritos através do método addAll.*/
		this.conteudoInscritos.addAll(bootcamp.getConteudos());
		
		// Dizendo que o dev esta matriculado no bootcamp
		/*Aqui estou adicionando o dev através da nomenclatura THIS.*/
		bootcamp.getDevsInscritos().add(this);
	}
	
	/*a medida que eu for progredindo no bootcamp eu vou ter conteudos concluidos.*/
	
	/*A lógica diz o seguinte -> eu tenho que pegar tudo que eu tenho nos meus 
	 * conteudosInscritos e colocar dentro do conteudosConcluidos*/
	public void progredir() {
		
		/*nessa primeira linha eu estou buscando pelo primeiro conteudo que tem 
		 * dentro do meu conteudoInscritos através do método findFirst que esta presente
		 * na API stream()*/
		Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
		/*aqui estou dizendo o seguinte -> SE esse conteudo existe dentro da minha lista
		 * conteudosInscritos eu vou pegar o primeiro.*/
		if (conteudo.isPresent()) {
			
			/*SE existir eu vou referenciar através do THIS e colocar dentro da minha
			 * lista conteudosConcluidos, e logo em seguida vou remover da lista 
			 * conteudoInscritos*/
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudoInscritos.remove(conteudo.get());
		} else {
			System.err.println("Você não esta matriculado em nenhum conteudo!!");
		}
	}

	
	/*vamos pegar o set de conteudosConcluido e vamos utilizar o stream e vou pegar cada
	 * conteudo de dentro do meu conteudosConcluidos que é um set, depois vou pegar o xp de 
	 * cada conteudo e vou somar através do método sum()*/
	public double calcularTotalXp() {
		return this.conteudosConcluidos
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp())
				.sum();
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
