package br.ifpe.ativ01;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name ="vqd_Cidade")
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	
	@Column(length = 50)
	@Size(max = 50, message ="O nome só pode conter no maximo 50 caracteres")
	@NotEmpty(message = "o campo nome não pode estar vazio, favor preencher.")
	private String nome;
	
	@Column
	private UF uf;
	
	@OneToOne(mappedBy = "cidade")
	private Endereco endereco;
	
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
	public UF getUf() {
		return uf;
	}
	public void setUf(UF uf) {
		this.uf = uf;
	}
	
	
}
