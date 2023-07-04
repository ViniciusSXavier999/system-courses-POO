package br.com.vx.system.courses.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;

	/*
	 * Já aqui o nosso xp vai funcionar que ao concluir um curso, vamos pegar a
	 * cargaHoraria desse curso e multiplicar pelo xp padrao que se inicia com 10
	 */

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo = " + getTitulo() + ", descricao = " + getDescricao() + ", cargaHoraria = " + cargaHoraria
				+ "]";
	}

}
