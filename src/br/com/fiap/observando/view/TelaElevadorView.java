package br.com.fiap.observando.view;

public class TelaElevadorView {

	
	private double cotacaoDolarReal;
	
	private String labelCotacaoDolarReal;

	public TelaElevadorView() {
		super();
	}

	public TelaElevadorView(double cotacaoDolarReal) {
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
		labelCotacaoDolarReal = "Tela do Elevador: R$ " +  cotacaoDolarReal;
		System.out.println(labelCotacaoDolarReal);
		return labelCotacaoDolarReal;
	}


	
	
	
	
	
	
}
