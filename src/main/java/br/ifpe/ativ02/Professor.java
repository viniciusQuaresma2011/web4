package br.ifpe.ativ02;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="VQD_Professor")
public class Professor extends Pessoa {
	
	@Column
	private LocalDate dataAdmissao;
	@Column
	private AreaConhecimento areaConhecimento;
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public AreaConhecimento getAreaConhecimento() {
		return areaConhecimento;
	}
	public void setAreaConhecimento(AreaConhecimento areaConhecimento) {
		this.areaConhecimento = areaConhecimento;
	}

	
	
}
