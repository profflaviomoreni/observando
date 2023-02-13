package br.com.fiap.observando.service;

import java.util.Observable;
import java.util.Random;

public class DolarService extends Observable {

	
	private double cotacaoDolarReal;

	
	public double getCotacaoDolarReal() {
		return cotacaoDolarReal;
	}
	

	public void calcularDolarVersusReal() {
		Random rand = new Random(); 
		this.cotacaoDolarReal = 5 + rand.nextDouble();
		
		setChanged();
		notifyObservers();
	}
	
	
	
	
	
}
