package cap03;

import javax.swing.JOptionPane;

public class NameDialog {
	
	public static void main(String[] args) {
		
		// Pede para o usuário inserir seu nome
		String name = JOptionPane.showInputDialog("What is your name?");
		
		// Cria a mensagem
		String message = String.format("Welcome, %s, to Java Programming", name);
		
		// Exibe a mensagem para cumprimentar o usuário pelo nome
		JOptionPane.showMessageDialog(null, message);
	}

}
