
public class Criptomoeda {
	
	String nome;
	int anoLancamento;
	String provaDeTrabalho;
	Boolean legalidade;
	
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getProvaDeTrabalho() {
		return provaDeTrabalho;
	}

	public void setProvaDeTrabalho(String provaDeTrabalho) {
		this.provaDeTrabalho = provaDeTrabalho;
	}

	public Boolean getLegalidade() {
		return legalidade;
	}

	public void setLegalidade(Boolean legalidade) {
		this.legalidade = legalidade;
	}
	
	public Criptomoeda(String nome, int anoLancamento, String provaDeTrabalho, Boolean legalidade) {
		this.nome = nome;
		this.anoLancamento = anoLancamento;
		this.provaDeTrabalho = provaDeTrabalho;
		this.legalidade = legalidade;
	}
	
	
	public static void main(String[] args) {
		
		Criptomoeda blockChain = new Criptomoeda("BlockChain", 2009, "CryptoNight ", true);
		Criptomoeda ethereum = new Criptomoeda("Ethereum", 2015, "Blake  ", true);
		Criptomoeda zcash = new Criptomoeda("Zcash", 2016, "SHA-3 ", true);
		
		System.out.println("A ano de lançamento da Blockchain é:" + blockChain.getAnoLancamento());
		System.out.println("A provad e taabalho da Blockchain é:" + blockChain.getProvaDeTrabalho());
		
		System.out.println("A ano de lançamento da Ethereum é:" + ethereum.getAnoLancamento());
		System.out.println("A provad e taabalho da Ethereum é:" + ethereum.getProvaDeTrabalho()); 
		
		System.out.println("A ano de lançamento da Zcash é:" + zcash.getAnoLancamento());
		System.out.println("A provad e taabalho da Zcash é:" + zcash.getProvaDeTrabalho()); 



	}
	
	

}
