package cap04;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanelB extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		int width = getWidth() / 2;
		int height = getHeight() / 2;

		for (int i = 20; i < 1800; i += 20) {
			// g.drawLine(x1, y1, x2, y2);

			// Cria a linha da ponta superior esquerda para o meio se separando
			g.drawLine(0, 0, width, height);
			g.drawLine(0, 0, width - i, height + i);
			g.drawLine(0, 0, width + i, height - i);

			// Cria a linha da ponta inferior direita para o meio se separando
			g.drawLine(width, height, width * 2, height * 2);
			g.drawLine(width - i, height + i, width * 2, height * 2);
			g.drawLine(width + i, height - i, width * 2, height * 2);

			// Cria a linha da ponta superor direita para o meio se separando
			g.drawLine(width, height, width * 2, 0);
			g.drawLine(width + i, height + i, width * 2, 0);
			g.drawLine(width - i, height - i, width * 2, 0);

			// Cria a linha da ponta inferior esquerda para o meio se separando
			g.drawLine(0, height * 2, width, height);
			g.drawLine(0, height * 2, width - i, height - i);
			g.drawLine(0, height * 2, width + i, height + i);
		}

	}

}
