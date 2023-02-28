import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaPrincipal {

	public static void main(String[] args) {
	
		//JOptionPane.showInputDialog("Digite o valor que deseja converter");
		
		JFrame minhaTela = new JFrame();
		minhaTela.setSize(600, 200);
		minhaTela.setLayout(new FlowLayout());
		minhaTela.setLocationRelativeTo(null);
		
		
		JButton botaoConverter = new JButton("Converter");
		JButton botaoDesconverter = new JButton("Desconverter");
		minhaTela.add(botaoConverter);
		minhaTela.add(botaoDesconverter);
		
		minhaTela.setVisible(true);
	}
}
