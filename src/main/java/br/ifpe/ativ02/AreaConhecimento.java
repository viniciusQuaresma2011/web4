package br.ifpe.ativ02;

public enum AreaConhecimento {

	LINGUAGENS("Linguagens"), 
	MATEMATICA("Matemática"),
	CIENCIAS_DA_NATUREZA("Ciências da Natureza"), 
	CIENCIAS_HUMANAS("Ciências Humanas");
	
	@SuppressWarnings("unused")
	private final String nomeExibicao;
	
	AreaConhecimento(String valor){
		this.nomeExibicao = valor;
	}
}
