package br.com.fiap.observando.view;

import java.util.Observable;
import java.util.Observer;

import br.com.fiap.observando.service.DolarService;

public class DolarCotacaoView implements Observer {

	
	Observable dolarService;
	
	private double cotacaoDolarReal;
	
	private String labelCotacaoDolarReal;

	public DolarCotacaoView(Observable dolarServiceObservable) {
		this.dolarService = dolarServiceObservable;
		dolarServiceObservable.addObserver(this);
	}


	@Override
	public void update(Observable dolarServiceSubject, Object argumento) {
		if ( dolarServiceSubject instanceof DolarService ) {
			DolarService dolarService = (DolarService) dolarServiceSubject;
			setCotacaoDolarReal(dolarService.getCotacaoDolarReal());
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
