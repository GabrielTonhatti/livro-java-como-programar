package cap04;

import javax.swing.JFrame;

public class DrawPanelBTest {

	public static void main(String[] args) {
		
		DrawPanelB painel = new DrawPanelB();
		
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(painel);
		application.setSize(500, 500);
		application.setVisible(true);

	}
}
