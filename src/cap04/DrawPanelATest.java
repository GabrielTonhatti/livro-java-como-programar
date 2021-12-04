package cap04;

import javax.swing.JFrame;

public class DrawPanelATest {

	public static void main(String[] args) {
		
		DrawPanelA painel = new DrawPanelA();
		
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(painel);
		application.setSize(250, 250);
		application.setVisible(true);

	}
}
