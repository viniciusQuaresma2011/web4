package br.ifpe.ativ02;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name ="VQD_Aluno")
public class Aluno extends Pessoa {
	
	@ManyToOne(cascade=CascadeType.ALL)
	@NotEmpty(message = "Favor selecionar o curso!!!")
	private Curso curso;
	
	
	@Column
	@Size(min = 2000 , max = 2020)
	private Integer anoIngresso;
	@Column
	private double coeficienteRendimento;
	@Column
	private SituacaoMatricula situacaoMatricula;
	
	@ManyToMany(mappedBy = "colaboradores")
	private List<ProjetoPesquisa> projetos;
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Integer getAnoIngresso() {
		return anoIngresso;
	}
	public void setAnoIngresso(Integer anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	public double getCoeficienteRendimento() {
		return coeficienteRendimento;
	}
	public void setCoeficienteRendimento(double coeficienteRendimento) {
		this.coeficienteRendimento = coeficienteRendimento;
	}
	public SituacaoMatricula getSituacaoMatricula() {
		return situacaoMatricula;
	}
	public void setSituacaoMatricula(SituacaoMatricula situacaoMatricula) {
		this.situacaoMatricula = situacaoMatricula;
	}
	
}
