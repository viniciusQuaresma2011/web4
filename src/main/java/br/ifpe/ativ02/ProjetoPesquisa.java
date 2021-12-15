package br.ifpe.ativ02;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name ="VQD_ProjetoPesquisa")
public class ProjetoPesquisa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	@Column(length = 100)
	@NotEmpty(message = "Favor preencher o titulo!!!")
	@Size(max = 100, message ="O titulo so pode conter 100 caracteres")
	private String titulo;
	
	@Column(length = 1000)
	@NotEmpty(message = "Favor preencher o resumo!!!")
	@Size(max = 1000, message="O resumo so pode conter 1000 caracteres")
	private String resumo;
	
	@Column
	private byte[] arquivoPDF;
	@ManyToOne
	private Professor responsavel;
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "projetoPesquisa_responsavel", 
        joinColumns = { @JoinColumn(name = "codigo_Aluno_pk") }, 
        inverseJoinColumns = { @JoinColumn(name = "codigo_ProjetoPesquisa_pk") }
    )
	@Size(min =2)
	private List<Aluno> colaboradores;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public byte[] getArquivoPDF() {
		return arquivoPDF;
	}
	public void setArquivoPDF(byte[] arquivoPDF) {
		this.arquivoPDF = arquivoPDF;
	}
	public Professor getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Professor responsavel) {
		this.responsavel = responsavel;
	}
	public List<Aluno> getColaboradores() {
		return colaboradores;
	}
	public void setColaboradores(List<Aluno> colaboradores) {
		this.colaboradores = colaboradores;
	} 
	
	
}
