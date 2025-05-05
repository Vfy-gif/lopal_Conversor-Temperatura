package br.dev.vitormiguel.temperatura.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.vitormiguel.temperatura.model.Temperatura;

// Classe pública "TelaConversor" que irá possuir a interface do sistema
public class TelaConversor {

// Definição de variáveis a seus objetos
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	
// Objeto que define a cor e uma variável
	private Color cor = new Color(255, 0, 0);
	
// Objeto que define a fonte,tamanho e uma variável
	private Font font = new Font(null, 0, 28);

// Objeto público responsável por criar a tela e conter seus elementos
	public void criarTelaConversor() {

// Atributo responsável por criar a "tela" por uma variável
		JFrame tela = new JFrame();

// Atributo responsável por criar o tamanho da tela por uma variável
		Dimension tamanho = new Dimension();

// Atributo que define o tamanho da tela
		tamanho.setSize(520, 450);

// Atributo que dá o "tamanho" a "tela"
		tela.setSize(tamanho);

// Atributo responsável por finalizar o programa totalmente ao o usuário clicar no "x" botão de fechar
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Atributo que dá o nome, o "Título", palavra ou frase que ficará na parte superior da tela
		tela.setTitle("Conversor");

// Atributo responsável para definir o "layout", que no nosso caso, desabilitamos o "layout" padrão ao colocar "null"
		tela.setLayout(null);

// Atributo responsável por definir a posição da tela, que no nosso caso, como é centralizado, está "null
		tela.setLocationRelativeTo(null);

// Atributo responsável por tornar a tela redimensionavel que, no caso, desabilitamos o redimensionamento
		tela.setResizable(false);

// Atributo responsável por criar o texto que ficará na tela
		labelCelsius = new JLabel();

// Atributo que define a fonte e tamanho do texto, que no nosso caso, será a padrão
		labelCelsius.setFont(null);

// Atributo que definir o cor do texto, que no nosso caso, será a padrão
		labelCelsius.setForeground(null);

// Atributo que define o texto que será colocado na tela
		labelCelsius.setText("Temperatura em graus celsius:");

// Atributo que define a posição do texto
		labelCelsius.setBounds(20, 30, 170, 30);

// Atributo que apresenta o campo de texto, onde o usuário poderá digitar a informação dos celsius
		textCelsius = new JTextField();

// Atributo que define a posição do texto digitado, que no nosso caso é centralizado
		textCelsius.setHorizontalAlignment(JTextField.CENTER);

// Atributo que define a posição de onde fica o campo de texto "A caixa para digitar"
		textCelsius.setBounds(20, 60, 470, 30);

// Atributo responsável por criar o botão para a conversão em Fahreinheit
		buttonFahreinheit = new JButton();

// Atributo que contém o texto do botão
		buttonFahreinheit.setText("Fahreinheit");

// Atributo que contém a posição do botão
		buttonFahreinheit.setBounds(20, 110, 225, 40);

// Atributo responsável por criar o botão para a conversão em Kelvin
		buttonKelvin = new JButton();

// Atributo que contém o texto do botão
		buttonKelvin.setText("Kelvin");

// Atributo que contém a posição do botão
		buttonKelvin.setBounds(265, 110, 225, 40);

// Atributo que irá conter o resultado em kelvin ou em fahreinheit
		labelResultado = new JLabel();

// Atributo que posiciona esse "resultado"
		labelResultado.setBounds(135, 170, 300, 40);

// Atributo que definir o cor do texto, que no nosso caso, será a padrão
		labelResultado.setForeground(null);
		
// Atributo que define a fonte e tamanho do texto, que no nosso caso, usamos para aumentar o tamanho do texto
		labelResultado.setFont(font);

// Atributo que contém a "mensagem de erro"
		labelMensagemErro = new JLabel();
		
// Atributo que posiciona essa "mensagem de erro"
		labelMensagemErro.setBounds(120, 170, 300, 40);
		
// Atributo que definir o cor do texto, que no nosso caso, utilizamos para definir a cor vermelha a esse texto 
		labelMensagemErro.setForeground(cor);
		
// Atributo que define a fonte e tamanho do texto, que no nosso caso, usamos para aumentar o tamanho do texto
		labelMensagemErro.setFont(font);

//Metodo que adiciona o "labelCelsius" a tela com todas as suas informações
		tela.getContentPane().add(labelCelsius);
		
//Metodo que adiciona o "textCelsius" a tela com todas as suas informações
		tela.getContentPane().add(textCelsius);
		
//Metodo que adiciona o "buttonFahreinheit" a tela com todas as suas informações
		tela.getContentPane().add(buttonFahreinheit);
		
//Metodo que adiciona o "buttonKelvin" a tela com todas as suas informações
		tela.getContentPane().add(buttonKelvin);
		
//Metodo que adiciona o "labelResultado" a tela com todas as suas informações
		tela.getContentPane().add(labelResultado);
		
//Metodo que adiciona o "labelMensagemErro" a tela com todas as suas informações
		tela.getContentPane().add(labelMensagemErro);

//Metodo que adiciona função ao botão Kelvin
		buttonKelvin.addActionListener(new ActionListener() {

			@Override
			
//Código que define o método e recebe o objeto "ActionEvent e" como parâmetro 
			public void actionPerformed(ActionEvent e) {
				
// O atributo "try" como o próprio nome diz, ele irá tentar utilizar as informações a seguir
				try {

//Atributo cria a variável "temperatura"
					Temperatura temperatura = new Temperatura();
					
//Atributo através de uma variável ele recebe a informação convertida de double para double dada pelo textCelsius
					double celsius = Double.parseDouble(textCelsius.getText());
					
//Atributo pega a informação da temperatura em celsius e passa para a variável "temperatura"
					temperatura.setCelsius(celsius);
					
//Atributo pega a informação da temperatura pela variável "temperatura" e converte para kelvin pelo objeto "converterParaKelvin()"
					double kelvin = temperatura.converterParaKelvin();
					
//Atributo pega a informação dada pela variável "kelvin" e entrega ao "labelResultado" onde exibirá a conversão ao usuário
					labelResultado.setText(kelvin + " Kelvin");
					
//Atributo limpa a mensagem de erro exibida pelo "labelMensagemErro"
					labelMensagemErro.setText(null);

// O atributo "catch" como o próprio nome diz, ele irá pegar as informações que o "try" não conseguir realizar
				} catch (Exception ex) {
					
//Atributo exibe a mensagem de erro ao usuário
					labelMensagemErro.setText("Insira apenas números");
				
//Atributo limpa a mensagem de erro exibida pelo "labelResultado"
					labelResultado.setText(null);
				}
			}
		});

//Metodo que adiciona função ao botão Kelvin
		buttonFahreinheit.addActionListener(new ActionListener() {

			@Override
			
//Código que define o método e recebe o objeto "ActionEvent e" como parâmetro 
			public void actionPerformed(ActionEvent e) {
				
// O atributo "try" como o próprio nome diz, ele irá tentar utilizar as informações a seguir
				try {

//Atributo cria a variável "temperatura"
					Temperatura temperatura = new Temperatura();
					
//Atributo através de uma variável ele recebe a informação convertida de double para double dada pelo textCelsius
					double celsius = Double.parseDouble(textCelsius.getText());
					
//Atributo pega a informação da temperatura em celsius e passa para a variável "temperatura"
					temperatura.setCelsius(celsius);
					
//Atributo pega a informação da temperatura pela variável "temperatura" e converte para fahreinheit pelo objeto "converterParaFahreinheit()"
					double fahreinheit = temperatura.converterParaFahreinheit();
					
//Atributo exibe a mensagem de erro ao usuário
					labelResultado.setText(fahreinheit + " Fahreinheit");
					
//Atributo limpa a mensagem de erro exibida pelo "labelMensagemErro"
					labelMensagemErro.setText(null);

// O atributo "catch" como o próprio nome diz, ele irá pegar as informações que o "try" não conseguir realizar
				} catch (Exception ex) {
					
//Atributo exibe a mensagem de erro ao usuário
					labelMensagemErro.setText("Insira apenas números");
					
//Atributo limpa a mensagem de erro exibida pelo "labelResultado"
					labelResultado.setText(null);
				}
			}
		});

//Atributo torna a tela visivel
		tela.setVisible(true);
	}

}
