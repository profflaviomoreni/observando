package br.com.fiap.observando.view;

public class DolarCotacaoView {

	
	private double cotacaoDolarReal;
	
	private String labelCotacaoDolarReal;

	public DolarCotacaoView() {
		super();
	}

	public DolarCotacaoView(double cotacaoDolarReal) {
		super();
		this.cotacaoDolarReal = cotacaoDolarReal;
	}

	public double getCotacaoDolarReal() {
		return cotacaoDolarReal;
	}

	public void setCotacaoDolarReal(double cotacaoDolarReal) {
		this.cotacaoDolarReal = cotacaoDolarReal;
	}

	public String exibirCotacaoDolarReal() {
		labelCotacaoDolarReal = "Tela do Cotação: R$ " +  cotacaoDolarReal;
		System.out.println(labelCotacaoDolarReal);
		return labelCotacaoDolarReal;
	}


	
	
	
	
	
	
}
