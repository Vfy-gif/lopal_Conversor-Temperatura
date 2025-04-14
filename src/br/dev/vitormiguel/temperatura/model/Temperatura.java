package br.dev.vitormiguel.temperatura.model;

public class Temperatura {

	private double celsius;
	
	public double getCelsius() {
		return celsius;
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double converterParaKelvin() {
		double resultadoKelvin = celsius + 273;
		return resultadoKelvin;
	}
	
	public double converterParaFahreinheit() {
		double resultadoFahreinheit = (celsius * 9/5) + 32;
		return resultadoFahreinheit;
	}
	
}
