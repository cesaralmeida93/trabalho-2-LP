
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
		
		System.out.println("A ano de lan�amento da Blockchain �:" + blockChain.getAnoLancamento());
		System.out.println("A provad e taabalho da Blockchain �:" + blockChain.getProvaDeTrabalho());
		
		System.out.println("A ano de lan�amento da Ethereum �:" + ethereum.getAnoLancamento());
		System.out.println("A provad e taabalho da Ethereum �:" + ethereum.getProvaDeTrabalho()); 
		
		System.out.println("A ano de lan�amento da Zcash �:" + zcash.getAnoLancamento());
		System.out.println("A provad e taabalho da Zcash �:" + zcash.getProvaDeTrabalho()); 



	}
	
	

}
