package br.com.fiap.observando.view;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class DolarCotacaoView implements PropertyChangeListener {


	private double cotacaoDolarReal;
	private String labelCotacaoDolarReal;

	public DolarCotacaoView() {
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if ( evt.getPropertyName().equals("VALOR_DOLAR_REAL") ) {
			final Double valorDouble = (Double) evt.getNewValue();
			setCotacaoDolarReal(valorDouble.doubleValue());
			exibirCotacaoDolarReal();
		}
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
