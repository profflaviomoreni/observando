package br.com.fiap.observando.view;

public class TelaTabletView {

	
	private double cotacaoDolarReal;
	
	private String labelCotacaoDolarReal;

	public TelaTabletView() {
		super();
	}

	public TelaTabletView(double cotacaoDolarReal) {
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
		labelCotacaoDolarReal = "Tela do Tablet: R$ " +  cotacaoDolarReal;
		System.out.println(labelCotacaoDolarReal);
		return labelCotacaoDolarReal;
	}


	
	
	
	
	
	
}
