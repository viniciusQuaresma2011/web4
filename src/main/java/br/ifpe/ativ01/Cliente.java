package br.ifpe.ativ01;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name ="VQD_Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	@Column
	private String nome;
	
	@Column
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dataNascimento;
	
	@OneToOne(mappedBy = "cliente")
	private Endereco endereco;
	
	@Column
	private boolean adimplente;
	
	@Column
	private Mes mesRenovacao;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public boolean isAdimplente() {
		return adimplente;
	}
	public void setAdimplente(boolean adimplente) {
		this.adimplente = adimplente;
	}
	public Mes getMesRenovacao() {
		return mesRenovacao;
	}
	public void setMesRenovacao(Mes mesRenovacao) {
		this.mesRenovacao = mesRenovacao;
	}

	
}
