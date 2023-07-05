package br.com.vx.system.courses.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Php");
		curso2.setDescricao("Descrição Curso Php");
		curso2.setCargaHoraria(12);
		
		/*Aqui vamos aplicar o conceito de polimorfismo, eu não posso criar um conteudo 
		 * porque ele é uma classe abstract, mas eu posso instanciar um objeto curso a partir
		 * da minha classe conteudo*/
		
		/*Basicamente o que estou dizendo aqui é que tudo que tem em conteudo tem em curso
		 * mas nem tudo que tem em curso tem em conteudo*/
		
		// Conteudo conteudo = new Curso();
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de java");
		mentoria1.setDescricao("Descrição mentoria java");
		mentoria1.setData(LocalDate.now());
		
	 /*	System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);*/
		
		// CRIANDO O BOOTCAMP
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		
		// CRIANDO O DEV
		Dev devVini = new Dev();
		devVini.setNome("Vinicius");
		devVini.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos " + devVini.getConteudoInscritos());
		
		// quando eu concluir um curso, eles automaticamente serão removidos de conteudosInscritos
		devVini.progredir();
		devVini.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos " + devVini.getConteudoInscritos());
		System.out.println("Conteudos Concluidos " + devVini.getConteudosConcluidos());
		System.out.println("XP: " + devVini.calcularTotalXp());
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos " + devJoao.getConteudoInscritos());
		
		
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		/*Se progredir mais que a quantidade de conteudo será exibido um erro*/
	//	devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritoa -> " + devJoao.getConteudoInscritos());
		System.out.println("Conteudos Concluidos " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
	}

}
