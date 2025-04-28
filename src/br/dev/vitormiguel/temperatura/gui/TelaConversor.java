package br.dev.vitormiguel.temperatura.gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.vitormiguel.temperatura.model.Temperatura;

public class TelaConversor {

	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;

	public void criarTelaConversor() {

		JFrame tela = new JFrame();

		Dimension tamanho = new Dimension();
		tamanho.setSize(520, 450);
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);

		labelCelsius = new JLabel();
		labelCelsius.setFont(null);
		labelCelsius.setForeground(null);
		labelCelsius.setText("Temperatura em graus celsius:");
		labelCelsius.setBounds(20, 30, 170, 30);

		textCelsius = new JTextField();
		textCelsius.setHorizontalAlignment(JTextField.CENTER);
		textCelsius.setBounds(20, 60, 470, 30);

		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("Fahreinheit");
		buttonFahreinheit.setBounds(20, 110, 225, 40);

		buttonKelvin = new JButton();
		buttonKelvin.setText("Kelvin");
		buttonKelvin.setBounds(265, 110, 225, 40);

		labelResultado = new JLabel();
		labelResultado.setBounds(213, 170, 225, 40);

		labelMensagemErro = new JLabel();

		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);

		buttonKelvin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					Temperatura temperatura = new Temperatura();
					double celsius = Double.parseDouble(textCelsius.getText());
					temperatura.setCelsius(celsius);
					double kelvin = temperatura.converterParaKelvin();
					labelResultado.setText(kelvin + " Kelvin");
					
				} catch (Exception ex) {
					labelMensagemErro.setText("Insira números");
					
				}
			}
		});

		buttonFahreinheit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					Temperatura temperatura = new Temperatura();
					double celsius = Double.parseDouble(textCelsius.getText());
					temperatura.setCelsius(celsius);
					double fahreinheit = temperatura.converterParaFahreinheit();
					labelResultado.setText(fahreinheit + " Fahreinheit");
					
				} catch (Exception ex) {
					// TODO: handle exception
				}
			}
		});

		tela.setVisible(true);
	}

}
