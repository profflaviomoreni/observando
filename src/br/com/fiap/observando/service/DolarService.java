package br.com.fiap.observando.service;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Random;

public class DolarService {

	
	PropertyChangeSupport pcs = new  PropertyChangeSupport(this);
	
	private double cotacaoDolarReal;

	
	public double getCotacaoDolarReal() {
		return cotacaoDolarReal;
	}
	

	public void calcularDolarVersusReal() {
		Random rand = new Random(); 
		this.cotacaoDolarReal = 5 + rand.nextDouble();
		
		pcs.firePropertyChange(
					"VALOR_DOLAR_REAL", 
					null, 
					Double.valueOf(cotacaoDolarReal));
	}
	
	
    public void addObserver(PropertyChangeListener pcl) {
        pcs.addPropertyChangeListener("VALOR_DOLAR_REAL", pcl);
	}
	
	
	
	
}
