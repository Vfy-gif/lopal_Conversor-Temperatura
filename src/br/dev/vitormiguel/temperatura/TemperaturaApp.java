package br.dev.vitormiguel.temperatura;

import br.dev.vitormiguel.temperatura.gui.TelaConversor;

// Classe principal "TemperaturaApp" essa classe é responsável por iniciar o sistema
public class TemperaturaApp {

// Objeto estático responsável por iniciar a criação da tela
	public static void main(String[] args) {
		
// Atributos que iniciam a criação da tela
		TelaConversor tela = new TelaConversor();
		tela.criarTelaConversor();
		
	}
}
