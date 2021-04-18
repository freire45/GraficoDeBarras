package br.com.erickfreire.graficodebarras;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GraficoDeBarrasTeste {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Programa que desenha gráficos: ");
		
		String n1 = JOptionPane.showInputDialog("Digite o primeiro valor entre 1 e 30: ");
		int numero1 = Integer.parseInt(n1);
		
		while(numero1 < 1 || numero1 >30){
			n1 = JOptionPane.showInputDialog("Números incorreto - Digite o primeiro valor entre 1 e 30: ");
			numero1 = Integer.parseInt(n1);
		}
		
		String n2 = JOptionPane.showInputDialog("Digite o segundo valor entre 1 e 30: ");
		int numero2 = Integer.parseInt(n2);
		
		while(numero2 < 1 || numero2 >30){
			n2 = JOptionPane.showInputDialog("Números incorreto - Digite o segundo valor entre 1 e 30: ");
			numero2 = Integer.parseInt(n2);
		}
		
		String n3 = JOptionPane.showInputDialog("Digite o terceiro valor entre 1 e 30: ");
		int numero3 = Integer.parseInt(n3);
		
		while(numero3 < 1 || numero3 >30){
			n3 = JOptionPane.showInputDialog("Números incorreto - Digite o terceiro valor entre 1 e 30: ");
			numero3 = Integer.parseInt(n3);
		}
		
		String n4 = JOptionPane.showInputDialog("Digite o Quarto valor entre 1 e 30: ");
		int numero4 = Integer.parseInt(n4);
		
		while(numero4 < 1 || numero4 >30){
			n4 = JOptionPane.showInputDialog("Números incorreto - Digite o Quarto valor entre 1 e 30: ");
			numero4 = Integer.parseInt(n4);
		}
		
		String n5 = JOptionPane.showInputDialog("Digite o quinto valor entre 1 e 30: ");
		int numero5 = Integer.parseInt(n5);
		
		while(numero5 < 1 || numero5 >30){
			n5 = JOptionPane.showInputDialog("Números incorreto - Digite o quinto valor entre 1 e 30: ");
			numero5 = Integer.parseInt(n5);
		}
		
		
		
		GraficoDeBarras painel = new GraficoDeBarras(numero1, numero2, numero3, numero4, numero5);
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(painel);
		aplicacao.setSize(300,300);
		aplicacao.setVisible(true);
	}

}
