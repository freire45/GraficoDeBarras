package br.com.erickfreire.graficodebarras;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Programa em Java que desenha gráfico de barras
 * @author Erick Freire
 * @version 1 - Criado em 18-04-2021 as 14:50
 */

public class GraficoDeBarras extends JPanel {
	
	private int numero1;
	private int numero2;
	private int numero3;
	private int numero4;
	private int numero5;
	
	
	public GraficoDeBarras(int numero1, int numero2, int numero3, int numero4, int numero5) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
		this.numero4 = numero4;
		this.numero5 = numero5;
	}


	public void paintComponent(Graphics g) {
		
		g.drawRect(5, 140, 10, -numero1 * 2);
		g.drawRect(25, 140, 10, -numero2 * 2);
		g.drawRect(45, 140, 10, -numero3 * 2);
		g.drawRect(65, 140, 10, -numero4 * 2);
		g.drawRect(85, 140, 10, -numero5 * 2);
		
	}

}
