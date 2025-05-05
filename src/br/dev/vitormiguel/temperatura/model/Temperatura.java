package br.dev.vitormiguel.temperatura.model;

// Classe pública "Temperatura" que armazena as informações dos celsius e como transformar em kelvin ou fahreinheit
public class Temperatura {

// Objeto privado que irá conter o valor dos graus celsius inseridos pelo usuário
	private double celsius;
	
// Objeto público que irá pegar o valor do objeto celsius e retornar 
	public double getCelsius() {
		return celsius;
	}

// Objeto público que irá modificar o atributo "celsius" sem retornar, por uma variável "celsius"
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
// Objeto público "double" que armazena como será feito a transformação de celsius para Kelvin, por uma variável "resultadoKelvin"
	public double converterParaKelvin() {
		double resultadoKelvin = celsius + 273;
		return resultadoKelvin;
	}

	// Objeto público "double" que armazena como será feito a transformação de celsius para Fahreinheit, por uma variável "resultadoFahreinheit"
	public double converterParaFahreinheit() {
		double resultadoFahreinheit = (celsius * 9 / 5) + 32;
		return resultadoFahreinheit;
	}

}
